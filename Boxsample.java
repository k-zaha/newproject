class BoxSample {
    public static void main(String[] args){

        /* ラッパークラスと、プリミティブ型データの自動変換について
            プリミティブ型のデータ(boolean char byte short int Long float double)には、
            そのデータに付随して、メソッドが使用できる、ラッパークラスというクラスがある。
           -- 対応するラッパークラス --
             boolean == Boolean
             char == Character
             byte == Byte
             short == Short
             int == Integer
             long == Long
             float == Float
             double == Double
           --------------------------

           通常、型変換を行う際は、型キャストを指定しないといけないが、
           プリミティブ型　??　ラッパー　の変換に関しては、入れ込むメソッドの指定するデータ型等に応じて
           自動的に変換を行ってくれる。

           プリミティブ　?　ラッパー　への変換をAuto-Boxing、
           ラッパー　?　プリミティブ　への変換をAuto-Unboxingという。
        */


        //prim_intは、int型の変数だが、Integerのオブジェクトを入れ込むことができる。
        //ラッパーから、プリミティブ型に自動変換されるため、Auto-unboxing
        int prim_int = new Integer(10);
        System.out.println("値：" + prim_int);

        //wrap_IntはIntegerクラス型だが、int型のデータを入れ込むことができる。
        //プリミティブから、ラッパークラス型に自動変換される為、Auto-boxing
        Integer wrap_Int = prim_int * 10;
        System.out.println("値：" + wrap_Int);
    }
}