/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/print/Printer.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.print;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * �g�p�\�ȃv�����^�p�̃f�[�^�N���X�B
 * ���X�g�{�b�N�X�f�[�^���擾����ׂ̃��[�e�B���e�B�N���X�B<BR>
 * �f�[�^���擾(getData)����O�ɃR�l�N�V�����̐ݒ�����Ă��������B
 *
 * @see PrinterStruct
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:06 $
 */
public class Printer {
	
	/** 
	 * DB�A�N�Z�X�p�̃R�l�N�V���� 
	 */
	private IDbConnection _conn = null;

	/** 
	 * �f�[�^�擾�p��SQL 
	 */
	private String _selectSql = 
		"select P.SEQ_NO,P.PRINTER_DISPLAY_NAME,DECODE(P.PRINTER_TYP='2',P.SPOOL_SERVER,PRINTER_NAME),P.PRINTER_TYP "
		+"from  SYS_PRINTERS P "
		+"where P.PLANT_CD = ? "
		+"  and P.PRINTER_USABLE_FLG = 1 "
		+"order by P.SEQ_NO";

	/**
	 * �I�u�W�F�N�g���\�z���܂��B
	 */
	public Printer(){
	}

	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z���܂��B
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public Printer(IDbConnection connect){
		_conn = connect;
	}

	/**
	 * �R�l�N�V�����ݒ�B<BR>
	 * �R�l�N�V�����̎Q�Ƃ𖳌��ɂ���ꍇ�A������null��ݒ肵�Ă��������B
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public void setConnection(IDbConnection connect){
		_conn = connect;
	}

	/**
	 * �w�肳�ꂽ�H��R�[�h�̃v�����^��`�f�[�^���擾���܂��B
	 *
	 * @param  plantCd �H��R�[�h
	 * @return �擾�����v�����^��`�f�[�^�B�f�[�^��SQQ_NO�̏����Ɋi�[����Ă��܂��B
	 * @throws SQLException SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public PrinterStruct getData(String plantCd) 
			throws SQLException
	{
		PrinterStruct rPrinter = new PrinterStruct();	// �R���{�{�b�N�X�f�[�^
		PreparedStatement stmt = null;					// �X�e�[�g�����g
		ResultSet rset = null;							// ���U���g�Z�b�g

		try{
			// SQL�쐬
			stmt = (_conn.getConn()).prepareStatement(_selectSql);
			stmt.setString(1, plantCd);
		
			// SQL���s
			rset = stmt.executeQuery();
		
			// ���ʂ�ݒ�
			while (rset.next()){
				String val = new String(rset.getString(1));
				String explan = new String(rset.getString(2));
				String printer = new String(rset.getString(3));
				String type = new String(rset.getString(4));
				rPrinter.addData(val, explan, printer, type);
			}
			
			// �擾�f�[�^��0�ȉ��̏ꍇ�A��O����
			if (rPrinter.size() <= 0){
				String val     = new String("0");
				String explan  = new String("�N���C�A���g���");
				String printer = new String("�N���C�A���g���");
				String type    = new String("1");
				rPrinter.addData(val, explan, printer, type);
			}
			return rPrinter;
		}catch(Exception e){
			// �擾�f�[�^��0�ȉ��̏ꍇ�A��O����
			if (rPrinter.size() <= 0){
				String val     = new String("0");
				String explan  = new String("�N���C�A���g���");
				String printer = new String("�N���C�A���g���");
				String type    = new String("1");
				rPrinter.addData(val, explan, printer, type);
			}
			return rPrinter;
		}finally{
			if (rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if (stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}
}

