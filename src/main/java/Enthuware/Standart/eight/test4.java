package Enthuware.Standart.eight;

public class test4 {
}
/**Consider the following code:

 class Base{
 private float f = 1.0f;
 void setF(float f1){ this.f = f1; }
 }
 class Base2 extends Base{
 private float f = 2.0f;
 //1
 }
 Which of the following options is/are valid example(s) of overriding?*/


//protected void setF(float f1){ this.f = 2*f1; }
//protected is less restrictive than default, so it is valid.


//public void setF(float f1){ this.f = 2*f1; }
//public is less restrictive than default, so it is valid.


/**An overriding method can be made less restrictive than the overridden method. The restrictiveness of access modifiers is as follows:
 private>default>protected>public (where private is most restrictive and public is least restrictive).

 Note that there is no modifier named default. The absence of any access modifiers implies default access.*/


/**An overriding method can be made less restrictive than the overridden method. The restrictiveness of access modifiers is as follows:
 private>default>protected>public (where private is most restrictive and public is least restrictive).

 Note that there is no modifier named default. The absence of any access modifiers implies default access.*/