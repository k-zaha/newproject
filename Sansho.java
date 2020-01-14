import java.util.*;

public class Sansho {
    public static void main(String[] args) throws Exception {

        Sansho sansho = new Sansho();
        System.out.println("----No1----");
        sansho.test().forEach(sansho :: myPrint);
        System.out.println("----No2----");
        sansho.test().forEach(x -> sansho.myPrint(x));

    }

    public List<String> test(){
        List<String> list = new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        return list;
    }

    public void myPrint(String str){
        System.out.println(str);
    }
}