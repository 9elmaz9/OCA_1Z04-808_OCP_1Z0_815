package Extra;

public class WhileExample {
    public static void main(String[] args) {

        int count=1;
        //  expected JUST (  true ) or ( false)
        while (count<100){
            System.out.println(count);  // до 99
            count++;   // без этого было бы бесконечное задание
        }
        System.out.println("While was ended");


        while (true){  // (true) нет условия выхода надо задать его в теле
            count++;
            System.out.println(count);  // будет печатать до конца int
            if(count== 1_000){
                break;
            }

        }
        System.out.println("Second While was ended");

    }
}
