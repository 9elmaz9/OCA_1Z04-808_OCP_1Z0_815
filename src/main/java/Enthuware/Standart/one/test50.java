package Enthuware.Standart.one;

public class test50 {
}
/**
 *
 * Given:
 * class Triangle{
 *     public int base;
 *     public int height;
 *     public double area = 0;
 *
 *     public Triangle(int pBase, int pHeight){
 *         this.base = pBase; this.height = pHeight;
 *         updateArea();
 *     }
 *     public void updateArea(){
 *         double a = base*height/2;
 *         area = a;
 *     }
 *     public void setBase(int b){ base  = b; updateArea(); }
 *     public void setHeight(int h){ height  = h; updateArea(); }
 * }
 * Which variables are not accessible from anywhere within given class code except from the scope in which they are declared?*/

//b, h, a


/**b, h, a
b and h are method parameters and are only accessible
 in the method setBase and setHeight respectively. a is a local variable and is
 accessible only in updateArea method.  base, height, and area are instance level and
 can be accessed from anywhere within the class where "this" is accessible.*/

/**
 * Вопрос касается области видимости переменных внутри класса Triangle.
 *
 * Анализ кода:
 * Переменные base, height, и area:
 *
 * base и height: объявлены как public. Это значит, что они доступны отовсюду.
 * area: также объявлена как public. Доступна отовсюду.
 * Переменные b и h:
 *
 * Эти переменные являются локальными переменными методов setBase и setHeight. Локальные переменные доступны только в рамках метода, в котором они объявлены, и не могут быть доступны за пределами этих методов.
 * Ответ:
 * b, h — переменные, которые недоступны за пределами методов, в которых они объявлены.
 *
 *
 *
 * Мы смотрим, какие переменные в данном классе Triangle не доступны за пределами их области видимости внутри кода.
 *
 * 1. base, height, area:
 * Эти переменные объявлены как public. Это значит, что они доступны из любой части кода. Они не ограничены областью видимости.
 * 2. b и h:
 * Это локальные переменные методов setBase и setHeight.
 * Локальные переменные всегда ограничены областью видимости метода, в котором они объявлены. Поэтому они не доступны за пределами методов setBase и setHeight.
 * Правильный ответ:
 * b, h — эти переменные недоступны вне области их объявления (методы setBase и setHeight).*/