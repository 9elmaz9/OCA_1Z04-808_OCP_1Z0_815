package Enthuware.Standart.test2;

public class test5 {
}
/**
 Consider the following code appearing in the same file:
 class Data {
 private int x = 0, y = 0;
 public Data(int x, int y){
 this.x = x; this.y = y;
 }
 }
 public class TestClass {
 public static void main(String[] args) throws Exception {
 Data d = new Data(1, 1);
 //add code here
 }
 }
 Which of the following options when applied individually will change the Data object currently
 referred to by the variable d to contain 2, 2 as values for its data fields?*/

/**✓ You answered correctly You had to select 1 option

 Add the following two statements : d.x = 2; d.y = 2;
 Note that x and y are private in class Data. Therefore, you cannot access these members from any other class.*/

/**Add the following method to Data class:
 * public void setValues(int x, int y){
 * this.x = x;
 * this.y = y; }
 * Then add the following statement:
 * d.setValues(2, 2);
 This is a good example of encapsulation where the data members of Data class are private and there is a method in Data class to manipulate its data.
 Compare this approach to making x and y as public and letting other classes directly modify the values.*/

/**Разбор вопроса:
 В классе Data есть два приватных поля x и y, которые можно изменить только внутри класса. Мы должны изменить объект, на который ссылается переменная d, чтобы его поля x и y содержали значения 2 и 2.

 Варианты:
 d.x = 2; d.y = 2;

 Поля x и y объявлены как private, поэтому к ним нельзя обращаться напрямую за пределами класса. Этот вариант не компилируется.
 d = new Data(2, 2);

 Это создаёт новый объект Data с полями x = 2 и y = 2. Однако ссылка на объект d изменяется, и старый объект теряется. Требуется изменить текущий объект, поэтому этот вариант не подходит.
 d.x += 1; d.y += 1;

 Опять же, доступ к приватным полям невозможен за пределами класса. Этот вариант также не компилируется.
 Добавить метод setValues в класс Data, а затем вызвать d.setValues(2, 2);

 Метод setValues предоставляет доступ к изменению значений x и y внутри класса, сохраняя текущий объект d. Этот вариант подходит.


 Почему:
 Метод setValues позволяет изменить поля x и y текущего объекта d.
 Вызов d.setValues(2, 2); устанавливает значения x = 2 и y = 2 для объекта d.
 Этот подход сохраняет ссылку на текущий объект, в отличие от создания нового объекта (предыдущий вариант).*/




