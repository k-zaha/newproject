
interface Greet{
    public String greet(String name);
}

public class Ramudatwo{
        public static void main(String[] args){
        
        
        
        //無名クラスを使用しなかった記法
        class Naibu implements Greet {
            public String greet(String name) {
                return "おはよう！" + name + "さん";
            }
        }

        Naibu g = new Naibu();
      
        System.out.println(g.greet("しおり"));
    }
}