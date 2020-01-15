/*ソース説明
  マルチスレッドを活用したソース 
    WordThreadクラスのオブジェクト、tickとtackを生成。
    彼らは、400ミリ秒ごとに、"tick"または"tack"を表示する。
    tickのスタートとtackのスタートの間に、500ミリ秒の時間のずれを発生させることで、
    500ミリ(つまり0.5秒ごと)に、tickとtackが交互に表示されるプログラムになっている。

  マルチスレッドとは、プログラムの流れが複数あり、同時に複数の流れで処理を実行するプログラムのこと。

  マルチスレッドをJavaで扱うには、Threadクラスを使用して、新しくスレッドを作る。
  スレッドを作るには、Threadクラスを extendsしたクラスを作成し、その中で、run()メソッドをオーバーライドする。

*/


class WordThread extends Thread{
    private String word;
    private int time;
    private int count;

    public WordThread(String w,int t,int c) {
        word = w;  //表示させる文字
        time = t;  //wの表示を実行する時間幅　(Thread.sleep();を活用して停止している。) 
        count = c; //
    }

    public void run(){
        for(int i = 0; i <  count; i++) {//カウント分forを回す。for分wordを出力。出力の間に、time分待ち時間を作る。
            System.out.println(word);
            try {
                Thread.sleep(time); //引数の時間(ミリ秒)このスレッドを停止する。
            }catch(Exception e){
            }
        }
    }
    public static void main(String[] args){
        WordThread tick = new WordThread("tick",1000,400);
        WordThread tack = new WordThread("tack",1000,400);

        tick.start(); //startメソッド　指定したスレッドをスタートさせる。(WordThreadでThreadをExtendsしているため、使用可能。)
        try {
            Thread.sleep(500);//tickとtackの実行開始タイミングをずらしている。
        }catch(Exception e){
        }
        tack.start();
    }
}