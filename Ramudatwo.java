
interface Greet{
    public String greet(String name);
}

public class Ramudatwo{
        public static void main(String[] args){
        
        
        
        //�����N���X���g�p���Ȃ������L�@
        class Naibu implements Greet {
            public String greet(String name) {
                return "���͂悤�I" + name + "����";
            }
        }

        Naibu g = new Naibu();
      
        System.out.println(g.greet("������"));
    }
}