/*  ラムダ式と無名クラスとローカルクラスについて
    内部クラス　外部クラス
    static修飾子で宣言されておらず、クラスの中に作られているクラスのことを、内部クラスという。
    外側のクラスを外部クラスという。(⇒つまり、クラスが入れ子になっている構造。)

    ローカルクラス
    上記の内部クラスの中で、メソッド内で定義されるクラスをローカルクラスという。

    無名クラス
    ローカルクラスの中で、インターフェースの実装(実装、オーバーライドで使う)の為だけに使用されるクラスは
    クラス名定義やインターフェース実装の宣言(implements)などを省いた状態で、記載することができる。
    この方式で記載されたクラスを、無名クラスという。

    ラムダ式
    無名クラスの定義から、returnの記載までを省略して記載する方法。
    ラムダ式を使用することによって、
    ・記述を簡潔にできる。
    ・ラムダ式での使用を前提としたAPIを利用できる

    というメリットがある。

    ラムダ式は、関数型インターフェースを使用する為の無名クラスを作成するときに使用できる。
    (関数型インターフェースはメソッドが一つのみで、入力する値が1つ、かつ、出力する値も1つというメソッドのこと。)
    関数型インターフェースを使用することで、Javaで関数型プログラミングができる。
    関数型インターフェースを定義するときには、アノテーション@FunctionalInterfaceを付ける。
*/
@FunctionalInterface
interface Greet{
    public String greet(String name);
}



public class Ramuda{
        public static void main(String[] args){
        
        //無名クラスを使用しない記法
        /*class Naibu implements Greet {
            public String greet(String name) {
                return "おはよう！" + name + "さん";
            }
        }
        Naibu g = new Naibu();*/


        //無名クラスを使用した記法
        /*Greet g = new Greet(){
            @Override 
            public String greet(String name){
                return "おはよう！" + name + "さん";
            }
        };
        */
        

        //ラムダ式で、スマートに書ける
        /*
        Greet g = (String name)-> {
            return "勉強頑張れ！" + name + "さん";
        };
        */
        
        //上記のラムダ式から、さらに、引数の型名と、returnの宣言を省略することも可能。
        Greet g = name -> "勉強頑張れ!" + name + "さん";

        System.out.println(g.greet("みその"));
    }
}