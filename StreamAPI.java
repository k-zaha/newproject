/*  StreamAPI���g�p�����ۂ̃\�[�X�@������
    StreamAPI���g�p(import)���Ajava�Ŋ֐��^�v���O���~���O���s���B
    StreamAPI�́A�֐��^�v���O���~���O�p�̃��C�u�����B

    �֐��^�v���O���~���O�́A
    �i��̒l�������ɓ��͂��A��̒l���o�͂����j�Ƃ����֐���g�ݍ��킹�čŏI�I�ɖړI�̒l���o�͂���Ƃ����`���̃v���O���~���O�̂��ƁB
    ��SQL���֐��^�v���O���~���O�B
*/

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;


class StreamAPI {
    public static void main(String[] args){
        List<String> names = new ArrayList<String>();
        names.add("Shibuya");
        names.add("Shinjuku");
        names.add("Ikebukuro");


        //�����_�����g�p�����A�֐��^�v���O���~���O�̗�
        names.stream().map(t -> t.length()).forEach(System.out::println);
      //��1�@�@�@�@�@�@ ��2�@�@�@�@�@�@�@�@�@�@��3

      /* 
        ��1�@�R���N�V�����N���X���A�X�g���[���`���ɕύX����
        ��2�@����t�̕�������Ԃ��@��map�͈����ɕϊ��������e�̃����_������͂���B��
        ��3�@forEach�ŁA�l��z�񂲂Ƃɏo�́@��System.out::println �̓��\�b�h�Q�Ƃ��g�p���Ă��遄
      
      */
    }
}