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
		OD_NO,			/* オーダデマンド番号	*/
		ALC_GRP_CD,		/* 引当グループコード	*/
		PLANT_CD,		/* 工場コード	*/
		ITEM_CD,		/* 品目番号	*/
		PS_EDITION,		/* 所要量品目構成版数	*/
		JOB_ODR_CD,		/* 製番	*/
		JOB_ODR_DETAIL_NO,	/* 製番枝番	*/
		JOB_ODR_CANCEL_NO,	/* 製番取消発生番号	*/
		ODR_STS_TYP,		/* オーダ状態区分	*/
		DM_STS_TYP,		/* デマンド状態区分	*/
		OD_TYP,			/* オーダデマンド区分	*/
		DUE_DATE,		/* 要求納期	*/
		ODR_START_DATE,		/* 手配着手日	*/
		PRD_DUE_DATE,		/* 製造納期	*/
		PRD_START_DATE,		/* 製造着手日	*/
		DM_QTY,			/* デマンド数	*/
		ODR_QTY,		/* オーダ数	*/
		SUM_OF_ALCD_QTY,	/* 引当済数SUM	*/
		NO_SPOIL_ODR_QTY,
		UNALCD_QTY,
		MRP_ODR_TYP,		/* 品目手配区分	*/
		OUTSIDE_TYP,		/* 所要量内外作区分	*/
		ISSUE_TYP,		/* 所要量出庫区分	*/
		ODR_LT,			/* 手配リードタイム	*/
		FIXED_LT,		/* 固定分リードタイム	*/
		PROP_LT,		/* 比例分リードタイム	*/
		SAFETY_LT,		/* 安全日数	*/
		ISSUE_LT,		/* 払出リードタイム	*/
		PROP_LOT_SIZE,		/* 比例分ロットサイズ	*/
		PS_LT_FLG,		/* 製品構成リードタイム使用フラグ	*/
		PS_FIXED_LT,		/* 製品構成固定分リードタイム	*/
		PS_PROP_LT,		/* 製品構成比例分リードタイム	*/
		PS_PROP_LOT_SIZE,	/* 製品構成比例分ロットサイズ	*/
		PS_UNIT_QTY,		/* 製品構成単位数	*/
		TOTAL_RCV_QTY,		/* 入庫累計数	*/
		RCV_CMPLT_DATE,		/* 入庫完了日	*/
		TOTAL_ISSUE_INST_QTY,	/* 出庫指示累計数	*/
		TOTAL_ISSUE_QTY,	/* 出庫累計数	*/
		ISSUE_CMPLT_DATE,	/* 出庫完了日	*/
		OD_GNR_TYP,		/* 所要量発生処理区分	*/
		OD_LEVEL_NO,		/* 所要量レベル番号	*/
		PARENT_OD_NO,		/* 親オーダデマンド番号	*/
		ITEM_SPOIL,		/* 所要量品目仕損率	*/
		PS_SPOIL,		/* 所要量構成仕損率	*/
		CONS_TYP,		/* 構成支給区分	*/
		EFF_PHASE_IN_DATE,	/* 所要量有効開始日	*/
		EFF_PHASE_OUT_DATE,	/* 所要量有効終了日	*/
		MRP_TYP,		/* 所要量処理区分	*/
		EXTERNAL_DM_FLG,	/* 外部デマンドフラグ	*/
		ODR_RELEASE_FLG,	/* オーダ発効済フラグ	*/
		CREATED_DATE,		/* 作成日	*/
		CREATED_BY,		/* 作成者	*/
		CREATED_PRG_NM,		/* 作成プログラム名	*/
		UPDATED_DATE,		/* 更新日	*/
		UPDATED_BY,		/* 更新者	*/
		UPDATED_PRG_NM,		/* 更新プログラム名	*/
		MODIFY_COUNT		/* 更新数	*/
	FROM
		(
		SELECT
			OD_NO,					/* オーダデマンド番号	*/
			ALC_GRP_CD,				/* 引当グループコード	*/
			PLANT_CD,				/* 工場コード	*/
			ITEM_CD,				/* 品目番号	*/
			PS_EDITION,				/* 所要量品目構成版数	*/
			JOB_ODR_CD,				/* 製番	*/
			JOB_ODR_DETAIL_NO,			/* 製番枝番	*/
			JOB_ODR_CANCEL_NO,			/* 製番取消発生番号	*/
			ODR_STS_TYP,				/* オーダ状態区分	*/
			DM_STS_TYP,				/* デマンド状態区分	*/
			OD_TYP,					/* オーダデマンド区分	*/
			DUE_DATE,				/* 要求納期	*/
			ODR_START_DATE,				/* 手配着手日	*/
			PRD_DUE_DATE,				/* 製造納期	*/
			PRD_START_DATE,				/* 製造着手日	*/
			DM_QTY,					/* デマンド数	*/
			ODR_QTY,				/* オーダ数	*/
			SUM_OF_ALCD_QTY,			/* 引当済数SUM	*/
			NO_SPOIL_ODR_QTY,
			GREATEST( (DM_QTY-(SUM_OF_ALCD_QTY+NO_SPOIL_ODR_QTY)) , 0 )	UNALCD_QTY,
			MRP_ODR_TYP,				/* 品目手配区分	*/
			OUTSIDE_TYP,				/* 所要量内外作区分	*/
			ISSUE_TYP,				/* 所要量出庫区分	*/
			ODR_LT,					/* 手配リードタイム	*/
			FIXED_LT,				/* 固定分リードタイム	*/
			PROP_LT,				/* 比例分リードタイム	*/
			SAFETY_LT,				/* 安全日数	*/
			ISSUE_LT,				/* 払出リードタイム	*/
			PROP_LOT_SIZE,				/* 比例分ロットサイズ	*/
			PS_LT_FLG,				/* 製品構成リードタイム使用フラグ	*/
			PS_FIXED_LT,				/* 製品構成固定分リードタイム	*/
			PS_PROP_LT,				/* 製品構成比例分リードタイム	*/
			PS_PROP_LOT_SIZE,			/* 製品構成比例分ロットサイズ	*/
			PS_UNIT_QTY,				/* 製品構成単位数	*/
			TOTAL_RCV_QTY,				/* 入庫累計数	*/
			RCV_CMPLT_DATE,				/* 入庫完了日	*/
			TOTAL_ISSUE_INST_QTY,			/* 出庫指示累計数	*/
			TOTAL_ISSUE_QTY,			/* 出庫累計数	*/
			ISSUE_CMPLT_DATE,			/* 出庫完了日	*/
			OD_GNR_TYP,				/* 所要量発生処理区分	*/
			OD_LEVEL_NO,				/* 所要量レベル番号	*/
			PARENT_OD_NO,				/* 親オーダデマンド番号	*/
			ITEM_SPOIL,				/* 所要量品目仕損率	*/
			PS_SPOIL,				/* 所要量構成仕損率	*/
			CONS_TYP,				/* 構成支給区分	*/
			EFF_PHASE_IN_DATE,			/* 所要量有効開始日	*/
			EFF_PHASE_OUT_DATE,			/* 所要量有効終了日	*/
			MRP_TYP,				/* 所要量処理区分	*/
			EXTERNAL_DM_FLG,			/* 外部デマンドフラグ	*/
			ODR_RELEASE_FLG,			/* オーダ発効済フラグ	*/
			CREATED_DATE,				/* 作成日	*/
			CREATED_BY,				/* 作成者	*/
			CREATED_PRG_NM,				/* 作成プログラム名	*/
			UPDATED_DATE,				/* 更新日	*/
			UPDATED_BY,				/* 更新者	*/
			UPDATED_PRG_NM,				/* 更新プログラム名	*/
			MODIFY_COUNT				/* 更新数	*/
		FROM
			(
			SELECT
				T_OD.OD_NO,			/* オーダデマンド番号	*/
				T_OD.ALC_GRP_CD,		/* 引当グループコード	*/
				T_OD.PLANT_CD,			/* 工場コード	*/
				T_OD.ITEM_CD,			/* 品目番号	*/
				T_OD.PS_EDITION,		/* 所要量品目構成版数	*/
				T_OD.JOB_ODR_CD,		/* 製番	*/
				T_OD.JOB_ODR_DETAIL_NO,		/* 製番枝番	*/
				T_OD.JOB_ODR_CANCEL_NO,		/* 製番取消発生番号	*/
				T_OD.ODR_STS_TYP,		/* オーダ状態区分	*/
				T_OD.DM_STS_TYP,		/* デマンド状態区分	*/
				T_OD.OD_TYP,			/* オーダデマンド区分	*/
				T_OD.DUE_DATE,			/* 要求納期	*/
				T_OD.ODR_START_DATE,		/* 手配着手日	*/
				T_OD.PRD_DUE_DATE,		/* 製造納期	*/
				T_OD.PRD_START_DATE,		/* 製造着手日	*/
				T_OD.DM_QTY,			/* デマンド数	*/
				T_OD.ODR_QTY,			/* オーダ数	*/
				NVL(T_JOB_ODR_ALC.SUM_OF_ALCD_QTY,0)	SUM_OF_ALCD_QTY,	/* 引当済数SUM	*/
				TRUNC( T_OD.ODR_QTY / ( 1 + ( T_OD.ITEM_SPOIL / 100 )) , 0 )	NO_SPOIL_ODR_QTY,
				T_OD.MRP_ODR_TYP,		/* 品目手配区分	*/
				T_OD.OUTSIDE_TYP,		/* 所要量内外作区分	*/
				T_OD.ISSUE_TYP,			/* 所要量出庫区分	*/
				T_OD.ODR_LT,			/* 手配リードタイム	*/
				T_OD.FIXED_LT,			/* 固定分リードタイム	*/
				T_OD.PROP_LT,			/* 比例分リードタイム	*/
				T_OD.SAFETY_LT,			/* 安全日数	*/
				T_OD.ISSUE_LT,			/* 払出リードタイム	*/
				T_OD.PROP_LOT_SIZE,		/* 比例分ロットサイズ	*/
				T_OD.PS_LT_FLG,			/* 製品構成リードタイム使用フラグ	*/
				T_OD.PS_FIXED_LT,		/* 製品構成固定分リードタイム	*/
				T_OD.PS_PROP_LT,		/* 製品構成比例分リードタイム	*/
				T_OD.PS_PROP_LOT_SIZE,		/* 製品構成比例分ロットサイズ	*/
				T_OD.PS_UNIT_QTY,		/* 製品構成単位数	*/
				T_OD.TOTAL_RCV_QTY,		/* 入庫累計数	*/
				T_OD.RCV_CMPLT_DATE,		/* 入庫完了日	*/
				T_OD.TOTAL_ISSUE_INST_QTY,	/* 出庫指示累計数	*/
				T_OD.TOTAL_ISSUE_QTY,		/* 出庫累計数	*/
				T_OD.ISSUE_CMPLT_DATE,		/* 出庫完了日	*/
				T_OD.OD_GNR_TYP,		/* 所要量発生処理区分	*/
				T_OD.OD_LEVEL_NO,		/* 所要量レベル番号	*/
				T_OD.PARENT_OD_NO,		/* 親オーダデマンド番号	*/
				T_OD.ITEM_SPOIL,		/* 所要量品目仕損率	*/
				T_OD.PS_SPOIL,			/* 所要量構成仕損率	*/
				T_OD.CONS_TYP,			/* 構成支給区分	*/
				T_OD.EFF_PHASE_IN_DATE,		/* 所要量有効開始日	*/
				T_OD.EFF_PHASE_OUT_DATE,	/* 所要量有効終了日	*/
				T_OD.MRP_TYP,			/* 所要量処理区分	*/
				T_OD.EXTERNAL_DM_FLG,		/* 外部デマンドフラグ	*/
				T_OD.ODR_RELEASE_FLG,		/* オーダ発効済フラグ	*/
				T_OD.CREATED_DATE,		/* 作成日	*/
				T_OD.CREATED_BY,		/* 作成者	*/
				T_OD.CREATED_PRG_NM,		/* 作成プログラム名	*/
				T_OD.UPDATED_DATE,		/* 更新日	*/
				T_OD.UPDATED_BY,		/* 更新者	*/
				T_OD.UPDATED_PRG_NM,		/* 更新プログラム名	*/
				T_OD.MODIFY_COUNT		/* 更新数	*/
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
				M_ITEM.UNIT_QTY_TYP = 1		/* 在庫数単位区分　１：整数管理			*/
			UNION ALL
			SELECT
				T_OD.OD_NO,			/* オーダデマンド番号	*/
				T_OD.ALC_GRP_CD,		/* 引当グループコード	*/
				T_OD.PLANT_CD,			/* 工場コード	*/
				T_OD.ITEM_CD,			/* 品目番号	*/
				T_OD.PS_EDITION,		/* 所要量品目構成版数	*/
				T_OD.JOB_ODR_CD,		/* 製番	*/
				T_OD.JOB_ODR_DETAIL_NO,		/* 製番枝番	*/
				T_OD.JOB_ODR_CANCEL_NO,		/* 製番取消発生番号	*/
				T_OD.ODR_STS_TYP,		/* オーダ状態区分	*/
				T_OD.DM_STS_TYP,		/* デマンド状態区分	*/
				T_OD.OD_TYP,			/* オーダデマンド区分	*/
				T_OD.DUE_DATE,			/* 要求納期	*/
				T_OD.ODR_START_DATE,		/* 手配着手日	*/
				T_OD.PRD_DUE_DATE,		/* 製造納期	*/
				T_OD.PRD_START_DATE,		/* 製造着手日	*/
				T_OD.DM_QTY,			/* デマンド数	*/
				T_OD.ODR_QTY,			/* オーダ数	*/
				NVL(T_JOB_ODR_ALC.SUM_OF_ALCD_QTY,0)	SUM_OF_ALCD_QTY,	/* 引当済数SUM	*/
				TRUNC( T_OD.ODR_QTY / ( 1 + ( T_OD.ITEM_SPOIL / 100 )) , 4 )	NO_SPOIL_ODR_QTY,
				T_OD.MRP_ODR_TYP,		/* 品目手配区分	*/
				T_OD.OUTSIDE_TYP,		/* 所要量内外作区分	*/
				T_OD.ISSUE_TYP,			/* 所要量出庫区分	*/
				T_OD.ODR_LT,			/* 手配リードタイム	*/
				T_OD.FIXED_LT,			/* 固定分リードタイム	*/
				T_OD.PROP_LT,			/* 比例分リードタイム	*/
				T_OD.SAFETY_LT,			/* 安全日数	*/
				T_OD.ISSUE_LT,			/* 払出リードタイム	*/
				T_OD.PROP_LOT_SIZE,		/* 比例分ロットサイズ	*/
				T_OD.PS_LT_FLG,			/* 製品構成リードタイム使用フラグ	*/
				T_OD.PS_FIXED_LT,		/* 製品構成固定分リードタイム	*/
				T_OD.PS_PROP_LT,		/* 製品構成比例分リードタイム	*/
				T_OD.PS_PROP_LOT_SIZE,		/* 製品構成比例分ロットサイズ	*/
				T_OD.PS_UNIT_QTY,		/* 製品構成単位数	*/
				T_OD.TOTAL_RCV_QTY,		/* 入庫累計数	*/
				T_OD.RCV_CMPLT_DATE,		/* 入庫完了日	*/
				T_OD.TOTAL_ISSUE_INST_QTY,	/* 出庫指示累計数	*/
				T_OD.TOTAL_ISSUE_QTY,		/* 出庫累計数	*/
				T_OD.ISSUE_CMPLT_DATE,		/* 出庫完了日	*/
				T_OD.OD_GNR_TYP,		/* 所要量発生処理区分	*/
				T_OD.OD_LEVEL_NO,		/* 所要量レベル番号	*/
				T_OD.PARENT_OD_NO,		/* 親オーダデマンド番号	*/
				T_OD.ITEM_SPOIL,		/* 所要量品目仕損率	*/
				T_OD.PS_SPOIL,			/* 所要量構成仕損率	*/
				T_OD.CONS_TYP,			/* 構成支給区分	*/
				T_OD.EFF_PHASE_IN_DATE,		/* 所要量有効開始日	*/
				T_OD.EFF_PHASE_OUT_DATE,	/* 所要量有効終了日	*/
				T_OD.MRP_TYP,			/* 所要量処理区分	*/
				T_OD.EXTERNAL_DM_FLG,		/* 外部デマンドフラグ	*/
				T_OD.ODR_RELEASE_FLG,		/* オーダ発効済フラグ	*/
				T_OD.CREATED_DATE,		/* 作成日	*/
				T_OD.CREATED_BY,		/* 作成者	*/
				T_OD.CREATED_PRG_NM,		/* 作成プログラム名	*/
				T_OD.UPDATED_DATE,		/* 更新日	*/
				T_OD.UPDATED_BY,		/* 更新者	*/
				T_OD.UPDATED_PRG_NM,		/* 更新プログラム名	*/
				T_OD.MODIFY_COUNT		/* 更新数	*/
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
				M_ITEM.UNIT_QTY_TYP = 2		/* 在庫数単位区分　２：小数管理			*/
			)
		)
	WHERE
		UNALCD_QTY > 0
	)
/
