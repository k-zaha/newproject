/*  �����_���Ɩ����N���X�ƃ��[�J���N���X�ɂ���
    �����N���X�@�O���N���X
    static�C���q�Ő錾����Ă��炸�A�N���X�̒��ɍ���Ă���N���X�̂��Ƃ��A�����N���X�Ƃ����B
    �O���̃N���X���O���N���X�Ƃ����B(�˂܂�A�N���X������q�ɂȂ��Ă���\���B)

    ���[�J���N���X
    ��L�̓����N���X�̒��ŁA���\�b�h���Œ�`�����N���X�����[�J���N���X�Ƃ����B

    �����N���X
    ���[�J���N���X�̒��ŁA�C���^�[�t�F�[�X�̎���(�����A�I�[�o�[���C�h�Ŏg��)�ׂ̈����Ɏg�p�����N���X��
    �N���X����`��C���^�[�t�F�[�X�����̐錾(implements)�Ȃǂ��Ȃ�����ԂŁA�L�ڂ��邱�Ƃ��ł���B
    ���̕����ŋL�ڂ��ꂽ�N���X���A�����N���X�Ƃ����B

    �����_��
    �����N���X�̒�`����Areturn�̋L�ڂ܂ł��ȗ����ċL�ڂ�����@�B
    �����_�����g�p���邱�Ƃɂ���āA
    �E�L�q���Ȍ��ɂł���B
    �E�����_���ł̎g�p��O��Ƃ���API�𗘗p�ł���

    �Ƃ��������b�g������B

    �����_���́A�֐��^�C���^�[�t�F�[�X���g�p����ׂ̖����N���X���쐬����Ƃ��Ɏg�p�ł���B
    (�֐��^�C���^�[�t�F�[�X�̓��\�b�h����݂̂ŁA���͂���l��1�A���A�o�͂���l��1�Ƃ������\�b�h�̂��ƁB)
    �֐��^�C���^�[�t�F�[�X���g�p���邱�ƂŁAJava�Ŋ֐��^�v���O���~���O���ł���B
    �֐��^�C���^�[�t�F�[�X���`����Ƃ��ɂ́A�A�m�e�[�V����@FunctionalInterface��t����B
*/
@FunctionalInterface
interface Greet{
    public String greet(String name);
}



public class Ramuda{
        public static void main(String[] args){
        
        //�����N���X���g�p���Ȃ��L�@
        /*class Naibu implements Greet {
            public String greet(String name) {
                return "���͂悤�I" + name + "����";
            }
        }
        Naibu g = new Naibu();*/


        //�����N���X���g�p�����L�@
        /*Greet g = new Greet(){
            @Override 
            public String greet(String name){
                return "���͂悤�I" + name + "����";
            }
        };
        */
        

        //�����_���ŁA�X�}�[�g�ɏ�����
        /*
        Greet g = (String name)-> {
            return "�׋��撣��I" + name + "����";
        };
        */
        
        //��L�̃����_������A����ɁA�����̌^���ƁAreturn�̐錾���ȗ����邱�Ƃ��\�B
        Greet g = name -> "�׋��撣��!" + name + "����";

        System.out.println(g.greet("�݂���"));
    }
}