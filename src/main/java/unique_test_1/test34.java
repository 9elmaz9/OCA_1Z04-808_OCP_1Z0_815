package unique_test_1;

public class test34 {
}
/**What will be the output of the following lines ?
 *  System.out.println("" +5 + 6);//1
 *  System.out.println(5 + "" +6);//2
 *  System.out.println(5 + 6 +"");//
 *  3 System.out.println(5 + 6); // 4 */

/**
 56 56 11 11
 */

/**In line 1, "" + 5 + 6 => "5"+6 => "56"
 * In line 2, 5 + "" +6=> "5"+6 => "56"
 * 7In line 3, 5 + 6 +"" => 11+"" => "11"
 * In line 4, 5 + 6 => 11 => "11"*/