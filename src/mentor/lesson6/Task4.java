package mentor.lesson6;


public class Task4 {
    public static void main(String[] args) {
         /*  Вывести на экран  вот такие строки(используя циклы):
           А
           АА
           ААА
           АААА
           ААААА
         */

        String a = "A";
        for (int i = 0; i < 5; i++) {
            System.out.println(a);
            a += "A";
        }
    }
}

