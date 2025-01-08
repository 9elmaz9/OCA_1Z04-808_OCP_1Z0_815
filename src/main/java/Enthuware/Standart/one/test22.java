package Enthuware.Standart.one;

public class test22 {
}
//This is a Drag and Drop type question. Please click on 'Show DnD Screen' to see the question.

/**Вопрос:
 Для каждого из фрагментов кода определите, какое исключение будет выброшено.

 Разбор фрагментов:
 1. Функция factorial(int n)
 java
 Copy code
 int factorial(int n){
 if(n == 1) return 1;
 else return n * factorial(n - 1);
 }
 Описание: Если factorial вызывается с очень большим числом, рекурсивные вызовы не завершатся вовремя, и стек вызовов будет переполнен.
 Исключение: StackOverflowError.
 2. Метод printMe(Object[] oa)
 java
 Copy code
 void printMe(Object[] oa){
 for(int i = 0; i < oa.length; i++)
 System.out.println(oa[i]);
 }
 Описание: Если метод вызывается с printMe(null), то попытка получить oa.length вызовет исключение, так как oa равен null.
 Исключение: NullPointerException.
 3. Приведение типов в методе m2
 java
 Copy code
 Object m1(){
 return new Object();
 }
 void m2(){
 String s = (String) m1();
 }
 Описание: Метод m1 возвращает объект типа Object. При попытке привести его к String, будет выброшено исключение из-за несовместимости типов.
 Исключение: ClassCastException.
 Ответы:
 StackOverflowError
 NullPointerException
 ClassCastException*/