package com.nec.jp.orteus.metamorBase.KR0070;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
import java.math.*;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.xaf.util.FoundationException;


/**
 * �v���V�[�W�����R�[�����ď��������s����N���X
 * �i�����i�e���v���[�g��p�N���X�j
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 07:52:15 $
 */
public class Common {

	/**
	 * �̔��Ǘ����������L�[
	 */
	static final public int INITSALESPROCFD  =  1;
	
	/**
	 * ���|IF�����L�[
	 */
	static final public int EXCARFIFFD = INITSALESPROCFD + 1;
	
	/**
	 * ��ЃR�[�h�擾�L�[
	 */
	static final public int GETSCMCOMPANYCD = EXCARFIFFD + 1;
	
	/**
	 * ������ъǗ��ԍ�
	 */
	static final public int SALES_SEQ_NO = GETSCMCOMPANYCD + 1;
	
	/**
	 * �`�[�ԍ��i�r�b�l�j
	 */
	static final public int SCM_SLIP_CD = SALES_SEQ_NO + 1;
	
	/**
	 * �`�[�ԍ�
	 */
	static final public int SLIP_CD = SCM_SLIP_CD + 1;
	
	/**
	 * ����Ōv�Z�L�[
	 */
	static final public int CALCTAXFD = SLIP_CD + 1;
	
	/**
	 * ����v�㔻�菈���L�[
	 */
	static final public int EXCSALESCHECK = CALCTAXFD + 1;
	
	/**
	 * ����v�㏈���L�[
	 */
	static final public int EXCSALESCONF = EXCSALESCHECK + 1;
	
	/**
	 * ����v�㏈���L�[
	 */
	static final public int EXCSALESCONFSCM = EXCSALESCONF + 1;
	
	/**
	 * �̔��P���擾�L�[
	 */
	static final public int GETSALESUNITCOST = EXCSALESCONFSCM + 1;
	
	/**
	 * 0�l�ݒ�p
	 */
	static final  BigDecimal BIG_DECIMAL_ZERO  = BigDecimal.valueOf(0);
	

	protected int collectKey = 0;
	protected String userCd = null;
	protected String businessCd = null;
	protected String plantCd = null;
	protected String companyCd = null;
	protected String logMode = null;
	protected String outPutMode = null;
	protected String outPutPath = null;
	protected String outPutName = null;
	protected SystemLog sysLog = null;
	protected IDbConnection conn = null;
	protected Integer resultStatus = null;
	protected List resultList = null;
	protected int resultchk = 0;

	
	/*********************************************************************
	 *** ���ʊ֐�
	 *********************************************************************/
	
	/**
	 * �R���X�g���N�^
	 * @param  conn         DB�R�l�N�V����
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	 */
	public Common(IDbConnection conn, String userCd,
			String businessCd, String plantCd, String companyCd) throws
			FoundationException {
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.companyCd = companyCd;
		this.readProperty();
	}

    /**
     * �̔��Ǘ���������  <BR>
     *
     * @param �@
     * @param  
     * @return �擾���ʂ��i�[�������X�g (: :�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List InitSalesProcFd() throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = INITSALESPROCFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode);       // LOG���[�h
            adapt.setString(2, this.outPutMode);    // �o�̓��[�h
            adapt.setString(3, this.outPutPath);    // �o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName);    // �o�̓t�@�C����
            adapt.setString(5, this.userCd);        // ���[�UID
            adapt.setString(6, this.businessCd);    // �Ɩ���
            adapt.setString(7, this.plantCd);       // �H��R�[�h
            adapt.setOutString(5);                  // �������ʁi���[�UID)
            adapt.setOutString(8);                  // �������ʁi��ЃR�[�h)
            adapt.setOutString(9);                  // �������ʁi�̔��Ǘ��p�H��R�[�h)
            adapt.setOutString(10);                 // �������ʁi����R�[�h)
            adapt.setOutString(11);                 // �������ʁi���喼)
            adapt.setOutString(12);                 // �������ʁi���[�U��)
            adapt.setOutString(13);                 // �������ʁi�Ɩ��^�p��)
            adapt.setOutString(14);                 // �������ʁi�M�݃R�[�h)
            adapt.setOutString(15);                 // �������ʁi�G���[�R�[�h)
            adapt.setOutInteger(16);                // �������ʁi���ʃX�e�[�^�X�j

            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(16);
            if(adapt.getOutString(5) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(5));  
            }
             
            //�������ʂ̊i�[
            for(int i =8 ; i< 17 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * ���|IF��������  <BR>
     *
     * @param  procDiv      �����敪(1:�o�׎���/�o�וԕi�A2:��́E����/��́E����(�ԕi)�A3:���̑�����
     * @param  updDiv       �X�V�敪(1:�o�^�A2:����A3:�C��)
     * @param  SlipCd       �`�[�ԍ�(�o�ה[�i�`�[�ԍ��A�o�ה[�i�E���̑�����`�[�ԍ�)
     * @return �擾���ʂ��i�[�������X�g (: :�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excArfIFFd(int procDiv, int updDiv, String SlipCd, String taxCd) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCARFIFFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode);       // LOG���[�h
            adapt.setString(2, this.outPutMode);    // �o�̓��[�h
            adapt.setString(3, this.outPutPath);    // �o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName);    // �o�̓t�@�C����
            adapt.setString(5, this.userCd);        // ���[�UID
            adapt.setString(6, this.businessCd);    // �Ɩ���
            adapt.setString(7, this.plantCd);       // �H��R�[�h
            adapt.setString(8, SlipCd);             // �`�[�ԍ�
            adapt.setInt(9, procDiv);               // �����敪
            adapt.setInt(10,updDiv);                // �X�V�敪
            adapt.setOutString(11);                 // �������ʁi�G���[�R�[�h)
            adapt.setOutInteger(12);                // �������ʁi���ʃX�e�[�^�X�j
            adapt.setString(13,taxCd);                // ����ŃR�[�h

            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(12);
            if(adapt.getOutString(11) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(11)); 
            }
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    

	/**
	 * ��ЃR�[�h�擾
	 *
	 * @param  plantCd �H��R�[�h
	 * @return String ��ЃR�[�h
	 */
	public String getScmCompanyCd(String plantCd) throws FoundationException {

		//�����`�F�b�N
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}

		this.collectKey = GETSCMCOMPANYCD;

		this.resultStatus = null;
		this.resultList = new ArrayList();

		IDbAdapter adapt = null;

		String companyCd = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode);		//LOG���[�h
			adapt.setString(2, this.outPutMode);	//�o�̓��[�h
			adapt.setString(3, this.outPutPath);	//�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName);	//�o�̓t�@�C����
			adapt.setString(5, this.userCd);		//���[�UID
			adapt.setString(6, this.businessCd);	//�Ɩ���
			adapt.setString(7, this.plantCd);		//�H��R�[�h
			adapt.setOutString(8);					// ��������(��ЃR�[�h)

			adapt.execUpdate();

			// �������ʂ̔��f
			companyCd = adapt.getOutString(8);

		} finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return companyCd;
	}
	
	
	
	/**
	 * �̔Ԃ����ԍ���ԋp���܂��B�iSP���i�g�p�j
	 *
	 * @return	�̔Ԃ��ꂽ�ԍ���ԋp���܂��B�̔Ԃ���Ȃ������ꍇ�́Anull ��ԋp���܂��B
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public String getNo() throws FoundationException {
		//�����`�F�b�N
		if (this.userCd == null ||
			this.businessCd == null || this.plantCd == null || 
			this.companyCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}
		this.collectKey = SALES_SEQ_NO;
		this.resultStatus = null;
		String returnNo = null;

		IDbAdapter adapt = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode);    //LOG���[�h
			adapt.setString(2, this.outPutMode); //�o�̓��[�h
			adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName); //�o�̓t�@�C����
			adapt.setString(5, this.userCd);     //���[�UID
			adapt.setString(6, this.businessCd); //�Ɩ���
			adapt.setString(7, this.plantCd);    //�H��R�[�h
			adapt.setString(8, this.companyCd);  //��ЃR�[�h
			adapt.setOutString(9);               //�̔Ԍ���
			adapt.setOutInteger(10);              //�̔Ԕԍ�

			adapt.execUpdate();

			returnNo = adapt.getOutString(9);
			this.resultStatus = adapt.getOutInteger(10);

		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return returnNo;
	}
    
	
	/**
	 * �̔Ԃ����ԍ���ԋp���܂��B�iSP���i�g�p�j
	 *
	 * @return	�̔Ԃ��ꂽ�ԍ���ԋp���܂��B�̔Ԃ���Ȃ������ꍇ�́Anull ��ԋp���܂��B
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public String getSCM_SLIP_CD() throws FoundationException {
		//�����`�F�b�N
		if (this.userCd == null ||
			this.businessCd == null || this.plantCd == null || 
			this.companyCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}

		this.collectKey = SCM_SLIP_CD;
		this.resultStatus = null;
		String returnNo = null;

		IDbAdapter adapt = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode);    //LOG���[�h
			adapt.setString(2, this.outPutMode); //�o�̓��[�h
			adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName); //�o�̓t�@�C����
			adapt.setString(5, this.userCd);     //���[�UID
			adapt.setString(6, this.businessCd); //�Ɩ���
			adapt.setString(7, this.plantCd);    //�H��R�[�h
			adapt.setString(8, this.companyCd);  //��ЃR�[�h
			adapt.setOutString(9);               //�̔Ԍ���
			adapt.setOutInteger(10);              //�̔Ԕԍ�

			adapt.execUpdate();

			returnNo = adapt.getOutString(9);
			this.resultStatus = adapt.getOutInteger(10);

		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return returnNo;
	}
	
	/**
	 * �̔Ԃ����ԍ���ԋp���܂��B�iSP���i�g�p�j
	 *
	 * @return	�̔Ԃ��ꂽ�ԍ���ԋp���܂��B�̔Ԃ���Ȃ������ꍇ�́Anull ��ԋp���܂��B
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public String getSLIP_CD() throws FoundationException {
		//�����`�F�b�N
		if (this.userCd == null ||
			this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}

		this.collectKey = SLIP_CD;
		this.resultStatus = null;
		String returnNo = null;

		IDbAdapter adapt = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOG���[�h
			adapt.setString(2, this.outPutMode); //�o�̓��[�h
			adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName); //�o�̓t�@�C����
			adapt.setString(5, this.userCd); //���[�UID
			adapt.setString(6, this.businessCd); //�Ɩ���
			adapt.setString(7, this.plantCd); //�H��R�[�h
			adapt.setOutString(8); //�̔Ԍ���
			adapt.setOutInteger(9); //�̔Ԍ���

			adapt.execUpdate();

			returnNo = adapt.getOutString(8);
			this.resultStatus = adapt.getOutInteger(9);

		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return returnNo;
	}
	
	
	/**
	 * ����Ōv�Z  <BR>
	 *
	 * @param  taxCd  ����ŃR�[�h
	 * @param  newTaxRateStDate  �V����ŗ������
	 * @param  decimalFlg  ��������
	 * @param  amountIn  ���z
	 * @return �擾���ʂ��i�[�������X�g (1:�ŗ�1 2:�ŗ�2 3:�ŗ�3 4:�Ŋz1 5:�Ŋz2 6:�Ŋz3 7:�Ŕ����z 8:����ŋ��z 9:�ō����z 10:�O�őΏۋ��z 11:���őΏۋ��z 12:��ېőΏۋ��z 13:����Ŋz�i�O�Łj 14:����Ŋz�i���Łj 15:�[���敪 16:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public List calcTaxFd(String taxCd,String newTaxRateStDate,String decimalFlg,String amountIn) throws FoundationException {
				
		//�����`�F�b�N
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}
		this.collectKey = CALCTAXFD;
		
		this.resultStatus = null;
		this.resultList = new ArrayList();

		IDbAdapter adapt = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOG���[�h
			adapt.setString(2, this.outPutMode); //�o�̓��[�h
			adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName); //�o�̓t�@�C����
			adapt.setString(5, this.userCd); //���[�UID
			adapt.setString(6, this.businessCd); //�Ɩ���
			adapt.setString(7, this.plantCd); //�H��R�[�h
			adapt.setString(8, taxCd); //����ŃR�[�h
			adapt.setString(9, newTaxRateStDate); //�V����ŗ������
			adapt.setString(10, decimalFlg); //��������
			adapt.setString(11, amountIn); //���z
			adapt.setOutString(12); //�������ʁi�ŗ�1)
			adapt.setOutString(13); //�������ʁi�ŗ�2)
			adapt.setOutString(14); //�������ʁi�ŗ�3)
			adapt.setOutString(15); //�������ʁi�Ŋz1)
			adapt.setOutString(16); //�������ʁi�Ŋz2)
			adapt.setOutString(17); //�������ʁi�Ŋz3)
			adapt.setOutString(18); //�������ʁi�Ŕ����z)
			adapt.setOutString(19); //�������ʁi����ŋ��z)
			adapt.setOutString(20); //�������ʁi�ō����z)
			adapt.setOutString(21); //�������ʁi�O�őΏۋ��z)
			adapt.setOutString(22); //�������ʁi���őΏۋ��z)
			adapt.setOutString(23); //�������ʁi��ېőΏۋ��z)
			adapt.setOutString(24); //�������ʁi����Ŋz�i�O�Łj)
			adapt.setOutString(25); //�������ʁi����Ŋz�i���Łj)
			adapt.setOutString(26); //�������ʁi�[���敪)
			adapt.setOutString(27); //�������ʁi�G���[�R�[�h)
			adapt.setOutInteger(28); //�������ʁi���ʃX�e�[�^�X�j

			adapt.execUpdate();
			
			//���ʃX�e�[�^�X�̊i�[
			this.resultStatus = adapt.getOutInteger(28);
			
			//�������ʂ̊i�[
			
			for(int i =12 ; i< 28 ; i++)
			if(adapt.getOutString(i) == null){
				resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
			}else{
					resultList.add(adapt.getOutString(i)); 
			}
		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return resultList;
	}
	
	
	/**
	 * ����v�㔻�菈��  <BR>
	 *
	 * @param  slipCd  �`�[�ԍ�
	 * @return ���茋��(true�Afalse)
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public boolean excSalesCheck(String slipCd) throws FoundationException {
				
		//�����`�F�b�N
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return false;
		}
		this.collectKey = EXCSALESCHECK;
		
		this.resultStatus = null;
		this. resultchk = 0;
		
		IDbAdapter adapt = null;

		try {
			adapt =this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOG���[�h
			adapt.setString(2, this.outPutMode); //�o�̓��[�h
			adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName); //�o�̓t�@�C����
			adapt.setString(5, this.userCd); //���[�UID
			adapt.setString(6, this.businessCd); //�Ɩ���
			adapt.setString(7, this.plantCd); //�H��R�[�h
			adapt.setString(8, slipCd); //�`�[�ԍ�
			adapt.setOutString(9); //�������ʁi���茋��)
			adapt.setOutInteger(10); //�������ʁi���ʃX�e�[�^�X�j

			adapt.execUpdate();

			//�`�F�b�N���ʂ̊i�[
			resultchk = adapt.getOutInteger(9).intValue(); 
			//���ʃX�e�[�^�X�̊i�[
			this.resultStatus = adapt.getOutInteger(10);
			
		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		
		if(resultchk == 1){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	/**
	 * ����v�㏈��  <BR>
	 *
	 * @param  slipCd  �`�[�ԍ�
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public void excSalesConf(String slipCd, int collectKey) throws FoundationException {
				
		//�����`�F�b�N
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return ;
		}
		this.collectKey = collectKey;
		
		this.resultStatus = null;
		
		IDbAdapter adapt = null;

		try {
			adapt =this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOG���[�h
			adapt.setString(2, this.outPutMode); //�o�̓��[�h
			adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName); //�o�̓t�@�C����
			adapt.setString(5, this.userCd); //���[�UID
			adapt.setString(6, this.businessCd); //�Ɩ���
			adapt.setString(7, this.plantCd); //�H��R�[�h
			adapt.setString(8, slipCd); //�`�[�ԍ�
			adapt.setOutInteger(9); //�������ʁi���ʃX�e�[�^�X�j

			adapt.execUpdate();

			//���ʃX�e�[�^�X�̊i�[
			this.resultStatus = adapt.getOutInteger(9);
			
		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return;
	}
	

	/**
	 * �̔��P���擾  <BR>
	 *
	 * @param  companyCd  ��ЃR�[�h
	 * @param  custCd  ���Ӑ�R�[�h
	 * @param  itemCd  �i�ڔԍ�
	 * @param  purposeunitpriceTyp  �p�r�ʒP���敪
	 * @param  dlvDate  ���t
	 * @param  Qty  ����
	 * @return �擾���ʂ��i�[�������X�g (1:�P�� 2:�P�ʋ敪 3:���z *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public List getSalesUnitCost(String companyCd,String custCd,String itemCd,String purposeunitpriceTyp,
		String dlvDate,String Qty) throws FoundationException {
				
		//�����`�F�b�N
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}
		this.collectKey = GETSALESUNITCOST;
		
		this.resultStatus = null;
		this.resultList = new ArrayList();

		IDbAdapter adapt = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOG���[�h
			adapt.setString(2, this.outPutMode); //�o�̓��[�h
			adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName); //�o�̓t�@�C����
			adapt.setString(5, this.userCd); //���[�UID
			adapt.setString(6, this.businessCd); //�Ɩ���
			adapt.setString(7, this.plantCd); //�H��R�[�h
			adapt.setString(8, companyCd); //��ЃR�[�h
			adapt.setString(9, custCd); //���Ӑ�R�[�h
			adapt.setString(10, itemCd); //�i�ڔԍ�
			adapt.setString(11, purposeunitpriceTyp); //�p�r�ʒP���敪
			adapt.setString(12, dlvDate); //���t
			adapt.setString(13, Qty); //����
			adapt.setOutString(14); //�������ʁi�P��)
			adapt.setOutString(15); //�������ʁi�P�ʋ敪)
			adapt.setOutString(16); //�������ʁi���z)
			adapt.setOutInteger(17); //�������ʁi���ʃX�e�[�^�X�j

			adapt.execUpdate();

			//���ʃX�e�[�^�X�̊i�[
			this.resultStatus = adapt.getOutInteger(17);
			
			//���ʃX�e�[�^�X������I���̏ꍇ�A�������ʂ̊i�[
			if(this.resultStatus.intValue() == 1){
				for(int i =14 ; i< 17 ; i++)
				if(adapt.getOutString(i) == null){
					resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
				}else{
					resultList.add(adapt.getOutString(i)); 
				}
			}
		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return resultList;
	}
	
	
    
    /*********************************************************************
     *** �v���C�x�[�g�֐�
     *********************************************************************/
    
    /**
     * IDbAdapter�̕ԋp
     *
     * @param  conn IDbConnection
     * @return  collectKey�ɂ��IDbAdapter���擾
     * @throws FoundationException
     */
    private IDbAdapter getAdapt(IDbConnection conn) throws FoundationException {

        //collectKey�ɂ��SP���i�̌Ăяo����؂蕪����
        switch (this.collectKey) {
            case INITSALESPROCFD:          // �̔��Ǘ���������
                return conn.getSpAdapter("begin SQLINITSALESPROCFD(?,?,?,?,?,?,?,?,?,?," +
                                                                        "?,?,?,?,?,?); end;");

            case EXCARFIFFD:          // ���|IF����
                return conn.getSpAdapter("begin SQLEXCARFIFFD(?,?,?,?,?,?,?,?,?,?," +
                                                                        "?,?,?); end;");
            case GETSCMCOMPANYCD:
            	return conn.getSpAdapter("begin SQLGETSCMCOMPANY(?,?,?,?,?,?,?,?); end;");
			
            case SALES_SEQ_NO:      //������ъǗ��ԍ�
				return conn.getSpAdapter("begin SQLGETNEWSALESSEQNO(?,?,?,?,?,?,?,?,?,?); end;");
				
			case SCM_SLIP_CD:       //�`�[�ԍ��i�r�b�l�j
				return conn.getSpAdapter("begin SQLGETNEWSCMSLIPCD(?,?,?,?,?,?,?,?,?,?); end;");
			
			case SLIP_CD:       //�`�[�ԍ��i�r�b�l�j
				return conn.getSpAdapter("begin SQLGETNEWSLIPCD(?,?,?,?,?,?,?,?,?); end;");
                
			case CALCTAXFD://����Ōv�Z
    			return conn.getSpAdapter("begin SQLCALCTAXFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
    			
			case EXCSALESCHECK://����v�㔻�菈��
			    return conn.getSpAdapter("begin SQLEXCSALESCHECK(?,?,?,?,?,?,?,?,?,?); end;");

			case EXCSALESCONF://����v�㏈��
			    return conn.getSpAdapter("begin SQLEXCSALESCONF(?,?,?,?,?,?,?,?,?); end;");

			case EXCSALESCONFSCM://����v�㏈��
			    return conn.getSpAdapter("begin SQLEXCSALESCONFSCM(?,?,?,?,?,?,?,?,?); end;");

			case GETSALESUNITCOST://�̔��P���擾
			    return conn.getSpAdapter("begin SQLGETSALESUNITCOST(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
				
            default:
                throw new FoundationException("default", "getAdapt", "��`�O�̃G���[���������܂����B");
        }
    }

    /**
     * �v���p�e�B�t�@�C�������LOG�o�͏��擾
     */
    private void readProperty() throws FoundationException {
        try {
            ResourceBundle rb = SystemConfig.getBundle();
            this.logMode = SystemConfig.getProperty("LOG_MODE", rb);
            this.outPutMode = SystemConfig.getProperty("OUTPUT_MODE", rb);
            this.outPutPath = SystemConfig.getProperty("OUTPUT_PATH", rb);
            this.outPutName = SystemConfig.getProperty("OUTPUT_NAME", rb);
        }
        catch (MissingResourceException mre) {
            FoundationException fe = new FoundationException("Numbering",
                mre.getMessage(), "�v���p�e�B�t�@�C���̓ǂݍ��݂Ɏ��s���܂����B");
            fe.setPreviousException(mre);
            throw fe;
        }
    }




    
   /*********************************************************************
    *** ���ʕԋp�l
    *********************************************************************/
   
    /**
     * �������ʃX�e�[�^�X�̎擾
     * @return  �������ʂ̃X�e�[�^�X���擾(���s�O�A�������̓G���[�Ŏ��s�ł��Ȃ������ꍇ��null��ԋp����j
     */
    public Integer getResultStatus() {
        return this.resultStatus;
    }
    
}
