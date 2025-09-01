package unique_test_1;

public class test45 {
}
/**Consider the following method -
 * public float parseFloat( String s ){
 *  float f = 0.0f;
 *  try{
 *  f = Float.valueOf( s ).floatValue();
 *  return f ;
 *  }
 *  catch(NumberFormatException nfe){
 *  f = Float.NaN ;
 *  return f;
 *  }
 *  finally{
 *  f = 10.0f;
 *  return f;
 *  } }
 *  What will it return if the method is called with the input "0.0" ?*/

//It will return 10.0

/*finally block will always execute (except when there is a System.exit() in try or catch).
 And inside the finally block, it is setting f to 10.0. So no matter what the input is,
 this method will always return 10.0.*/


