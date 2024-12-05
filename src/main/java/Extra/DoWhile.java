package Extra;

public class DoWhile {
    public static void main(String[] args) {

        int count = 0;
        do {
            System.out.println(count); // без coint++;   будет бесконечная итерация
            count++;
        } while (count < 100);  //  untim 99


        // без смысла, но отработал тело бы раз  , сначало выполняет действие а потом проверяет что там было задано и сверяет false or true
        int count2 = 0;
        do {
            System.out.println(count2); // без coint++;   будет бесконечная итерация = Output 0

            count2++;
        } while (count2 < 0);  //  untim 99


        System.out.println(" CHEEEEKING FOR FAILURE WHILE  ");


        //этот бы вообще не отработал
        while (count2 < 0) {  // false сразу дал отворот для run
            System.out.println(count);   // without anything
        }
    }
}
