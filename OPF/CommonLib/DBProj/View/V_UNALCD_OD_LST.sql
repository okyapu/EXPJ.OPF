CREATE OR REPLACE VIEW V_UNALCD_OD_LST
    (OD_NO,ALC_GRP_CD,PLANT_CD,ITEM_CD,PS_EDITION,JOB_ODR_CD,JOB_ODR_DETAIL_NO,
    JOB_ODR_CANCEL_NO,ODR_STS_TYP,DM_STS_TYP,OD_TYP,DUE_DATE,ODR_START_DATE,
    PRD_DUE_DATE,PRD_START_DATE,DM_QTY,ODR_QTY,SUM_OF_ALCD_QTY,NO_SPOIL_ODR_QTY,
    UNALCD_QTY,MRP_ODR_TYP,OUTSIDE_TYP,ISSUE_TYP,ODR_LT,FIXED_LT,PROP_LT,
    SAFETY_LT,ISSUE_LT,PROP_LOT_SIZE,PS_LT_FLG,PS_FIXED_LT,PS_PROP_LT,PS_PROP_LOT_SIZE,
    PS_UNIT_QTY,TOTAL_RCV_QTY,RCV_CMPLT_DATE,TOTAL_ISSUE_INST_QTY,TOTAL_ISSUE_QTY,
    ISSUE_CMPLT_DATE,OD_GNR_TYP,OD_LEVEL_NO,PARENT_OD_NO,ITEM_SPOIL,PS_SPOIL,
    CONS_TYP,EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,MRP_TYP,EXTERNAL_DM_FLG,
    ODR_RELEASE_FLG,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,
    UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT)
AS
(
	SELECT
		OD_NO,			/* �I�[�_�f�}���h�ԍ�	*/
		ALC_GRP_CD,		/* �����O���[�v�R�[�h	*/
		PLANT_CD,		/* �H��R�[�h	*/
		ITEM_CD,		/* �i�ڔԍ�	*/
		PS_EDITION,		/* ���v�ʕi�ڍ\���Ő�	*/
		JOB_ODR_CD,		/* ����	*/
		JOB_ODR_DETAIL_NO,	/* ���Ԏ}��	*/
		JOB_ODR_CANCEL_NO,	/* ���Ԏ�������ԍ�	*/
		ODR_STS_TYP,		/* �I�[�_��ԋ敪	*/
		DM_STS_TYP,		/* �f�}���h��ԋ敪	*/
		OD_TYP,			/* �I�[�_�f�}���h�敪	*/
		DUE_DATE,		/* �v���[��	*/
		ODR_START_DATE,		/* ��z�����	*/
		PRD_DUE_DATE,		/* �����[��	*/
		PRD_START_DATE,		/* ���������	*/
		DM_QTY,			/* �f�}���h��	*/
		ODR_QTY,		/* �I�[�_��	*/
		SUM_OF_ALCD_QTY,	/* �����ϐ�SUM	*/
		NO_SPOIL_ODR_QTY,
		UNALCD_QTY,
		MRP_ODR_TYP,		/* �i�ڎ�z�敪	*/
		OUTSIDE_TYP,		/* ���v�ʓ��O��敪	*/
		ISSUE_TYP,		/* ���v�ʏo�ɋ敪	*/
		ODR_LT,			/* ��z���[�h�^�C��	*/
		FIXED_LT,		/* �Œ蕪���[�h�^�C��	*/
		PROP_LT,		/* ��ᕪ���[�h�^�C��	*/
		SAFETY_LT,		/* ���S����	*/
		ISSUE_LT,		/* ���o���[�h�^�C��	*/
		PROP_LOT_SIZE,		/* ��ᕪ���b�g�T�C�Y	*/
		PS_LT_FLG,		/* ���i�\�����[�h�^�C���g�p�t���O	*/
		PS_FIXED_LT,		/* ���i�\���Œ蕪���[�h�^�C��	*/
		PS_PROP_LT,		/* ���i�\����ᕪ���[�h�^�C��	*/
		PS_PROP_LOT_SIZE,	/* ���i�\����ᕪ���b�g�T�C�Y	*/
		PS_UNIT_QTY,		/* ���i�\���P�ʐ�	*/
		TOTAL_RCV_QTY,		/* ���ɗ݌v��	*/
		RCV_CMPLT_DATE,		/* ���Ɋ�����	*/
		TOTAL_ISSUE_INST_QTY,	/* �o�Ɏw���݌v��	*/
		TOTAL_ISSUE_QTY,	/* �o�ɗ݌v��	*/
		ISSUE_CMPLT_DATE,	/* �o�Ɋ�����	*/
		OD_GNR_TYP,		/* ���v�ʔ��������敪	*/
		OD_LEVEL_NO,		/* ���v�ʃ��x���ԍ�	*/
		PARENT_OD_NO,		/* �e�I�[�_�f�}���h�ԍ�	*/
		ITEM_SPOIL,		/* ���v�ʕi�ڎd����	*/
		PS_SPOIL,		/* ���v�ʍ\���d����	*/
		CONS_TYP,		/* �\���x���敪	*/
		EFF_PHASE_IN_DATE,	/* ���v�ʗL���J�n��	*/
		EFF_PHASE_OUT_DATE,	/* ���v�ʗL���I����	*/
		MRP_TYP,		/* ���v�ʏ����敪	*/
		EXTERNAL_DM_FLG,	/* �O���f�}���h�t���O	*/
		ODR_RELEASE_FLG,	/* �I�[�_�����σt���O	*/
		CREATED_DATE,		/* �쐬��	*/
		CREATED_BY,		/* �쐬��	*/
		CREATED_PRG_NM,		/* �쐬�v���O������	*/
		UPDATED_DATE,		/* �X�V��	*/
		UPDATED_BY,		/* �X�V��	*/
		UPDATED_PRG_NM,		/* �X�V�v���O������	*/
		MODIFY_COUNT		/* �X�V��	*/
	FROM
		(
		SELECT
			OD_NO,					/* �I�[�_�f�}���h�ԍ�	*/
			ALC_GRP_CD,				/* �����O���[�v�R�[�h	*/
			PLANT_CD,				/* �H��R�[�h	*/
			ITEM_CD,				/* �i�ڔԍ�	*/
			PS_EDITION,				/* ���v�ʕi�ڍ\���Ő�	*/
			JOB_ODR_CD,				/* ����	*/
			JOB_ODR_DETAIL_NO,			/* ���Ԏ}��	*/
			JOB_ODR_CANCEL_NO,			/* ���Ԏ�������ԍ�	*/
			ODR_STS_TYP,				/* �I�[�_��ԋ敪	*/
			DM_STS_TYP,				/* �f�}���h��ԋ敪	*/
			OD_TYP,					/* �I�[�_�f�}���h�敪	*/
			DUE_DATE,				/* �v���[��	*/
			ODR_START_DATE,				/* ��z�����	*/
			PRD_DUE_DATE,				/* �����[��	*/
			PRD_START_DATE,				/* ���������	*/
			DM_QTY,					/* �f�}���h��	*/
			ODR_QTY,				/* �I�[�_��	*/
			SUM_OF_ALCD_QTY,			/* �����ϐ�SUM	*/
			NO_SPOIL_ODR_QTY,
			GREATEST( (DM_QTY-(SUM_OF_ALCD_QTY+NO_SPOIL_ODR_QTY)) , 0 )	UNALCD_QTY,
			MRP_ODR_TYP,				/* �i�ڎ�z�敪	*/
			OUTSIDE_TYP,				/* ���v�ʓ��O��敪	*/
			ISSUE_TYP,				/* ���v�ʏo�ɋ敪	*/
			ODR_LT,					/* ��z���[�h�^�C��	*/
			FIXED_LT,				/* �Œ蕪���[�h�^�C��	*/
			PROP_LT,				/* ��ᕪ���[�h�^�C��	*/
			SAFETY_LT,				/* ���S����	*/
			ISSUE_LT,				/* ���o���[�h�^�C��	*/
			PROP_LOT_SIZE,				/* ��ᕪ���b�g�T�C�Y	*/
			PS_LT_FLG,				/* ���i�\�����[�h�^�C���g�p�t���O	*/
			PS_FIXED_LT,				/* ���i�\���Œ蕪���[�h�^�C��	*/
			PS_PROP_LT,				/* ���i�\����ᕪ���[�h�^�C��	*/
			PS_PROP_LOT_SIZE,			/* ���i�\����ᕪ���b�g�T�C�Y	*/
			PS_UNIT_QTY,				/* ���i�\���P�ʐ�	*/
			TOTAL_RCV_QTY,				/* ���ɗ݌v��	*/
			RCV_CMPLT_DATE,				/* ���Ɋ�����	*/
			TOTAL_ISSUE_INST_QTY,			/* �o�Ɏw���݌v��	*/
			TOTAL_ISSUE_QTY,			/* �o�ɗ݌v��	*/
			ISSUE_CMPLT_DATE,			/* �o�Ɋ�����	*/
			OD_GNR_TYP,				/* ���v�ʔ��������敪	*/
			OD_LEVEL_NO,				/* ���v�ʃ��x���ԍ�	*/
			PARENT_OD_NO,				/* �e�I�[�_�f�}���h�ԍ�	*/
			ITEM_SPOIL,				/* ���v�ʕi�ڎd����	*/
			PS_SPOIL,				/* ���v�ʍ\���d����	*/
			CONS_TYP,				/* �\���x���敪	*/
			EFF_PHASE_IN_DATE,			/* ���v�ʗL���J�n��	*/
			EFF_PHASE_OUT_DATE,			/* ���v�ʗL���I����	*/
			MRP_TYP,				/* ���v�ʏ����敪	*/
			EXTERNAL_DM_FLG,			/* �O���f�}���h�t���O	*/
			ODR_RELEASE_FLG,			/* �I�[�_�����σt���O	*/
			CREATED_DATE,				/* �쐬��	*/
			CREATED_BY,				/* �쐬��	*/
			CREATED_PRG_NM,				/* �쐬�v���O������	*/
			UPDATED_DATE,				/* �X�V��	*/
			UPDATED_BY,				/* �X�V��	*/
			UPDATED_PRG_NM,				/* �X�V�v���O������	*/
			MODIFY_COUNT				/* �X�V��	*/
		FROM
			(
			SELECT
				T_OD.OD_NO,			/* �I�[�_�f�}���h�ԍ�	*/
				T_OD.ALC_GRP_CD,		/* �����O���[�v�R�[�h	*/
				T_OD.PLANT_CD,			/* �H��R�[�h	*/
				T_OD.ITEM_CD,			/* �i�ڔԍ�	*/
				T_OD.PS_EDITION,		/* ���v�ʕi�ڍ\���Ő�	*/
				T_OD.JOB_ODR_CD,		/* ����	*/
				T_OD.JOB_ODR_DETAIL_NO,		/* ���Ԏ}��	*/
				T_OD.JOB_ODR_CANCEL_NO,		/* ���Ԏ�������ԍ�	*/
				T_OD.ODR_STS_TYP,		/* �I�[�_��ԋ敪	*/
				T_OD.DM_STS_TYP,		/* �f�}���h��ԋ敪	*/
				T_OD.OD_TYP,			/* �I�[�_�f�}���h�敪	*/
				T_OD.DUE_DATE,			/* �v���[��	*/
				T_OD.ODR_START_DATE,		/* ��z�����	*/
				T_OD.PRD_DUE_DATE,		/* �����[��	*/
				T_OD.PRD_START_DATE,		/* ���������	*/
				T_OD.DM_QTY,			/* �f�}���h��	*/
				T_OD.ODR_QTY,			/* �I�[�_��	*/
				NVL(T_JOB_ODR_ALC.SUM_OF_ALCD_QTY,0)	SUM_OF_ALCD_QTY,	/* �����ϐ�SUM	*/
				TRUNC( T_OD.ODR_QTY / ( 1 + ( T_OD.ITEM_SPOIL / 100 )) , 0 )	NO_SPOIL_ODR_QTY,
				T_OD.MRP_ODR_TYP,		/* �i�ڎ�z�敪	*/
				T_OD.OUTSIDE_TYP,		/* ���v�ʓ��O��敪	*/
				T_OD.ISSUE_TYP,			/* ���v�ʏo�ɋ敪	*/
				T_OD.ODR_LT,			/* ��z���[�h�^�C��	*/
				T_OD.FIXED_LT,			/* �Œ蕪���[�h�^�C��	*/
				T_OD.PROP_LT,			/* ��ᕪ���[�h�^�C��	*/
				T_OD.SAFETY_LT,			/* ���S����	*/
				T_OD.ISSUE_LT,			/* ���o���[�h�^�C��	*/
				T_OD.PROP_LOT_SIZE,		/* ��ᕪ���b�g�T�C�Y	*/
				T_OD.PS_LT_FLG,			/* ���i�\�����[�h�^�C���g�p�t���O	*/
				T_OD.PS_FIXED_LT,		/* ���i�\���Œ蕪���[�h�^�C��	*/
				T_OD.PS_PROP_LT,		/* ���i�\����ᕪ���[�h�^�C��	*/
				T_OD.PS_PROP_LOT_SIZE,		/* ���i�\����ᕪ���b�g�T�C�Y	*/
				T_OD.PS_UNIT_QTY,		/* ���i�\���P�ʐ�	*/
				T_OD.TOTAL_RCV_QTY,		/* ���ɗ݌v��	*/
				T_OD.RCV_CMPLT_DATE,		/* ���Ɋ�����	*/
				T_OD.TOTAL_ISSUE_INST_QTY,	/* �o�Ɏw���݌v��	*/
				T_OD.TOTAL_ISSUE_QTY,		/* �o�ɗ݌v��	*/
				T_OD.ISSUE_CMPLT_DATE,		/* �o�Ɋ�����	*/
				T_OD.OD_GNR_TYP,		/* ���v�ʔ��������敪	*/
				T_OD.OD_LEVEL_NO,		/* ���v�ʃ��x���ԍ�	*/
				T_OD.PARENT_OD_NO,		/* �e�I�[�_�f�}���h�ԍ�	*/
				T_OD.ITEM_SPOIL,		/* ���v�ʕi�ڎd����	*/
				T_OD.PS_SPOIL,			/* ���v�ʍ\���d����	*/
				T_OD.CONS_TYP,			/* �\���x���敪	*/
				T_OD.EFF_PHASE_IN_DATE,		/* ���v�ʗL���J�n��	*/
				T_OD.EFF_PHASE_OUT_DATE,	/* ���v�ʗL���I����	*/
				T_OD.MRP_TYP,			/* ���v�ʏ����敪	*/
				T_OD.EXTERNAL_DM_FLG,		/* �O���f�}���h�t���O	*/
				T_OD.ODR_RELEASE_FLG,		/* �I�[�_�����σt���O	*/
				T_OD.CREATED_DATE,		/* �쐬��	*/
				T_OD.CREATED_BY,		/* �쐬��	*/
				T_OD.CREATED_PRG_NM,		/* �쐬�v���O������	*/
				T_OD.UPDATED_DATE,		/* �X�V��	*/
				T_OD.UPDATED_BY,		/* �X�V��	*/
				T_OD.UPDATED_PRG_NM,		/* �X�V�v���O������	*/
				T_OD.MODIFY_COUNT		/* �X�V��	*/
			FROM
				T_OD,
				(SELECT OD_NO,PLANT_CD,SUM(ALCD_QTY) SUM_OF_ALCD_QTY FROM T_JOB_ODR_ALC GROUP BY OD_NO,PLANT_CD) T_JOB_ODR_ALC,
				M_ITEM
			WHERE
				T_OD.OD_NO = T_JOB_ODR_ALC.OD_NO(+) AND
				T_OD.ITEM_CD = M_ITEM.ITEM_CD AND
				T_OD.PLANT_CD = T_JOB_ODR_ALC.PLANT_CD(+) AND
				T_OD.OD_TYP IN (1,3) AND
				T_OD.MRP_ODR_TYP IN (1,2,3) AND
				T_OD.DM_STS_TYP <> 9 AND
				M_ITEM.UNIT_QTY_TYP = 1		/* �݌ɐ��P�ʋ敪�@�P�F�����Ǘ�			*/
			UNION ALL
			SELECT
				T_OD.OD_NO,			/* �I�[�_�f�}���h�ԍ�	*/
				T_OD.ALC_GRP_CD,		/* �����O���[�v�R�[�h	*/
				T_OD.PLANT_CD,			/* �H��R�[�h	*/
				T_OD.ITEM_CD,			/* �i�ڔԍ�	*/
				T_OD.PS_EDITION,		/* ���v�ʕi�ڍ\���Ő�	*/
				T_OD.JOB_ODR_CD,		/* ����	*/
				T_OD.JOB_ODR_DETAIL_NO,		/* ���Ԏ}��	*/
				T_OD.JOB_ODR_CANCEL_NO,		/* ���Ԏ�������ԍ�	*/
				T_OD.ODR_STS_TYP,		/* �I�[�_��ԋ敪	*/
				T_OD.DM_STS_TYP,		/* �f�}���h��ԋ敪	*/
				T_OD.OD_TYP,			/* �I�[�_�f�}���h�敪	*/
				T_OD.DUE_DATE,			/* �v���[��	*/
				T_OD.ODR_START_DATE,		/* ��z�����	*/
				T_OD.PRD_DUE_DATE,		/* �����[��	*/
				T_OD.PRD_START_DATE,		/* ���������	*/
				T_OD.DM_QTY,			/* �f�}���h��	*/
				T_OD.ODR_QTY,			/* �I�[�_��	*/
				NVL(T_JOB_ODR_ALC.SUM_OF_ALCD_QTY,0)	SUM_OF_ALCD_QTY,	/* �����ϐ�SUM	*/
				TRUNC( T_OD.ODR_QTY / ( 1 + ( T_OD.ITEM_SPOIL / 100 )) , 4 )	NO_SPOIL_ODR_QTY,
				T_OD.MRP_ODR_TYP,		/* �i�ڎ�z�敪	*/
				T_OD.OUTSIDE_TYP,		/* ���v�ʓ��O��敪	*/
				T_OD.ISSUE_TYP,			/* ���v�ʏo�ɋ敪	*/
				T_OD.ODR_LT,			/* ��z���[�h�^�C��	*/
				T_OD.FIXED_LT,			/* �Œ蕪���[�h�^�C��	*/
				T_OD.PROP_LT,			/* ��ᕪ���[�h�^�C��	*/
				T_OD.SAFETY_LT,			/* ���S����	*/
				T_OD.ISSUE_LT,			/* ���o���[�h�^�C��	*/
				T_OD.PROP_LOT_SIZE,		/* ��ᕪ���b�g�T�C�Y	*/
				T_OD.PS_LT_FLG,			/* ���i�\�����[�h�^�C���g�p�t���O	*/
				T_OD.PS_FIXED_LT,		/* ���i�\���Œ蕪���[�h�^�C��	*/
				T_OD.PS_PROP_LT,		/* ���i�\����ᕪ���[�h�^�C��	*/
				T_OD.PS_PROP_LOT_SIZE,		/* ���i�\����ᕪ���b�g�T�C�Y	*/
				T_OD.PS_UNIT_QTY,		/* ���i�\���P�ʐ�	*/
				T_OD.TOTAL_RCV_QTY,		/* ���ɗ݌v��	*/
				T_OD.RCV_CMPLT_DATE,		/* ���Ɋ�����	*/
				T_OD.TOTAL_ISSUE_INST_QTY,	/* �o�Ɏw���݌v��	*/
				T_OD.TOTAL_ISSUE_QTY,		/* �o�ɗ݌v��	*/
				T_OD.ISSUE_CMPLT_DATE,		/* �o�Ɋ�����	*/
				T_OD.OD_GNR_TYP,		/* ���v�ʔ��������敪	*/
				T_OD.OD_LEVEL_NO,		/* ���v�ʃ��x���ԍ�	*/
				T_OD.PARENT_OD_NO,		/* �e�I�[�_�f�}���h�ԍ�	*/
				T_OD.ITEM_SPOIL,		/* ���v�ʕi�ڎd����	*/
				T_OD.PS_SPOIL,			/* ���v�ʍ\���d����	*/
				T_OD.CONS_TYP,			/* �\���x���敪	*/
				T_OD.EFF_PHASE_IN_DATE,		/* ���v�ʗL���J�n��	*/
				T_OD.EFF_PHASE_OUT_DATE,	/* ���v�ʗL���I����	*/
				T_OD.MRP_TYP,			/* ���v�ʏ����敪	*/
				T_OD.EXTERNAL_DM_FLG,		/* �O���f�}���h�t���O	*/
				T_OD.ODR_RELEASE_FLG,		/* �I�[�_�����σt���O	*/
				T_OD.CREATED_DATE,		/* �쐬��	*/
				T_OD.CREATED_BY,		/* �쐬��	*/
				T_OD.CREATED_PRG_NM,		/* �쐬�v���O������	*/
				T_OD.UPDATED_DATE,		/* �X�V��	*/
				T_OD.UPDATED_BY,		/* �X�V��	*/
				T_OD.UPDATED_PRG_NM,		/* �X�V�v���O������	*/
				T_OD.MODIFY_COUNT		/* �X�V��	*/
			FROM
				T_OD,
				(SELECT OD_NO,PLANT_CD,SUM(ALCD_QTY) SUM_OF_ALCD_QTY FROM T_JOB_ODR_ALC GROUP BY OD_NO,PLANT_CD) T_JOB_ODR_ALC,
				M_ITEM
			WHERE
				T_OD.OD_NO = T_JOB_ODR_ALC.OD_NO(+) AND
				T_OD.ITEM_CD = M_ITEM.ITEM_CD AND
				T_OD.PLANT_CD = T_JOB_ODR_ALC.PLANT_CD(+) AND
				T_OD.OD_TYP IN (1,3) AND
				T_OD.MRP_ODR_TYP IN (1,2,3) AND
				T_OD.DM_STS_TYP <> 9 AND
				M_ITEM.UNIT_QTY_TYP = 2		/* �݌ɐ��P�ʋ敪�@�Q�F�����Ǘ�			*/
			)
		)
	WHERE
		UNALCD_QTY > 0
	)
/
