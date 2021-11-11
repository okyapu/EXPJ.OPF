/**
 * <p>�^�C�g��: EXPJ���ʃN���X</p>
 * <p>����: EXPJ���ʃ`�F�b�N���\�b�h</p>
 * <p>���쌠: Copyright (c) 2003</p>
 * <p>��Ж�: NIS</p>
 * @author NIS
 * @version 1.0
 *
 * 2003/07/29 ���� �쐬
 * 2003/11/13 y.takematsu EXPJ�V�X�e�����p�ׁ̈A�p�b�P�[�W���ύX
 */

package com.nec.jp.orteus.metamorBase.common06.util;

public class formatCheck{

	/**
	 * ���t�`���`�F�b�N("YYYY/MM/DD"�`��)
	 * @param ���t�i�����^�j
	 * @return ���t�`�������������true,����Ă����false
	 */
	static public boolean isDateFormat(String dateString) {
        // �����̓`�F�b�N
        if ( dateString == null || dateString.length() == 0 ){
			return false;
		}
        // �����`�F�b�N
		if ( stringUtil.getByteLength(dateString) != 10 ){
			return false;
		}
        // �Q�o�C�g�����`�F�b�N
		if ( stringUtil.has2Byte(dateString) == true ){
			return false;
		}

        boolean iflag = false;
        try{
            // �N�������o
            String year = dateString.substring(0,4);
			String month = dateString.substring(5,7);
			String day = dateString.substring(8,10);

            // ���l�ϊ�
            int iyear = Integer.parseInt(year);
			int imonth = Integer.parseInt(month);
			int iday = Integer.parseInt(day);

            // �N���͈�
            if ( ( 1900 < iyear && 2100 > iyear ) && ( imonth <= 12 && imonth >= 1 ) ){
                // 31���܂ł̌�
                if ( imonth == 1 || imonth == 3 || imonth == 5 || imonth == 7 || imonth == 8 || imonth == 10 || imonth == 12 ){
                    if ( iday >= 1 && iday <= 31 ){
                        iflag = true;
					}
                }
                // 30���܂ł̌�
                else if ( imonth != 2 ){
					if ( iday >= 1 && iday <= 30 ){
						iflag = true ;
					}
				}
                // 2��
                else{
					int imax = 28;
                    // ���邤�N
					if ( iyear % 4 == 0 ){
						if ( iyear % 100 != 0 ){
							imax=29;
						}else if ( iyear % 400 == 0 ){
							imax=29;
						}else{
							imax=28;
						}
					}else{
						imax = 28;
					}
					if ( iday >= 1 && iday <= imax ){
						iflag = true;
					}
				}
			}

		}catch(NumberFormatException n){
			return false;
		}
		return iflag;
	}

	/**
	 * ���l�`���`�F�b�N
	 * @param �`�F�b�N���鐔�l
	 * @return ���l�`�������������true, ����Ă����false
	 */
	static public boolean isNumberFormat(String val) {
        // �����̓`�F�b�N
		if ( val == null || val.length() == 0 ){
			return false;
		}

		double d;
		Double dD;
		boolean iflag = true;

		try {
            // ���l�ϊ�
			dD = Double.valueOf(val);
            // �擪����
			if ( val.charAt(0) == '.' ) {
				return false;
			}
		}
        catch (NumberFormatException n) {
		    iflag = false;
		}
		return iflag;
	}

    /**
     * ���l�`���`�F�b�N(�w��`��)
     * @param val �`�F�b�N���鐔�l
     * @param i   �`�F�b�N���鐮���������i�ȓ��j
     * @param m   �`�F�b�N���鏬���������i�ȓ��j
     * @return ���l�`�������������true, ����Ă����false
     */
    static public boolean isNumberFormat(String val, int i, int m) {
        // �����̓`�F�b�N
        if ( val == null || val.length() == 0 ){
            return false;
        }
        // �擪�����`�F�b�N
        if ( val.charAt(0) == '.' ){
            return false;
        }

        // �g�p������
        String chkRealNum="0123456789.-";

        // ���l�ϊ�
        try{
            Double chkD = Double.valueOf(val);
        }
        catch (NumberFormatException n) {
            return false;
        }

        // �����`�F�b�N
        for (int x = 0; x < val.length(); x++) {
            boolean chkflg = false;
            for (int y = 0; y < chkRealNum.length(); y++ ){
                if (val.charAt(x) == chkRealNum.charAt(y)){
                    chkflg = true;
                    break;
                }
            }
            if (!chkflg){
                // �s�������g�p
                return false;
            }
        }

        //�����`�F�b�N
        int idx=0;
        boolean hasdot = false;
        for( int x = 0; x < val.length()-1; x++ ){
            if ( val.charAt(x) == '.' ){
                hasdot = true;
                idx = x;
                // ��������
                if (val.length()-(x+1) > m) {
                    return false;
                }
                break;
            }
        }

        boolean mflg = false;
        if ( val.length() > 1 && val.charAt(0) == '-' ){
            // �}�C�i�X�l
            val = val.substring(1, val.length());
            mflg = true;
            idx--;
        }
        //����������
        if (hasdot == true){
            if (idx > i) {
                return false;
            }
        }else{
            if (val.length() > i){
                return false;
            }
        }
        return true;
    }

    /**
     * ���l�`���`�F�b�N�i�����_�ȉ��Q���ȓ��j
     * @param �`�F�b�N���鐔�l
     * @return ���l�`�������������true, ����Ă����false
     */
    static public boolean isNumberFormat2(String val) {
        // �����̓`�F�b�N
		if ( val == null || val.length() == 0 ) {
			return false;
		}

        double d;
        Double dD;
        int idx=0;
        boolean iflag = true;

		try {
            // ���l�ϊ�
            dD = Double.valueOf(val);
            // �擪����
            if ( val.charAt(0) == '.' ){
                return false;
            }
            // �����_�ȉ�����
            for (int x = 0; x < val.length()-1; x++){
                if ( val.charAt(x) == '.' ){// .����
                    idx = x;
                    if (val.length()-(x+1) > 2){
                        iflag = false;
                    }
                    break;
                }
            }
		}
        catch (NumberFormatException n) {
			return false;
		}
		return true;
	}
}