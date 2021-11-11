/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueInstStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;

/**
 * <pre>
 * �o�Ɏw�����N���X
 * �����o�ɑΏۂ̏o�Ɏw������ێ�����N���X�ł��B
 * </pre>
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:00 $
 */
public class IssueInstStruct {
    /** �o�Ɏw���ԍ�   */
    public String  m_ISSUE_INST_CD = null;
    /** �H��R�[�h   */
    public String  m_PLANT_CD = null;			
    /** �I�[�_�f�}���h�ԍ�   */
    public String  m_OD_NO = null;
    /** ���̏o�Ɏw������[���v��].����   */
    public String  m_JOB_ODR_CD = null;
    /** ���̏o�Ɏw������[���v��].���Ԏ}��  */
    public int		m_JOB_ODR_DETAIL_NO = 0;
    /** �o�ɕi�ڔԍ� */
    public String  m_ITEM_CD = null;		
    /** �����ԍ�    */
    public String  m_PUCH_ODR_CD = null;
    /** ��ЃR�[�h    */
    public String  m_COMPANY_CD = null;
    /** �����R�[�h    */
    public String  m_VEND_CD = null;
    /** ��ƌv��ԍ�    */
    public String  m_WORK_ODR_CD = null;		
    /** �d�|��ƃR�[�h    */
    public String  m_WORK_IN_PROC_CD = null;
    /** ��Ƌ�R�[�h    */
    public String  m_WS_CD = null;
    /** �H���ۊǏꏊ�R�[�h    */
	public String  m_WH_CD = null;						
    /** �x���敪    */
	public int     m_CONS_TYP = 0;
    /** �o�Ɏw���o�ɋ敪    */
	//public int     m_ISSUE_TYP = 0;
    /** �i�ڎ�z�敪 */
	public int     m_MRP_ODR_TYP = 0;
    /** �݌ɐ��P�ʋ敪 */
	public int     m_UNIT_QTY_TYP = 0;
    /** �����o�ɐ��i�����Ώێ��ѐ������ɎZ�o�����l�j*/
	public BigDecimal m_AUTO_ISSUE_QTY = null;


	//------------------------------------------------------
	//     �y���J���\�b�h�z
	//------------------------------------------------------
	
	/**
	 * <pre>
	 * �H���ۊǏꏊ�ւ̓��ɏ������s�����ǂ����̔�����s���܂��B
	 * (OPF���痘�p���܂��j
	 * 
     * �H���ۊǏꏊ��Null("") �̏ꍇ�A�@�܂���
     * ��ƌv��ԍ���Null("") AND �x���敪���Q:����
     * �̏ꍇ�Atrue(�H���ۊǏꏊ�֓��ɂ���)��ԋp���܂��B
	 * </pre>
	 * 
	 * @param iWhCd       �H���ۊǏꏊ�R�[�h
	 * @param iWorkOdrCd  ��ƌv��ԍ�
	 * @param iConsTyp    �x���敪
	 *
	 * @return true/false   (true:�H���ۊǏꏊ�֓��ɂ���)
	 */
	final static public boolean isWhRcv(String iWhCd, String iWorkOdrCd, String iConsTyp) {
	    
	    return isWhRcv(iWhCd,iWorkOdrCd,Integer.parseInt(iConsTyp));
	}

	/**
	 * �H���ۊǏꏊ�ւ̓��ɏ������s�����ǂ����̔�����s���܂��B
	 * (�}�j���A���E�L�b�g�ꊇ�o�ɃN���X���痘�p���܂�)
	 *
	 * @return true/false   (true:�H���ۊǏꏊ�֓��ɂ���)
	 */
	protected boolean isWhRcv() {
	    
	    return isWhRcv(this.m_WH_CD, this.m_WORK_ODR_CD,this.m_CONS_TYP);
	}
	
	/**
	 * <pre>
	 * [�L���x������]�t�@�C���ւ̒ǉ�������s���܂��B
	 * (OPF���痘�p���܂�)
	 *
	 * �����ԍ���Null("")  AND ��ƌv��ԍ���Null("") AND �x���敪���P:�L��
	 * �̏ꍇ�Atrue(�L���x��)��ԋp���܂��B
	 * </pre>
	 *
	 * @param iPuchOdrCd�@�����ԍ�
	 * @param iWorkOdrCd�@��ƌv��ԍ�
	 * @param iConsTyp�@�@�x���敪
	 * 
	 * @return true/false   (true:�L���x���i�ł���)
	 */
	final static public boolean isOnerous(String iPuchOdrCd, String iWorkOdrCd, String iConsTyp) {
	    return isOnerous(iPuchOdrCd,
	                      iWorkOdrCd,
	                      Integer.parseInt(iConsTyp));
	}
	
	/**
	 * <pre>
	 * [�L���x������]�t�@�C���ւ̒ǉ�������s���܂��B
	 * (�����o�ɃN���X�A�}�j���A���E�L�b�g�ꊇ�o�ɃN���X���痘�p���܂�)
	 *
	 * </pre>
	 * 
	 * @return true/false   (true:�L���x���i�ł���)
	 */
	protected boolean isOnerous() {
	    return isOnerous(this.m_PUCH_ODR_CD,
	                      this.m_WORK_ODR_CD,
	                      this.m_CONS_TYP);
	}

	//------------------------------------------------------
	//     �y����J���\�b�h�z
	//------------------------------------------------------
	/**
	 * [�L���x������]�t�@�C���ւ̒ǉ�������s���܂��B
     *
	 * �����ԍ���Null("")  AND ��ƌv��ԍ���Null("") AND �x���敪���P:�L��
	 * �̏ꍇ�Atrue(�L���x��)��ԋp���܂��B
     *
	 * @param iPuchOdrCd�@�����ԍ�
	 * @param iWorkOdrCd�@��ƌv��ԍ�
	 * @param iConsTyp�@�@�x���敪
	 * 
	 * @return true/false   (true:�L���x���i�ł���)
	 */
	final static private boolean isOnerous(String iPuchOdrCd, String iWorkOdrCd, int iConsTyp) {
	    boolean ConsFlg = false;
	    /*
	     * �����ԍ���Null("")  AND ��ƌv��ԍ���Null("") AND �x���敪���P:�L��
	     * �̏ꍇ�A�L���x���Ƃ���B
	     */
		if ( ((iPuchOdrCd != null) && !iPuchOdrCd.equals("")) && 
		     ((iWorkOdrCd == null) || iWorkOdrCd.equals("") ) &&
		     (iConsTyp == 1)) {
			ConsFlg = true;
		}
	    return ConsFlg;
	}

	/**
	 * �H���ۊǏꏊ�ւ̓��ɏ������s�����ǂ����̔�����s���܂��B
	 * 
     * �H���ۊǏꏊ��Null("") �̏ꍇ�A�@�܂���
     * ��ƌv��ԍ���Null("") AND �x���敪���Q:����
     * �̏ꍇ�Atrue(�H���ۊǏꏊ�֓��ɂ���)��ԋp���܂��B
	 * 
	 * @param iWhCd       �H���ۊǏꏊ�R�[�h
	 * @param iWorkOdrCd  ��ƌv��ԍ�
	 * @param iConsTyp    �x���敪
	 *
	 * @return true/false   (true:�H���ۊǏꏊ�֓��ɂ���)
	 */
	final static private boolean isWhRcv(String iWhCd, String iWorkOdrCd, int iConsTyp) {
	    /*
	     * �H���ۊǏꏊ��Null("") �̏ꍇ�A�u�H���ۊǏꏊ�֓��ɂ���v�Ɣ��肷��B
	     */
	    if ((iWhCd!= null) && !iWhCd.equals("")){
	        return true;
	    }
	    /*
	     * ��ƌv��ԍ���Null("") AND �x���敪���Q:����
	     * �̏ꍇ�A�u�H���ۊǏꏊ�֓��ɂ���v�Ɣ��肷��B
	     */
		if (( iWorkOdrCd == null || iWorkOdrCd.equals("") ) &&
		     (iConsTyp == 2)) {
		    return  true;
		}
	    return false;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
