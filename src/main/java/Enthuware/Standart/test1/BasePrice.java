package Enthuware.Standart.test1;

public class BasePrice {

    private int base;
    private int markup=4;

    public BasePrice( int base ) {
        this.base = base;
    }

    /*
     * add getMarkup() method here...
     */
    protected int getMarkup() {
        return markup;
    }

    /*----------DO NOT MODIFY CODE ABOVE THIS ROW, IT WILL ANYWAY BE RESET BEFORE EXECUTION----------*/

    /*----------DO NOT MODIFY CODE BELOW THIS ROW, IT WILL ANYWAY BE RESET BEFORE EXECUTION----------*/
}
class Test {
    public static void main(String[] args) {
        BasePrice bp = new BasePrice(100);
        System.out.println("Markup: " + bp.getMarkup());  // Должно вывести 4
    }
}