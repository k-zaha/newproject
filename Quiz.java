import java.io.*;
import java.util.*;

/* �\�[�X����
    �����i�����j�ƁA�����Ajava�\�[�X�Ŏw�肷��B
    
    �R�}���h�v�����v�g��ŁA�񓚂���͂��A
    ���̐������ƁA���������l�𒊏o���āA�o�͂���v���O�����B
    token.countTokens();���\�b�h�@�������ꂽ������̐��𐔂���B
    length���߂��Ⴍ����g�����˂��`ww



*/

/* �\�[�g�ȂǂŎg��for��
  ���p�^�[��A
    for(int i = 0; i < 5; i++){�@== 5��for���񂹁@i��0�`4�̍��v5�񃋁[�v����B
      for(int j = 0; j < i; j++) ==  i�̃��[�v������(�܂�5��)for����

      �����ł��邩�H
      �ƍ��������p�^�[���̐��̕������A��������ŁA�����ł���B

  ���p�^�[��B
    for(int i = 1; i < 5; i++){�@  == 5��for���񂹁B
    �@for(int j = i-1; j >= 0; j--){ == i���A�Ⴂ�z��ԍ��̕������Afor���񂹁B
    
    �����ł��邩�H
    �ƍ���1�p�^�[���ɂ��A1��ŗǂ��ꍇ�A�ŏ��̏����H�����ŁAfor���񂷂��Ƃ��ł���B
    
*/

class QandA {
    String question;  //���̓��e
    String[] answer;  //�����̓��e

    //���Fquestion�ƁA�����Fanswerline�̏������s���B
    QandA(String question, String answerline) {
        this.question = question;
        StringTokenizer token = new StringTokenizer(answerline, ",");//answerline(QandA�����@�����̕���)�̕�������J���}��؂�Ŏ擾�B
        answer = new String[token.countTokens()];//String�^�̔z����A�����̐������쐬����B

        for(int i = 0; token.hasMoreTokens(); i++){  //������S�āAString�z���answer�ɒǉ����Ă����B
            answer[i] = token.nextToken();
        }
    }

    //�����𔻒肵�A���������������Ԃ�
    String[] getCorrect(String inputline) {//string�^�̏�Ԃŉ񓚂������Ă���B
        
        StringTokenizer token = new StringTokenizer(inputline, ",");//�񓚂𕪊�
        int inputnum = token.countTokens();//�񓚂̒l�����Ainputnum�ɓ��ꍞ�ށB
        String[] input = new String[inputnum];//�񓚂̐�����String�z���input���쐬�B
        for(int i = 0; token.hasMoreTokens(); i++){
            input[i] = token.nextToken();//�񓚂��Ainput�̔z��ɂ��ꂼ����ꍞ�ށB
        }

        //�d���`�F�b�N
        for(int i = 1; i < inputnum; i++){//inputnum�͉񓚂̒l�̐��B
            for(int j = i-1; j >= 0; j--){ 
                //i��1�������B�@j��1 -1����A���[�v��ʂ邲�Ƃ�-1���Ă����B-��0��艺�ɂȂ����^�C�~���O�Ń��[�v�𔲂���B
                //�܂�Ai�̒l�����ƂɁAi���Ⴂ�z��Ԗڂ�input�̒l�������r���郋�[�v�\���ƂȂ��Ă���B
                //System.out.println("i" + i + " " + input[i] + "//j" + j + " " + input[j]);
                if(input[i].equals(input[j])){//�O�̉񓚂ƁA��̉񓚂��r�B�@�d���񓚂������Ă���z��ɂ�"0"����ꍞ�ށB
                    input[i] = "0";
                }
            }
        } 

        //�ƍ�
        int correctnum = 0;
        for(int i = 0; i < inputnum; i++){//�𓚂̐���for����
            for(int j = 0; j < answer.length; j++) {//�񓚂̐���for���񂷁B
                if(input[i].equals(answer[j])){//�𓚂Ɖ񓚂̒l����v������Acorrectnum��1���v���X����B
                    correctnum++;
                }
            }
        }
        //System.out.println();
        String[] correct = new String[correctnum]; //���������񓚕��A�ϐ�correct�̔z����쐬����B
        int k = 0;
        for(int i = 0; i < inputnum; i++){//"����������"�̒l�������Afor���񂷁B
            for(int j = 0; j < answer.length; j++){  //"��"�̒l�������A"��"�̒l�ƎQ�Ƃ��s���B
                
                //System.out.println("i" + i + " " + input[i] + "//j" + j + " " + input[j]);

                if(input[i].equals(answer[j])){//�񓚂Ɖ𓚂̒l����v������Ak��+1����B
                    correct[k] = input[i];
                    k++;
                }
            }
        }
     return correct;
    } 
}

class Quiz {
    static String getInput() {//�񓚂���������B
        String input = new String();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));   //BufferReader�I�u�W�F�N�g���쐬���AreadLine���g�����ԂɁB
                                                                      //������System.in��ǂݍ��ނ��߁A������InputStreamReader�I�u�W�F�N�g����ꍞ�ށB
            input = in.readLine();//�L�[�{�[�h�œ��͂��ꂽ�A�񓚂�ǂݍ��ށB
        } catch(Exception e) {
            System.out.println(e);
        }finally{
            return input;//�L�[�{�[�h������͂��ꂽ�l���A�Ԃ��B
        }
    }

    public static void main(String[] args) {
        //���Ɖ�
        QandA qa = new QandA("�j���i�p��j","Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday"); //���̓��e�ƁA��������ꍞ�ށB
        System.out.print("�y���z" + qa.question + "���u,�v�ŋ�؂��ē����Ȃ����B\n>"); //��蕶�̕\��

        int answernum = qa.answer.length; //�񓚂̌�����ꍞ�ށB
        String input = getInput();//�񓚂̓��e���AString�^��input�ɓ��ꍞ�ށB
        String[] correct = qa.getCorrect(input);//�񓚂̓��e���AgetCorrect(���𔻒菈���p���\�b�h)�ŏ������A������correct�ɓ��ꍞ�ށB
        int correctnum = (correct == null) ? 0 : correct.length; // String[]�ϐ���correct��null�̏ꍇ�A0���Bnull����Ȃ���΁Acorrect�Ɋi�[����Ă���l�̔z��̐���correctnum�ɓ����B

        //������������0����Ȃ������ꍇ�A���������񓚂�\��
        if(correctnum > 0){
            System.out.print("�����F");
            for(int j = 0; j < correctnum; j++){ //���������񓚕��Afor���񂷁B
                System.out.print(correct[j] + " ");//���������l��\���B
            }
            System.out.println();
        }
        //�����̐���\��
        System.out.println(correctnum + " / " + answernum + " ����");

        if(correctnum == answernum){ //���_�̏ꍇ
            System.out.println("�f���炵��!!");
        }else if(correctnum > answernum/2){ //���_�ł͂Ȃ����A��������������葽���ꍇ
            System.out.println("�悭�ł��܂���!");
        }else{                              //�������������ȉ��̏ꍇ
            System.out.println("�܂��܂��ł��B");
        }

    }
}