/**
 * <p>�^�C�g��: EXPJ���ʃN���X</p>
 * <p>����: EXPJ���ʕ�����֘A���\�b�h</p>
 * <p>���쌠: Copyright (c) 2003</p>
 * <p>��Ж�: NIS</p>
 * @author NIS
 * @version 1.0
 *
 * 2003/07/29 ���� �쐬
 * 2003/11/13 y.takematsu EXPJ�V�X�e�����p�ׁ̈A�p�b�P�[�W���ύX
 */

package com.nec.jp.orteus.metamorBase.common06.util;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class stringUtil {

    /**
     * ������(Byte)���擾���܂�
     * @param Val ������
     * @return Val�̒���(byte)
     */
    static public int getByteLength(String val) {
        // ������
        if ( val == null || val.length() == 0 ){
            return 0;
        }
        byte[] bLen = val.getBytes();
        return bLen.length;
    }

    /**
     * 2byte�����L���`�F�b�N
     * @param Val ������
     * @return true:2byte���� false:1byte�̂�
     */
    static public boolean has2Byte(String Val) {
        if (Val == null){
            return false;
        }
        if (Val.length() != getByteLength(Val)) {
            return true;
        }
        return false;
    }

    /**
     * ������̈ꕔ���w�肵���o�C�g�����ɐ؂�o������
     * �������r���ŕ��f�����ꍇ�́A���̕������Ȃ� ���p�X�y�[�X�ɒu������
     *
     * @param str �Ώە�����
     * @param beginIndex �J�n�ʒu (�擪0)
     * @param len �擾�o�C�g��
     * @return �w�肵���o�C�g���ɃJ�b�g��������������
     */
    public static String stringSlice(String str, int beginIndex, int len) {
        // ������
        if (null == str) {
            return null;
        }
        // �o�C�g��0
        if (len <= 0) {
            return "";
        }

        try{
            StringReader reader = new StringReader(str);
            StringWriter writer = new StringWriter();
            int iTotalLength = 0;

            // �J�n�ʒu�ړ�
            for (int iCurrentLength = 0; iCurrentLength < beginIndex; ) {
                // �P�������Ǎ�
                int iRead = reader.read();
                // �X�g���[���G���h�i-1�j
                if (iRead < 0) {
                    // �J�n�ʒu�ȉ�
                    return "";
                }

                if (isDoubleByte(iRead)) {
                    iCurrentLength += 2;
                    if (iCurrentLength >= beginIndex) {
                        // �Q�o�C�g�����̐^���Ő؂�ꍇ:���p�X�y�[�X�u��
                        if (iCurrentLength > beginIndex) {
                            writer.write(' ');
                            iTotalLength++;
                        }
                        break;
                    }
                }
                else {
                    iCurrentLength += 1;
                }
            }

            // �w�蒷�ǎ�
            while (iTotalLength < len) {
                int iRead = reader.read();
                // �X�g���[���G���h�i-1�j
                if (iRead < 0) {
                    break;
                }

                if (isDoubleByte(iRead)) {
                    iTotalLength += 2;
                    // �Q�o�C�g�����̐^���Ő؂�ꍇ:���p�X�y�[�X�u��
                    if (iTotalLength > len) {
                        writer.write(' ');
                        break;
                    }
                }
                else {
                    iTotalLength += 1;
                }
                writer.write(iRead);
            }

            writer.flush();
            writer.close();
            return writer.toString();
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * �Q�o�C�g��������
     * @param iCode �����R�[�h
     * @return �Q�o�C�g�����Ȃ� true, �P�o�C�g�����Ȃ� false
     */
    private static boolean isDoubleByte(int iCode) {
        return ((2 == getBytesLength(iCode)) ? true : false);
    }

    /**
     * �����R�[�h�ɊY�����镶���̃o�C�g�����擾���鏈���B<BR>
     *          return new Character((char)iCode).toString().getBytes().length;
     * ���̕��@��p����Ɛ��m�ȃo�C�g���𔻒肷�邱�Ƃ��ł���B
     *  ��j
     *      '�~' -> �Q�o�C�g
     *      '�' -> �P�o�C�g
     * ��L�̂悤�ɁA����ȂQ�o�C�g�����iU+0000 ���� U+00FF �܂ł� Unicode �Ƀ}�b�s���O
     * ��Ă���Q�o�C�g�����j��A���p�J�i�����̃o�C�g���𐳊m�Ɏ擾���邱�Ƃ��ł���B
     *
     * @param iCode �����R�[�h
     * @return �o�C�g���i1 or 2�j
     */
    private static int getBytesLength(int iCode) {
        return new Character((char)iCode).toString().getBytes().length;
    }
}