/*�\�[�X����
  �}���`�X���b�h�����p�����\�[�X 
    WordThread�N���X�̃I�u�W�F�N�g�Atick��tack�𐶐��B
    �ނ�́A400�~���b���ƂɁA"tick"�܂���"tack"��\������B
    tick�̃X�^�[�g��tack�̃X�^�[�g�̊ԂɁA500�~���b�̎��Ԃ̂���𔭐������邱�ƂŁA
    500�~��(�܂�0.5�b����)�ɁAtick��tack�����݂ɕ\�������v���O�����ɂȂ��Ă���B

  �}���`�X���b�h�Ƃ́A�v���O�����̗��ꂪ��������A�����ɕ����̗���ŏ��������s����v���O�����̂��ƁB

  �}���`�X���b�h��Java�ň����ɂ́AThread�N���X���g�p���āA�V�����X���b�h�����B
  �X���b�h�����ɂ́AThread�N���X�� extends�����N���X���쐬���A���̒��ŁArun()���\�b�h���I�[�o�[���C�h����B

*/


class WordThread extends Thread{
    private String word;
    private int time;
    private int count;

    public WordThread(String w,int t,int c) {
        word = w;  //�\�������镶��
        time = t;  //w�̕\�������s���鎞�ԕ��@(Thread.sleep();�����p���Ē�~���Ă���B) 
        count = c; //
    }

    public void run(){
        for(int i = 0; i <  count; i++) {//�J�E���g��for���񂷁Bfor��word���o�́B�o�͂̊ԂɁAtime���҂����Ԃ����B
            System.out.println(word);
            try {
                Thread.sleep(time); //�����̎���(�~���b)���̃X���b�h���~����B
            }catch(Exception e){
            }
        }
    }
    public static void main(String[] args){
        WordThread tick = new WordThread("tick",1000,400);
        WordThread tack = new WordThread("tack",1000,400);

        tick.start(); //start���\�b�h�@�w�肵���X���b�h���X�^�[�g������B(WordThread��Thread��Extends���Ă��邽�߁A�g�p�\�B)
        try {
            Thread.sleep(500);//tick��tack�̎��s�J�n�^�C�~���O�����炵�Ă���B
        }catch(Exception e){
        }
        tack.start();
    }
}