package com.nec.jp.orteus.expj.mstappr;

public abstract interface MstItemStructApprIF {
	// 品目分類01	
	public abstract void setITEM_CLASS_01_CD(String val);
	// 品目分類02	
	public abstract void setITEM_CLASS_02_CD(String val);
	// 品目分類03	
	public abstract void setITEM_CLASS_03_CD(String val);
	// 品目分類04	
	public abstract void setITEM_CLASS_04_CD(String val);
	// 品目分類05	
	public abstract void setITEM_CLASS_05_CD(String val);
	// 品目分類06	
	public abstract void setITEM_CLASS_06_CD(String val);
	// 品目分類07	
	public abstract void setITEM_CLASS_07_CD(String val);
	// 品目分類08	
	public abstract void setITEM_CLASS_08_CD(String val);
	// 品目分類09	
	public abstract void setITEM_CLASS_09_CD(String val);
	// 品目分類10	
	public abstract void setITEM_CLASS_10_CD(String val);
	// 品目分類11	
	public abstract void setITEM_CLASS_11_CD(String val);
	// 品目分類12	
	public abstract void setITEM_CLASS_12_CD(String val);

	// 在庫数単位区分
	public abstract void setUNIT_QTY_TYP(String val);
	// 荷姿単位数
	public abstract void setPKG_UNIT_QTY(String val);
	// 安全在庫量
	public abstract void setSAFETY_STOCK(String val);
	// 最大手配数
	public abstract void setMAX_ODR_QTY(String val);
	// 発注点在庫数
	public abstract void setODR_POINT(String val);
	// 定量発注数
	public abstract void setFIXED_ODR_QTY(String val);
	// 最小手配数
	public abstract void setMIN_ODR_QTY(String val);
	// まるめ単位
	public abstract void setMUL_ODR_QTY(String val);
	// 品目番号
	public abstract void setITEM_CD(String val);
	// 消費税コード
	public abstract void setTAX_CD(String val);
	// カレンダ番号
	public abstract void setCAL_NO(String val);
	// 品目手配区分
	public abstract void setMRP_ODR_TYP(String val);
	// ロット管理フラグ
	public abstract void setLOT_CTRL_FLG(String val);
	// 更新数
	public abstract void setMODIFY_COUNT(String val);
	// 工数管理品目区分
	public abstract void setMANHOUR_TYP(String val);
	// 計量単位
	public abstract void setSTOCK_UNIT(String val);
}
