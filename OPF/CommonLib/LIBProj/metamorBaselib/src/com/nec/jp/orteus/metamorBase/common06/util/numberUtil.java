/**
 * <p>�^�C�g��: EXPJ���ʃN���X</p>
 * <p>����: EXPJ���ʐ��l�֘A���\�b�h</p>
 * <p>���쌠: Copyright (c) 2003</p>
 * <p>��Ж�: NIS</p>
 * @author NIS
 * @version 1.0
 *
 * 2003/07/29 ���� �쐬
 * 2003/11/13 y.takematsu EXPJ�V�X�e�����p�ׁ̈A�p�b�P�[�W���ύX
 * 2004/01/24 �J���}�t�������ύX(.X�Ή�)
 * 2004/02/09 �J���}�t�������ύX(-.X�Ή�)
 */

package com.nec.jp.orteus.metamorBase.common06.util;

import java.math.BigDecimal;

public class numberUtil {

    /**
     * �l�̌ܓ�
     * @param val �l�̌ܓ����鐔�l������(�J���}�t���͕s��)
     * @param i    �l�Ҍܓ����鏬���_�ȉ��̈ʁi�����ɂ���ꍇ�͂O�j
     * @return val�̏����_��i���Ŏl�̌ܓ��������l,���s�����ꍇ�ɂ�""��Ԃ�
     */
    static public String roundNumber(String val, int i){
        try{
            BigDecimal bd = new BigDecimal(val);
            BigDecimal bd2 = bd.setScale(i, BigDecimal.ROUND_HALF_UP);
            return bd2.toString();
        }catch(Exception e){
            return "";
        }
    }

    /**
     * ������̓���'0'��t��
     * @param val  ���̕�����(1byte������̂�)
     * @param imax ������(val�Ŏw�肵��������imax���ȏ�̌����̏ꍇ��val�����񂪂��̂܂ܕԂ�)
     * @return val�̓���'0'��t������������
     */
    static public String addZero(String val, int imax) {
        String rtn = "";
        if (val.length() >= imax){
            return val;
        }
        for (int x=0; x < imax - val.length(); x++){
            rtn = rtn + "0";
        }
        rtn = rtn + val;
        return rtn;
    }

    /**
     * �J���}�t�����l��������J���}�Ȃ����l������ɕϊ�
     * @param val �J���}�t�����l������
     * @return ���l������ ���s���ɂ�""(�󕶎�)��Ԃ�
     */
    static public String decodeNumberFormat(String val) {
        // �����̓`�F�b�N
        if ( val == null || val.length() == 0 ){
            return "";
        }
        // �擪�����`�F�b�N
        if ( val.charAt(0) == '.' ){
            return "";
        }

        // �g�p������
        String chkRealNum="0123456789.-";

        boolean hasComma = false;
        String conv="";

        try{
            //���l�`�F�b�N
            for (int x = 0; x < val.length(); x++) {
                boolean chkflg = false;
                for (int y=0; y < chkRealNum.length(); y++) {
                    if (val.charAt(x) == chkRealNum.charAt(y)) {
                        chkflg = true;
                        break;
                    }
                    else if (val.charAt(x)==',') {
                        hasComma=true;
                        chkflg = true;
                        break;
                    }
                }
                if (chkflg != true){
                    // �`���s��
                    return "";
                }
            }

            // �����_�m�F
            boolean fg = false;
            int x = 0;
            for (x = 0; x< val.length(); x++) {
                if (val.charAt(x) == '.') {
                    fg = true;
                    break;
                }
            }

            // �����E�������o
            String seisu = val.substring(0,x);
            String syosu = "";
            if (fg == true){
                syosu = val.substring(x, val.length());
            }

            // �������ꌅ�ڃ`�F�b�N
            boolean mflg = false;
            if ( seisu.charAt(0) == '-' ){
                mflg = true;
                seisu=seisu.substring(1, seisu.length());
            }

            // �J���}�`�F�b�N������
            if (hasComma == true){
                int lop = 0;
                for (x = seisu.length()-1; x >= 0; x--) {
                    if (lop == 3){
                        if (seisu.charAt(x) == ',' && x != 0){
                        }
                        else {
                            return "";
                        }
                        lop = 0;
                    }
                    else {
                        conv = seisu.charAt(x) + conv;
                        lop++;
                    }
                }
            }
            else {
                conv = seisu;
            }
            conv=conv + syosu;

            if ( mflg == true ){
                conv = "-" + conv;
            }

            // ���l�ϊ�
            Double dData = Double.valueOf(conv);
        }catch(Exception e){
            return "";
        }
        return conv;
    }

    /**
     * ���l��������J���}�t�����l������ɕϊ�
     * @param val ���l������i�J���}�Ȃ��j
     * @return �J���}�t�����l������ ���s���ɂ�""(�󕶎�)
     */
    static public String encodeNumberFormat(String val){
        // ���l�ϊ�
        try{
            Double dData = Double.valueOf(val);
        }
        catch(Exception e){
            return "";
        }

        // �擪�����`�F�b�N
        if ( val.charAt(0) == '.' ){
            // 2004/01/24 0��t���Ė߂�
            //return "";
            return "0"+val;
        }
        // 2004/02/09 �}�C�i�X�l��0��t���Ė߂�
        if ( val.charAt(0) == '-' && val.charAt(1) == '.' ){
            return "-0"+val.substring(1, val.length());
        }

        // �g�p������
        String chkRealNum="0123456789.-";

        //���l�`�F�b�N
        for (int x=0; x < val.length(); x++) {
            boolean chkflg = false;
            for (int y=0; y < chkRealNum.length(); y++) {
                if (val.charAt(x) == chkRealNum.charAt(y)){
                    chkflg = true;
                    break;
                }
            }
            if (chkflg != true) {
                // �`���s��
                return "";
            }
        }

        // �����_�m�F
        boolean fg = false;
        int x = 0;
        for (x = 0; x< val.length(); x++) {
            if (val.charAt(x) == '.') {
                fg = true;
                break;
            }
        }

        // �����E�������o
        String seisu = val.substring(0,x);
        String syosu = null;
        if ( fg == true ){
            syosu=val.substring(x, val.length());
        }
        if ( seisu.length() == 0 ){
            return "";
        }

        // �������ꌅ�ڃ`�F�b�N
        boolean mflg = false;
        if (seisu.charAt(0) == '-'){
            mflg = true;
            seisu=seisu.substring(1,seisu.length());
        }
        if (seisu.length() <= 3){
            return val;
        }

        int lop = 0;
        String ret = "";
        for (x=seisu.length()-1; x >= 0; x--) {
            if (lop == 3){
                ret = seisu.charAt(x) + "," + ret;
                lop = 0;
            }
            else{
                ret = seisu.charAt(x) + ret;
            }
            lop++;
        }
        if (mflg == true) {
            ret = "-" + ret;
        }
        if (fg == true){
            ret = ret + syosu;
        }
        return ret;
    }
}