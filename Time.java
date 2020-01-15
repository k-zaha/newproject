/* ソース説明
    Dataクラス、Calendarクラスを使用して、時間を取得するプログラム。
    Dateクラス現在時刻を取得するためのクラス。
    Calenderクラスの子クラスにある、GregorianCalenderクラスを使って、Dataクラスのオブジェクトを、
    年、月、日、時間の形式に切り替える。

    タイマーに使える？
*/

import java.util.*;

class Time{
    public static void main(String[] args){
        Date date = new Date();
        Calendar cal = new GregorianCalendar();

        System.out.println(date);

        long a = System.currentTimeMillis();
        System.out.println(a);

        System.out.println(cal.get(Calendar.YEAR) + "年" + 
        (cal.get(Calendar.MONTH)+1) + "月" + 
        cal.get(Calendar.DAY_OF_MONTH) + "日 " + 
        cal.get(Calendar.HOUR_OF_DAY) + ":" +
        cal.get(Calendar.MINUTE) + ":" +
        cal.get(Calendar.SECOND));
    }
}