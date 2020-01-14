/*  StreamAPIを使用した際のソース　実験台
    StreamAPIを使用(import)し、javaで関数型プログラミングを行う。
    StreamAPIは、関数型プログラミング用のライブラリ。

    関数型プログラミングは、
    （一つの値を引数に入力し、一つの値が出力される）という関数を組み合わせて最終的に目的の値を出力するという形式のプログラミングのこと。
    ※SQLも関数型プログラミング。
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


        //ラムダ式を使用した、関数型プログラミングの例
        names.stream().map(t -> t.length()).forEach(System.out::println);
      //※1　　　　　　 ※2　　　　　　　　　　※3

      /* 
        ※1　コレクションクラスを、ストリーム形式に変更する
        ※2　引数tの文字数を返す　＜mapは引数に変換処理内容のラムダ式を入力する。＞
        ※3　forEachで、値を配列ごとに出力　＜System.out::println はメソッド参照を使用している＞
      
      */
    }
}