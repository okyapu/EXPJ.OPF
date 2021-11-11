/**
 *(#)Numbering.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author K.Murakami
 * Date : 2003/10/16
 * @version 1.01
 * History 2003/08/17 CollectNumber���R�s�[���ĐV�K�쐬 T.Taniguchi
 *         2003/10/16 ���Ԉ����Ǘ��ԍ��̔ԃL�[�ǉ� K.Murakami
 */
package com.nec.jp.orteus.metamorBase.common.CollectNumber;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import com.nec.jp.orteus.xaf.util.FoundationException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * �̔Ԃ��s���N���X
 */
public class Numbering{

	/**
	 * ��ƌv��ԍ��̔ԃL�[
	*/
	static final public int ODR_CD = 1;
	/**
	 * ��Ǝw���ԍ��̔ԃL�[
	*/
	static final public int INST_CD = ODR_CD + 1;
	/**
	 * �����ԍ��̔ԃL�[
	*/
	static final public int PUCH_CD = INST_CD + 1;
	/**
	 * �o�Ɏw���ԍ��̔ԃL�[
	*/
	static final public int ISS_INST_CD = PUCH_CD + 1;
	/**
	 * ���o�ɔԍ��̔ԃL�[
	*/
	static final public int ISSUE_CD = ISS_INST_CD + 1;
	/**
	 * �o�������єԍ��̔ԃL�[
	*/
	static final public int OUT_RSLT_CD = ISSUE_CD + 1;
	/**
	 * ���׎��ʔԍ��̔ԃL�[
	*/
	static final public int LOAD_CD = OUT_RSLT_CD + 1;
	/**
	 * �v�掯�ʔԍ��̔ԃL�[
	*/
	static final public int LOAD_PLAN_CD = LOAD_CD + 1;
	/**
	 * �\����ʃL�[�̔ԃL�[
	*/
	static final public int LOAD_PS_CD = LOAD_PLAN_CD + 1;
	/**
	 * �L���x���ԍ��̔ԃL�[
	*/
	static final public int ONERCONS_CD = LOAD_PS_CD + 1;
	/**
	 * �ϑ��`�[�ԍ��̔ԃL�[
	*/
	static final public int TRANSLIP_CD = ONERCONS_CD + 1;
	/**
	 * ���ԍ̔ԃL�[
	*/
	static final public int JOB_OD_CD = TRANSLIP_CD + 1;
	/**
	 * LOG���ʔԍ��̔ԃL�[
	*/
	static final public int LOG_CD = JOB_OD_CD + 1;
	/**
	 * �I�[�_�f�}���h�ԍ��̔ԃL�[
	*/
	static final public int ODNO = LOG_CD + 1;
	/**
	 * ���Ԉ����Ǘ��ԍ��̔ԃL�[
	*/
	static final public int JOB_OD_ALC_CD = ODNO + 1;
	/**
	 * �N�G���[�ԍ��̔ԃL�[
	*/
	static final public int QUERY_CD = JOB_OD_ALC_CD + 1;
	/**
	 * �O���v��ԍ��̔ԃL�[
	*/
	static final public int EXTERNAL_PLAN_CD = QUERY_CD + 1;

	static final public int MAX = EXTERNAL_PLAN_CD;

	public int collectKey = 0;
	protected String userCd = null;
	protected String businessCd = null;
	protected String plantCd = null;
	protected String logMode = null;
	protected String outPutMode = null;
	protected String outPutPath = null;
	protected String outPutName = null;
	protected Integer resultStatus = null;
	protected SystemLog sysLog = null;
	protected IDbConnection conn = null;

	/**
	 * �R���X�g���N�^
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  collectKey   �̔ԃL�[
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	*/
	public Numbering(IDbConnection conn,int collectKey,String userCd,String businessCd,String plantCd) throws FoundationException{
		this.conn = conn;
		this.collectKey = collectKey;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;

		this.readProperty();

//		this.sysLog = new SystemLog();
	}


	/**
	 * �̔Ԃ����ԍ���ԋp����B�iSP���i�g�p�j
	 *
	 * @return            �̔Ԃ��ꂽ�ԍ���ԋp�A�̔Ԃ���Ȃ������ꍇnull��ԋp
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public String getNo() throws FoundationException{
		//�����`�F�b�N
		if(collectKey < 1 || collectKey > this.MAX || this.userCd == null || 
			this.businessCd == null || this.plantCd == null || logMode == null || 
			outPutMode == null || outPutPath == null || outPutName == null){
			return null;
		}

		this.resultStatus = null;
		String returnNo = null;

		IDbAdapter adapt = null;

		//conn.beginTransWeb();
		try{
			adapt = this.getAdapt(conn);
			adapt.setString(1,this.logMode);//LOG���[�h
			adapt.setString(2,this.outPutMode);//�o�̓��[�h
			adapt.setString(3,this.outPutPath);//�o�̓t�@�C���p�X
			adapt.setString(4,this.outPutName);//�o�̓t�@�C����
			adapt.setString(5,this.userCd);//���[�UID
			adapt.setString(6,this.businessCd);//�Ɩ���
			adapt.setString(7,this.plantCd);//�H��R�[�h
			adapt.setOutString(8);//�̔Ԍ���
			adapt.setOutInteger(9);//�̔Ԍ���

			adapt.execUpdate();

			returnNo = adapt.getOutString(8);
			this.resultStatus = adapt.getOutInteger(9);

			//conn.commit();
		}finally{
			if(adapt != null){
				adapt.close();
				adapt = null;
			}
		}
		return returnNo;
	}


	/**
	 * IDbAdapter��ԋp����
	 *
	 * @param  conn       IDbConnection
	 * @return            collectKey�ɂ��IDbAdapter���擾
	 * @throws FoundationException
	 */
	private IDbAdapter getAdapt(IDbConnection conn) throws FoundationException{

		//collectKey�ɂ��SP���i�̌Ăяo����؂蕪����
		switch(this.collectKey){
			case ODR_CD        : return conn.getSpAdapter("begin SQLGETNEWODRCD(?,?,?,?,?,?,?,?,?); end;");//��ƌv��
			case INST_CD       : return conn.getSpAdapter("begin SQLGETNEWINSTCD(?,?,?,?,?,?,?,?,?); end;");//��Ǝw��
			case PUCH_CD       : return conn.getSpAdapter("begin SQLGETNEWPUCHCD(?,?,?,?,?,?,?,?,?); end;");//�����ԍ�
			case ISS_INST_CD   : return conn.getSpAdapter("begin SQLGETNEWISSINSTCD(?,?,?,?,?,?,?,?,?); end;");//�o�Ɏw��
			case ISSUE_CD      : return conn.getSpAdapter("begin SQLGETNEWISSUECD(?,?,?,?,?,?,?,?,?); end;");//���o��
			case OUT_RSLT_CD   : return conn.getSpAdapter("begin SQLGETNEWOUTRSLTCD(?,?,?,?,?,?,?,?,?); end;");//�o��������
			case LOAD_CD       : return conn.getSpAdapter("begin SQLGETNEWLOADCD(?,?,?,?,?,?,?,?,?); end;");//���׎���
			case LOAD_PLAN_CD  : return conn.getSpAdapter("begin SQLGETNEWLOADPLANCD(?,?,?,?,?,?,?,?,?); end;");//�v�掯��
			case LOAD_PS_CD    : return conn.getSpAdapter("begin SQLGETNEWLOADPSCD(?,?,?,?,?,?,?,?,?); end;");//�v�掯��
			case ONERCONS_CD   : return conn.getSpAdapter("begin SQLGETNEWONERCONSCD(?,?,?,?,?,?,?,?,?); end;");//�L���x��
			case TRANSLIP_CD   : return conn.getSpAdapter("begin SQLGETNEWTRANSLIPCD(?,?,?,?,?,?,?,?,?); end;");//�ϑ��`�[
			case JOB_OD_CD     : return conn.getSpAdapter("begin SQLGETNEWJOBODRCD(?,?,?,?,?,?,?,?,?); end;");//����
			case LOG_CD        : return conn.getSpAdapter("begin SQLGETNEWLOGCD(?,?,?,?,?,?,?,?,?); end;");//LOG���ʔԍ�
			case ODNO          : return conn.getSpAdapter("begin SQLGETNEWODNO(?,?,?,?,?,?,?,?,?); end;");//�I�[�_�f�}���h
            case JOB_OD_ALC_CD : return conn.getSpAdapter("begin SQLGETNEWJOBODRALCD(?,?,?,?,?,?,?,?,?); end;");//���Ԉ���
            case QUERY_CD      : return conn.getSpAdapter("begin SQLGETNEWQUERYCD(?,?,?,?,?,?,?,?,?); end;");//�N�G���[�ԍ�
            case EXTERNAL_PLAN_CD : return conn.getSpAdapter("begin SQLGETNEWEXTPLANCD(?,?,?,?,?,?,?,?,?); end;");//�O���v��ԍ�
			default            : throw new FoundationException("Numbering","getAdapt","(SBM0855)��`����Ă��Ȃ��̔ԃL�[���Z�b�g����܂����B");
		}
	}


	/**
	 * LOG�o�͏����v���p�e�B�t�@�C������ǂݍ���
	*/
	private void readProperty() throws FoundationException{
		try{
			ResourceBundle rb = SystemConfig.getBundle();
			this.logMode = SystemConfig.getProperty("LOG_MODE",rb);
			this.outPutMode = SystemConfig.getProperty("OUTPUT_MODE",rb);
			this.outPutPath = SystemConfig.getProperty("OUTPUT_PATH",rb);
			this.outPutName = SystemConfig.getProperty("OUTPUT_NAME",rb);
		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException("Numbering",mre.getMessage(),"(SBM0854)�v���p�e�B�t�@�C���̓ǂݍ��݂Ɏ��s���܂����B");
			fe.setPreviousException(mre);
			throw fe;
		}
	}


	/**
	 * �������ʂ��擾����
	 * @return         �̔Ԍ��ʂ̃X�e�[�^�X���擾
	 */
	public Integer getResultStatus(){
		return this.resultStatus;
	}


	/**
	 * �̔ԑ̌n���`�F�b�N����i����͐��Ԃ̂ݑΉ��j
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  collectKey   �̔ԃL�[
	 * @param  plantCd      �H��R�[�h
	 * @param  number       �`�F�b�N�Ώ۔ԍ�
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException
	 */
	public static boolean checkNumber(IDbConnection conn,int collectKey,String plantCd,String number) throws FoundationException{
		if(plantCd == null || number == null){
			return false;
		}
		try{
			switch(collectKey){
				case JOB_OD_CD     : return checkJOB_OD_CD(conn,plantCd,number);
				default            : throw new FoundationException("Numbering","checkNumber","(SBM0856)�̔ԃL�[���s���ł�");
			}
		}catch(Exception e){
			FoundationException fe = new FoundationException("Numbering","checkNumber","(SBM0857)�̌n�`�F�b�N����DB�G���[���������܂���");
			fe.setPreviousException(e);
			throw fe;
		}
	}


	/**
	 * ���ԑ̌n���`�F�b�N����
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  plantCd      �H��R�[�h
	 * @param  number       ����
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(IDbConnection conn,String plantCd,String number) throws FoundationException,SQLException{
		String query = "select length(JOB_OD_CD) as LENGTH,JOB_OD_CD_PREFIX AS PREFIX from SYS_JOB_ODR_CD_CTRL ";
		query = query + "WHERE PLANT_CD=?";

		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			stmt = conn.getConn().prepareStatement(query);
			stmt.setString(1,plantCd);
			rs = stmt.executeQuery();
			if(!rs.next()){
				return false;
			}
			int strLength = rs.getInt("LENGTH");//�ԍ��̌���
			String prefix = rs.getString("PREFIX");//PREFIX

			if(plantCd == null || prefix == null){
				return false;
			}

			//�H��R�[�h��1���̏ꍇ"_"��t������
			if(plantCd.length() == 1){
				plantCd = "_" + plantCd;
			}

			//�Ώ۔ԍ��̌����`�F�b�N
			if(number.length() != prefix.length() + plantCd.length() + strLength){
				return false;
			}

			String numberPrefix = number.substring(0,prefix.length());
			//�v���t�B�b�N�X�`�F�b�N
			if(!prefix.equals(numberPrefix)){
				return false;
			}

			//�H��R�[�h�`�F�b�N
			int index = prefix.length();
			String numberPlantCd = number.substring(index,index + plantCd.length());
			if(!plantCd.equals(numberPlantCd)){
				return false;
			}
		}finally{
			if(rs != null){
				rs.close();
				rs = null;
			}
			if(stmt != null){
				stmt.close();
				stmt = null;
			}
		}
		return true;
	} 


	/**
	 * �̔ԑ̌n���`�F�b�N����i����͐��Ԃ̂ݑΉ��j
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  collectKey   �̔ԃL�[
	 * @param  number       �`�F�b�N�Ώ۔ԍ�
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException
	 */
	public static boolean checkNumber(IDbConnection conn,int collectKey,String number) throws FoundationException{
		if(number == null){
			return false;
		}
		try{
			switch(collectKey){
				case JOB_OD_CD     : return checkJOB_OD_CD(conn,number);
				default            : throw new FoundationException("Numbering","checkNumber","(SBM0856)�̔ԃL�[���s���ł�");
			}
		}catch(SQLException e){
			FoundationException fe = new FoundationException("Numbering","checkNumber","(SBM0857)�̌n�`�F�b�N����DB�G���[���������܂���");
			fe.setPreviousException(e);
			throw fe;
		}
	}


	/**
	 * ���ԑ̌n���`�F�b�N����
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  number       ����
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(IDbConnection conn,String number) throws FoundationException,SQLException{
		String query = "select PLANT_CD,length(JOB_OD_CD) as LENGTH,JOB_OD_CD_PREFIX AS PREFIX from SYS_JOB_ODR_CD_CTRL";

		IDbAdapter adapt = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		boolean checkNumber = false;
		try{
			stmt = conn.getConn().prepareStatement(query);
			rs = stmt.executeQuery();

			while(!checkNumber && rs.next()){
				String plantCd = rs.getString("PLANT_CD");
				int strLength = rs.getInt("LENGTH");//�ԍ��̌���
				String prefix = rs.getString("PREFIX");//PREFIX

				if(plantCd == null || prefix == null){
					continue;
				}

				//�H��R�[�h��1���̏ꍇ"_"��t������
				if(plantCd.length() == 1){
					plantCd = "_" + plantCd;
				}

				//�Ώ۔ԍ��̌����`�F�b�N
				if(number.length() != prefix.length() + plantCd.length() + strLength){
					continue;
				}

				String numberPrefix = number.substring(0,prefix.length());
				//�v���t�B�b�N�X�`�F�b�N
				if(!prefix.equals(numberPrefix)){
					continue;
				}

				//�H��R�[�h�`�F�b�N
				int index = prefix.length();
				String numberPlantCd = number.substring(index,index + plantCd.length());
				if(!plantCd.equals(numberPlantCd)){
					continue;
				}

				checkNumber = true;
			}
		}finally{
			if(rs != null){
				rs.close();
				rs = null;
			}
			if(stmt != null){
				stmt.close();
				stmt = null;
			}
		}
		return checkNumber;
	} 
}

