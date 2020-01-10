import java.io.*;
import java.util.*;

/* ソース説明
    答え（複数）と、問題を、javaソースで指定する。
    
    コマンドプロンプト上で、回答を入力し、
    その正当数と、正当した値を抽出して、出力するプログラム。
    token.countTokens();メソッド　分割された文字列の数を数える。
    lengthをめちゃくちゃ使ったねぇ～ww



*/

/* ソートなどで使うfor文
  ◆パターンA
    for(int i = 0; i < 5; i++){　== 5回forを回せ　iは0～4の合計5回ループする。
      for(int j = 0; j < i; j++) ==  iのループ数だけ(つまり5回)forを回せ

      何ができるか？
      照合したいパターンの数の分だけ、総当たりで、処理できる。

  ◆パターンB
    for(int i = 1; i < 5; i++){　  == 5回forを回せ。
    　for(int j = i-1; j >= 0; j--){ == iより、若い配列番号の分だけ、forを回せ。
    
    何ができるか？
    照合が1パターンにつき、1回で良い場合、最少の処理工程数で、forを回すことができる。
    
*/

class QandA {
    String question;  //問題の内容
    String[] answer;  //答えの内容

    //問題：questionと、答え：answerlineの処理を行う。
    QandA(String question, String answerline) {
        this.question = question;
        StringTokenizer token = new StringTokenizer(answerline, ",");//answerline(QandA引数　答えの部分)の文字列をカンマ区切りで取得。
        answer = new String[token.countTokens()];//String型の配列を、答えの数だけ作成する。

        for(int i = 0; token.hasMoreTokens(); i++){  //答えを全て、String配列のanswerに追加していく。
            answer[i] = token.nextToken();
        }
    }

    //正解を判定し、正解した文字列を返す
    String[] getCorrect(String inputline) {//string型の状態で回答が入ってくる。
        
        StringTokenizer token = new StringTokenizer(inputline, ",");//回答を分割
        int inputnum = token.countTokens();//回答の値数を、inputnumに入れ込む。
        String[] input = new String[inputnum];//回答の数だけString配列のinputを作成。
        for(int i = 0; token.hasMoreTokens(); i++){
            input[i] = token.nextToken();//回答を、inputの配列にそれぞれ入れ込む。
        }

        //重複チェック
        for(int i = 1; i < inputnum; i++){//inputnumは回答の値の数。
            for(int j = i-1; j >= 0; j--){ 
                //iは1から入る。　jは1 -1から、ループを通るごとに-1していく。-が0より下になったタイミングでループを抜ける。
                //つまり、iの値をもとに、iより若い配列番目のinputの値だけを比較するループ構造となっている。
                //System.out.println("i" + i + " " + input[i] + "//j" + j + " " + input[j]);
                if(input[i].equals(input[j])){//前の回答と、後の回答を比較。　重複回答が入っている配列には"0"を入れ込む。
                    input[i] = "0";
                }
            }
        } 

        //照合
        int correctnum = 0;
        for(int i = 0; i < inputnum; i++){//解答の数分forを回す
            for(int j = 0; j < answer.length; j++) {//回答の数分forを回す。
                if(input[i].equals(answer[j])){//解答と回答の値が一致したら、correctnumに1をプラスする。
                    correctnum++;
                }
            }
        }
        //System.out.println();
        String[] correct = new String[correctnum]; //正解した回答分、変数correctの配列を作成する。
        int k = 0;
        for(int i = 0; i < inputnum; i++){//"正解した回答"の値分だけ、forを回す。
            for(int j = 0; j < answer.length; j++){  //"解答"の値分だけ、"回答"の値と参照を行う。
                
                //System.out.println("i" + i + " " + input[i] + "//j" + j + " " + input[j]);

                if(input[i].equals(answer[j])){//回答と解答の値が一致したら、kに+1する。
                    correct[k] = input[i];
                    k++;
                }
            }
        }
     return correct;
    } 
}

class Quiz {
    static String getInput() {//回答を処理する。
        String input = new String();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));   //BufferReaderオブジェクトを作成し、readLineが使える状態に。
                                                                      //引数にSystem.inを読み込むため、引数にInputStreamReaderオブジェクトを入れ込む。
            input = in.readLine();//キーボードで入力された、回答を読み込む。
        } catch(Exception e) {
            System.out.println(e);
        }finally{
            return input;//キーボードから入力された値を、返す。
        }
    }

    public static void main(String[] args) {
        //問題と解答
        QandA qa = new QandA("曜日（英語）","Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday"); //問題の内容と、答えを入れ込む。
        System.out.print("【問題】" + qa.question + "を「,」で区切って答えなさい。\n>"); //問題文の表示

        int answernum = qa.answer.length; //回答の個数を入れ込む。
        String input = getInput();//回答の内容を、String型のinputに入れ込む。
        String[] correct = qa.getCorrect(input);//回答の内容を、getCorrect(正解判定処理用メソッド)で処理し、正解をcorrectに入れ込む。
        int correctnum = (correct == null) ? 0 : correct.length; // String[]変数のcorrectがnullの場合、0を。nullじゃなければ、correctに格納されている値の配列の数をcorrectnumに入れる。

        //正解した数が0じゃなかった場合、正解した回答を表示
        if(correctnum > 0){
            System.out.print("正解：");
            for(int j = 0; j < correctnum; j++){ //正解した回答分、forを回す。
                System.out.print(correct[j] + " ");//正解した値を表示。
            }
            System.out.println();
        }
        //正解の数を表示
        System.out.println(correctnum + " / " + answernum + " 正解");

        if(correctnum == answernum){ //満点の場合
            System.out.println("素晴らしい!!");
        }else if(correctnum > answernum/2){ //満点ではないが、正当数が半分より多い場合
            System.out.println("よくできました!");
        }else{                              //正当数が半分以下の場合
            System.out.println("まだまだです。");
        }

    }
}