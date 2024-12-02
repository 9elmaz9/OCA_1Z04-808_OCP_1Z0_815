package Extra;

public class Ternary {
    public static void main(String[] args) {

        //если сдача будет  50 или больше оставть себе 10, если будет меньше чем 50 то возьми 5
        int money = 100;
        int breadPrice = 20;

        int moneyAfterShopping = money - breadPrice;
        int childMoney = moneyAfterShopping >= 50 ? 10 : 5;  // true : false
        moneyAfterShopping -= moneyAfterShopping >= 50 ? 10 : 5;
        System.out.println(childMoney);
        System.out.println(moneyAfterShopping);

        /**
         //var 1
         int moneyAfterShopping = money - breadPrice;
         int childMoney;

         if (moneyAfterShopping >= 50) {
         childMoney = 10;
         moneyAfterShopping -= 10;
         } else {
         childMoney = 5;
         moneyAfterShopping -= 5;
         }

         */
        //var2
        //
    }
}
