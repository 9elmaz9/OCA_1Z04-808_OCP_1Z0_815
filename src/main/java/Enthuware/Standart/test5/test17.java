package Enthuware.Standart.test5;

public class test17 {
}
/**What should be the return type of the following method?
 public RETURNTYPE methodX( byte by){
 double d = 10.0;
 return (long) by/d*3;
 }*/

//double

/*Note that the cast (long) applies to 'by' not to the whole expression. ( (long) by ) / d * 3;
Now, division operation on long gives you a double. So the return type should be double.*/
