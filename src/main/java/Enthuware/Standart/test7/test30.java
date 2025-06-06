package Enthuware.Standart.test7;

public class test30 {
}
/**Given:
 public class Triangle{
 public int base;
 public int height;
 public double area;

 public Triangle(int base, int height){
 this.base = base; this.height = height;
 updateArea();
 }

 void updateArea(){
 area = base*height/2;
 }
 public void setBase(int b){ base  = b; updateArea(); }
 public void setHeight(int h){ height  = h; updateArea(); }
 }
 The above class needs to protect an invariant on the "area" field. Which three members must have the public access modifiers removed to ensure that the invariant is maintained?*/

//the base field

//the height field

//the area field

/**An invariant means a certain condition that constrains the state stored in the object. For example,
 * in this case the value of the area field of the Triangle must always be consistent with its base and height fields.
 * Thus, it should never have a value that is different from base*height/2.
 * If you allow other classes to directly change the value of base, height, or area, using direct field access,
 * the area field may not contain the correct area thereby breaking the invariant.
 * To prevent this inconsistency from happening, you need to prohibit changing the instance fields directly and
 * instead permit the changes only through the setter method because these methods call the updateArea method and keep
 * the area and base and height consistent. */