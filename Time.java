/* �\�[�X����
    Data�N���X�ACalendar�N���X���g�p���āA���Ԃ��擾����v���O�����B
    Date�N���X���ݎ������擾���邽�߂̃N���X�B
    Calender�N���X�̎q�N���X�ɂ���AGregorianCalender�N���X���g���āAData�N���X�̃I�u�W�F�N�g���A
    �N�A���A���A���Ԃ̌`���ɐ؂�ւ���B

    �^�C�}�[�Ɏg����H
*/

import java.util.*;

class Time{
    public static void main(String[] args){
        Date date = new Date();
        Calendar cal = new GregorianCalendar();

        System.out.println(date);

        long a = System.currentTimeMillis();
        System.out.println(a);

        System.out.println(cal.get(Calendar.YEAR) + "�N" + 
        (cal.get(Calendar.MONTH)+1) + "��" + 
        cal.get(Calendar.DAY_OF_MONTH) + "�� " + 
        cal.get(Calendar.HOUR_OF_DAY) + ":" +
        cal.get(Calendar.MINUTE) + ":" +
        cal.get(Calendar.SECOND));
    }
}