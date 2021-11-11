CREATE OR REPLACE VIEW V_WORK_IN_PROC_LST
	(PLANT_CD, WORK_ODR_CD, PROC_NO, WORK_IN_PROC_CD, PROC_NAME, WORK_ODR_DLV_DATE, 
	OPR_INST_START_DATE, OPR_INST_CD, PUCH_ODR_CD, OPR_INST_DATE, 
	OPR_INST_SLIP_ISS_DATE, OPR_INST_QTY, SUM_ACPT_QTY, SUM_DEFECT_QTY, 
	STOCK_UNIT, WORK_STS_TYP, WORK_STS_NAME, WORK_CMPLT_DATE, 
	ITEM_CD, ITEM_NAME, DRAW_CD, SPEC, MRP_ODR_TYP, JOB_ODR_CD, JOB_ODR_CANCEL_NO, 
	OPR_RSLT_TYP, OUTSIDE_TYP, ACPT_INSPC_TYP, WS_CD, WS_NAME, VEND_CD, 
	VEND_ANAME,TABLE_NAME,OPR_INST_SLIP_ISS_FLG,WORK_STATUS) 
AS 
select 
		T_WORK_IN_PROC_BY_ITEM.PLANT_CD,			--  5.[�i�ڕʎd�|].�H��R�[�h
		T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD,			--  6.[�i�ڕʎd�|].��ƌv��ԍ�
		null as PROC_NO,							--  7.�d�|��ƌn��ԍ�(NULL)
		null as WORK_IN_PROC_CD,					--  8.�d�|��ƃR�[�h(NULL)
		null as PROC_NAME,							--  9.�d�|��Ɩ�(NULL)
		T_WORK_IN_PROC_BY_ITEM.WORK_ODR_DLV_DATE,	-- 10.[�i�ڕʎd�|].��Ɛ����[��
		T_WORK_IN_PROC_BY_ITEM.OPR_INST_START_DATE,	-- 11.[�i�ڕʎd�|].��Ɛ��������
		T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD,			-- 12.[�i�ڕʎd�|].��Ǝw���ԍ�
		null as PUCH_ODR_CD,						-- 13.�����ԍ�(NULL)
		T_WORK_IN_PROC_BY_ITEM.OPR_INST_DATE,		-- 14.[�i�ڕʎd�|].��Ǝw����
		T_OPR_INST_SLIP.OPR_INST_SLIP_ISS_DATE,		-- 15.[��Ǝw���`�[].��Ǝw���`�[���s��
		T_WORK_IN_PROC_BY_ITEM.OPR_INST_QTY,		-- 16.[�i�ڕʎd�|].��Ǝw����
		T_OPR_RSLT.SUM_ACPT_QTY,					-- 17.[��Ǝ���].�Ǖi�݌v��
		T_OPR_RSLT.SUM_DEFECT_QTY,					-- 18.[��Ǝ���].�s�Ǘ݌v��
		M_ITEM.STOCK_UNIT,							-- 19.[�i�ڂl].�v�ʒP��
		T_WORK_IN_PROC_BY_ITEM.WORK_STS_TYP,		-- �����Ŏg�p.��Ə�ԋ敪
		WORK_STS_TBL.DISPLAY_NAME as WORK_STS_NAME,	-- 20.[�i�ڕʎd�|].��Ə�ԋ敪��
		T_WORK_IN_PROC_BY_ITEM.WORK_CMPLT_DATE,		-- 21.[�i�ڕʎd�|].��Ɗ�����
		T_WORK_IN_PROC_BY_ITEM.ITEM_CD,				-- 22.[�i�ڕʎd�|].�i�ڔԍ�
		M_ITEM.ITEM_NAME,							-- 23.[�i�ڂl].�i�ږ�
		M_ITEM.DRAW_CD,								-- 24.[�i�ڂl].�}�ʔԍ�
		M_ITEM.SPEC,								-- 25.[�i�ڂl].�K�i
		MRP_ODR_TBL.VALUE as MRP_ODR_TYP,	-- 26.[���v��].�i�ڎ�z�敪
		T_OD.JOB_ODR_CD,							-- 27.[���v��].����
		T_OD.JOB_ODR_CANCEL_NO,						-- 28.[���v��].���Ԏ�������ԍ�
		OPR_RSLT_TBL.VALUE as OPR_RSLT_TYP,	-- �����Ŏg�p.�i�ڕʍ�Ǝ��ы敪
		OUTSIDE_TBL.VALUE as OUTSIDE_TYP,	-- 29.�d�|���O��敪
		null as ACPT_INSPC_TYP,						-- 30.��������敪
		T_WORK_IN_PROC_BY_ITEM.WS_CD,				-- 31.[�i�ڕʎd�|].��Ƌ�R�[�h
		M_WS.WS_NAME,								-- 32.[��Ƌ�].��Ƌ於
		null as VEND_CD,							-- 33.�����R�[�h
		null as VEND_ANAME,							-- 34.����旪��
		'T_WORK_IN_PROC_BY_ITEM' as TABLE_NAME,		-- 35.�i�ڕʎd�|�̃��R�[�h�ł��邱�Ƃ�\��
		T_OPR_INST_SLIP.OPR_INST_SLIP_ISS_FLG,
		(CASE  WHEN T_WORK_IN_PROC_BY_ITEM.WORK_STS_TYP = 1 THEN 1
		ELSE NULL END) AS WORK_STATUS				-- 36.�X�e�[�^�X�̔���
	from T_OPR_INST_SLIP, 			-- ��Ǝw���[
		T_WORK_IN_PROC_BY_ITEM, 	-- �i�ڕʎd�|
		M_ITEM, 					-- �i�ڂl
		T_OD, 						-- ���v��
		M_WS,						-- ��Ƌ�
		(select OPR_INST_CD, sum(nvl(ACPT_QTY, 0)) as SUM_ACPT_QTY, sum(nvl(DEFECT_QTY, 0)) as SUM_DEFECT_QTY
			 from T_OPR_RSLT group by OPR_INST_CD) T_OPR_RSLT,		-- ��Ǝ���
		(select VALUE, DISPLAY_NAME from SYS_TYPE_VALUE where NAME = 'WORK_STS_TYP') WORK_STS_TBL,
		(select VALUE, DISPLAY_NAME from SYS_TYPE_VALUE where NAME = 'MRP_ODR_TYP') MRP_ODR_TBL,
		(select VALUE, DISPLAY_NAME from SYS_TYPE_VALUE where NAME = 'OPR_RSLT_TYP' and VALUE = 1) OPR_RSLT_TBL,
		(select VALUE, DISPLAY_NAME from SYS_TYPE_VALUE where NAME = 'OUTSIDE_TYP' and VALUE = 1) OUTSIDE_TBL
	where MRP_ODR_TBL.VALUE(+) = T_OD.MRP_ODR_TYP
	 and  WORK_STS_TBL.VALUE(+) = T_WORK_IN_PROC_BY_ITEM.WORK_STS_TYP
	 and  T_WORK_IN_PROC_BY_ITEM.WS_CD = M_WS.WS_CD(+)
	 and  T_WORK_IN_PROC_BY_ITEM.OD_NO = T_OD.OD_NO(+)
	 and  T_WORK_IN_PROC_BY_ITEM.ITEM_CD = M_ITEM.ITEM_CD(+)
	 and  T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD = T_OPR_RSLT.OPR_INST_CD(+)
	 and  T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD = T_OPR_INST_SLIP.OPR_INST_CD(+)
	 and  T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP = 2			-- [�i�ڕʎd�|].�i�ڕʍ�Ǝ��ы敪=2:��Ǝw������
	 and  T_WORK_IN_PROC_BY_ITEM.PROC_EXPLOSION_FLG = 0		-- [�i�ڕʎd�|].��ƌn��W�J�ς݃t���O=0:���W�J
	 and  T_WORK_IN_PROC_BY_ITEM.OPR_RSLT_TYP <> 1			-- [�i�ڕʎd�|].�i�ڕʍ�Ǝ��ы敪<>1 
	UNION
	select 
		T_WORK_IN_PROC_BY_PROC.PLANT_CD,			--  5.[��ƌn��ʎd�|].�H��R�[�h
		T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD,			--  6.[��ƌn��ʎd�|].��ƌv��ԍ�
		T_WORK_IN_PROC_BY_PROC.PROC_NO,				--  7.[��ƌn��ʎd�|].�d�|��ƌn��ԍ�
		T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD,		--  8.[��ƌn��ʎd�|].�d�|��ƃR�[�h
		T_WORK_IN_PROC_BY_PROC.PROC_NAME,			--  9.[��ƌn��ʎd�|].�d�|��Ɩ�
		T_WORK_IN_PROC_BY_PROC.WORK_ODR_DLV_DATE,	-- 10.[��ƌn��ʎd�|].��ƌn��ʐ����[��
		T_WORK_IN_PROC_BY_PROC.OPR_INST_START_DATE,	-- 11.[��ƌn��ʎd�|].��ƌn��ʐ��������
		T_WORK_IN_PROC_BY_PROC.OPR_INST_CD,			-- 12.[��ƌn��ʎd�|].��Ǝw���ԍ�
		T_RLSD_PUCH_ODR.PUCH_ODR_CD,				-- 13.[�����c].�����ԍ�
		T_WORK_IN_PROC_BY_PROC.OPR_INST_DATE,		-- 14.[��ƌn��ʎd�|].��Ǝw����
		T_OPR_INST_SLIP.OPR_INST_SLIP_ISS_DATE,		-- 15.[��Ǝw���`�[].��Ǝw���`�[���s��
		T_WORK_IN_PROC_BY_PROC.OPR_INST_QTY,		-- 16.[��ƌn��ʎd�|].��Ǝw����
		T_OPR_RSLT.SUM_ACPT_QTY,					-- 17.�Ǖi�݌v��
		T_OPR_RSLT.SUM_DEFECT_QTY,					-- 18.�s�Ǘ݌v��
		M_ITEM.STOCK_UNIT,							-- 19.[�i�ڂl].�v�ʒP��
		T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP,		-- �����Ŏg�p.��Ə�ԋ敪
		WORK_STS_TBL.DISPLAY_NAME as WORK_STS_NAME,	-- 20.[��ƌn��ʎd�|].��Ə�ԋ敪��
		T_WORK_IN_PROC_BY_PROC.WORK_CMPLT_DATE,		-- 21.[��ƌn��ʎd�|].��Ɗ�����
		T_WORK_IN_PROC_BY_PROC.ITEM_CD,				-- 22.[�i�ڂl].�i�ڔԍ�
		M_ITEM.ITEM_NAME,							-- 23.[�i�ڂl].�i�ږ�
		M_ITEM.DRAW_CD,								-- 24.[�i�ڂl].�}�ʔԍ�
		M_ITEM.SPEC,								-- 25.[�i�ڂl].�K�i
		MRP_ODR_TBL.VALUE as MRP_ODR_TYP,	-- 26.[���v��].�i�ڎ�z�敪
		T_OD.JOB_ODR_CD,							-- 27.[���v��].����
		T_OD.JOB_ODR_CANCEL_NO,						-- 28.[���v��].���Ԏ�������ԍ�
		OPR_RSLT_TBL.VALUE as OPR_RSLT_TYP,	-- �����Ŏg�p.�i�ڕʍ�Ǝ��ы敪
		OUTSIDE_TBL.VALUE as OUTSIDE_TYP,	-- 29.�d�|���O��敪
		decode(T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP,1,null,ACPT_INSPC_TBL.VALUE) as ACPT_INSPC_TYP,		-- 30.��������敪
		T_WORK_IN_PROC_BY_PROC.WS_CD,				-- 31.[��ƌn��ʎd�|].��Ƌ�R�[�h
		M_WS.WS_NAME,								-- 32.[��Ƌ�].��Ƌ於
		T_WORK_IN_PROC_BY_PROC.VEND_CD,				-- 33.[��ƌn��ʎd�|].�����R�[�h
		M_VEND_CTRL.VEND_ANAME,						-- 34.[�����].����旪��
		'T_WORK_IN_PROC_BY_PROC' as TABLE_NAME,		-- 35.��ƌn��ʎd�|�̃��R�[�h�ł��邱�Ƃ�\��
		T_OPR_INST_SLIP.OPR_INST_SLIP_ISS_FLG,
		(CASE  WHEN T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP = 1 THEN 2
			WHEN T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP = 2 AND T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP = 2 AND T_RLSD_PUCH_ODR.PUCH_ODR_STS_TYP = 2 AND T_RLSD_PUCH_ODR.PUCH_ODR_INST_SLIP_ISS_FLG = 0 AND T_RLSD_PUCH_ODR.ODR_CANCEL_SLIP_ISS_FLG = 0 AND T_ACPT_RSLT.PUCH_ODR_CD IS NULL THEN 3
			WHEN T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP = 2 AND T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP = 1 AND T_OPR_INST_SLIP.OPR_INST_SLIP_ISS_FLG =0 AND T_OPR_RSLT.OPR_INST_CD IS NULL THEN 3
			WHEN T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP = 2 AND T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP = 1 AND T_OPR_INST_SLIP.OPR_INST_SLIP_ISS_FLG = 1 AND T_OPR_RSLT.OPR_INST_CD IS NULL THEN 4
			WHEN T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP = 2 AND T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP = 1 AND T_OPR_RSLT.OPR_INST_CD IS NOT NULL THEN 5
			WHEN T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP = 9 THEN 6
		ELSE NULL END) AS WORK_STATUS				-- 36.�X�e�[�^�X�̔���
	from T_OPR_INST_SLIP, 			-- ��Ǝw���[
		T_WORK_IN_PROC_BY_PROC, 	-- ��ƌn��ʎd�|
		M_ITEM, 					-- �i�ڂl
		T_OD, 						-- ���v��
		M_WS,						-- ��Ƌ�
		M_VEND_CTRL,				-- �����l
		(select OPR_INST_CD, sum(nvl(ACPT_QTY,0)) as SUM_ACPT_QTY, sum(nvl(DEFECT_QTY, 0)) as SUM_DEFECT_QTY
			 from T_OPR_RSLT group by OPR_INST_CD) T_OPR_RSLT,		-- ��Ǝ���
		(select VALUE, DISPLAY_NAME from SYS_TYPE_VALUE where NAME = 'WORK_STS_TYP') WORK_STS_TBL,
		(select VALUE, DISPLAY_NAME from SYS_TYPE_VALUE where NAME = 'MRP_ODR_TYP') MRP_ODR_TBL,
		(select VALUE, DISPLAY_NAME from SYS_TYPE_VALUE where NAME = 'OPR_RSLT_TYP' and VALUE = 2) OPR_RSLT_TBL,
		(select VALUE, DISPLAY_NAME from SYS_TYPE_VALUE where NAME = 'OUTSIDE_TYP') OUTSIDE_TBL,
		(select VALUE, DISPLAY_NAME from SYS_TYPE_VALUE where NAME = 'ACPT_INSPC_TYP') ACPT_INSPC_TBL,
		T_RLSD_PUCH_ODR,			-- �����c
		T_ACPT_RSLT					-- �������
	where OUTSIDE_TBL.VALUE(+) = T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP
	 and  MRP_ODR_TBL.VALUE(+) = T_OD.MRP_ODR_TYP
	 and  WORK_STS_TBL.VALUE(+) = T_WORK_IN_PROC_BY_PROC.WORK_STS_TYP
	 and  ACPT_INSPC_TBL.VALUE(+) = T_WORK_IN_PROC_BY_PROC.ACPT_INSPC_TYP
	 and  T_WORK_IN_PROC_BY_PROC.VEND_CD = M_VEND_CTRL.VEND_CD(+)
	 and  T_WORK_IN_PROC_BY_PROC.WS_CD = M_WS.WS_CD(+)
	 and  T_WORK_IN_PROC_BY_PROC.OD_NO = T_OD.OD_NO(+)
	 and  T_WORK_IN_PROC_BY_PROC.ITEM_CD = M_ITEM.ITEM_CD(+)
	 and  T_WORK_IN_PROC_BY_PROC.OPR_INST_CD = T_OPR_RSLT.OPR_INST_CD(+)
	 and  T_WORK_IN_PROC_BY_PROC.OPR_INST_CD = T_OPR_INST_SLIP.OPR_INST_CD(+)
	 and  T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD = T_RLSD_PUCH_ODR.WORK_ODR_CD(+)			-- [��ƌn��ʎd�|].��ƌv��ԍ� = [�����c].��ƌv��ԍ�
	 and  T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = T_RLSD_PUCH_ODR.WORK_IN_PROC_CD(+)	-- [��ƌn��ʎd�|].�d�|��ƃR�[�h = [�����c].�d�|��ƃR�[�h
   and  T_ACPT_RSLT.PUCH_ODR_CD(+) = T_RLSD_PUCH_ODR.PUCH_ODR_CD 
/

