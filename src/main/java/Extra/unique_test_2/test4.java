package Extra.unique_test_2;

public class test4 {
}
/**Given: abstract class Vehicle{ } interface Drivable{ } class Car extends Vehicle implements Drivable{ } class SUV extends Car { }  Which of the following options will fail to compile?*/

/**ArrayList<SUV> al4 = new ArrayList<>(); al4.add(new Car());
 Since a Car is not an SUV, you cannot add instances of Car in an ArrayList of SUVs.*/

/**Although generics are not included in this exam, some candidates have reported getting similar questions that incidently touch generic syntax but are not really about generics.

 This question is based on your understand of is-a relationship. When class A extends or implements B directly or indirectly, you can say that A is-a B. Here, Car directly extends Vehicle and directly implements Drivable. Therefore, a Car is-a Vehicle and a Car is-a Drivable.
 Similarly, an SUV is-a Car and since Car is-a Vehicle and is-a Drivable, SUV is also a Vehicle and a Drivable.

 Now, the rule is that if you have a container that is meant to contain A, then you can add anything that is-a A to that container. For example, if you have ArrayList<Car>, you can add a SUV to it because an SUV is-a Car. But if you have ArrayList<SUV>, you cannot add a Car to it because a Car is not an SUV.
 */