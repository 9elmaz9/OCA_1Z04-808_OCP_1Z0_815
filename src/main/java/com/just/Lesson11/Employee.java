package com.just.Lesson11;

public class Employee {

    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // тут в методе мы работаем не с замой зп а просто с увеличением параметра  подставляя цифры которые принадлежат зп
    public double uvelichitel(double a) {  // в методе видим что наш параметр увеличивается в два раза+
        // в данном случае наш параметр  который выше  это salary  вот double d= empl1.uvelichitel(empl1.salary);  то есть мы подставили тут
        // под наш double a   Employee empl1=new Employee("Ivan",100.55); его зп 100.55  которая идет из выше  public double salary; вот этой переменной обьекта , которая прошла через конструктор  DAMN
        a = a * 2;
        return a;
    }

    // а тут мы уже увеличиваем и работаем именно с зп
    public double zp2(){
        salary=salary*2;
        return  salary;
    }
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee empl1=new Employee("Ivan",100.55);
        double d= empl1.uvelichitel(empl1.salary);
        System.out.println(d);  // 201.1 тут увеличивается цифра просто

        System.out.println(empl1.salary); //100.55  тут



        empl1.zp2();
        System.out.println(empl1.salary); // тут увеличивается зп
    }
}

/**Давайте разберёмся, что же происходит с методом увеличителя. Давайте разбираться это визуально. При создании объекта M1 что происходит? Создается ссылка M1, которая ссылается на объект под именем Иван. Зарплата 100,55. Объект создан. Далее у нас есть переменная D, которая будет чему равна. Вызываем для этого объекта Иван метод увеличитель. Увеличитель требует параметр double. Cylinder у нас тоже double. Что происходит внутри метода увеличителя? Параметр увеличивается в два раза. Но что является параметром в данном случае? Мы поставили вместо параметра значение переменной cylinder. Обратите внимание на то, что мы поставили именно значение. Почему? Потому что когда вы вставляете в параметр метода переменную примитивного типа данных, то всегда в параметр вставляется ее значение. В данном случае значение 100,55. То есть что происходит внутри метода? A равен 100,55 умноженное на 2. То есть здесь 1,1. A принимает это значение и возвращает метод именно значения A. На самом деле с зарплатой ничего не происходит. Мы просто в данном случае спрашиваем, какой параметр мы поставили в метод. И отвечаем, поставим параметр значения зарплаты. То есть саму переменную зарплаты мы не можем поставить сюда. Нам нужна переменная с типом данных double. Поэтому мы подставляем только лишь значение зарплаты. Сказали, у нас зарплата 100,55, поэтому мы поставили ее в наш метод. Мы никак не можем в данном случае изменить нашу зарплату. Наша зарплата как была равна 100,55, так она и остается равна любым числу. Ничего с ней не происходит. В данном случае wd стал равняться 2c1.1. Запомните, когда вы вставляете примитивный тип данных в параметры метода, вы вставляете только его значение. Значение зарплаты было 100,55, вы использовали это значение. А что дальше увеличивает это значение? Пускай увеличивается. Оно увеличивает любую другую переменную. Но сама зарплата не изменяется. Хорошо. Возникает вопрос. Как же тогда написать метод, который будет увеличивать зарплату этого работника, этого employee, в 2 раза? Давайте подпишем второй метод. Он тоже будет паблик. Вставим его в cpl2, допустим. Чтобы увеличить зарплату в 2 раза, нам не нужно метод какой-либо одним параметром. Почему? Потому что зарплата у нас переменная есть. Мы просто будем ее увеличивать в 2 раза. В цели метода мы пишем salary равен salary умноженное на 2. И возвращая return это salary. В данном случае внутри метода вы работаете с самой зарплатой, а не с каким-то ее значением. Теперь мы можем воспользоваться этим методом m1.zp2 и вывести на экран эту зарплату. Просто посмотрите, как изменяется зарплата объекта m1. Shift f6. Теперь сама зарплата уже увеличилась в 2 раза. И стала равной 0.1. Таким образом, когда вы используете приоритетный тип данных в параметре метода, имейте в виду, что вы будете всегда использовать не саму переменную, а лишь ее значение. В данном случае это просто число. Когда вы будете работать с переменной типа, вы будете использовать просто символ. И так далее. Вернемся к презентации.*/


/**Let's break down what happens with the "increase" method. Let's look at it visually. When the object M1 is created, what happens? A reference M1 is created, which points to an object named Ivan. The salary is 100.55. The object is created. Then we have a variable D, which will be equal to what? We call the "increase" method for this object Ivan. The "increase" method requires a double parameter. Cylinder is also of type double. What happens inside the "increase" method? The parameter is doubled. But what is the parameter in this case? We placed the value of the cylinder variable as the argument. Pay attention to the fact that we used the value. Why? Because when you pass a primitive data type variable to a method parameter, you always pass its value. In this case, the value is 100.55. So, what happens inside the method? A equals 100.55 multiplied by 2. Therefore, A takes this new value and returns it. But in reality, nothing happens with the salary. We're simply asking what parameter we put into the method and answering that we put the value of the salary variable. In this case, we can't directly pass the salary variable because we need a variable of type double. So, we only pass the value of the salary. We said the salary is 100.55, so we used that value. This doesn't change the salary itself. It remains 100.55.

 Now, wd is assigned the value 2 * 100.55. Remember, when you pass a primitive data type to a method's parameter, you only pass its value. The salary value was 100.55, and we used that value. But what actually increases the value? It could increase any other variable, but the salary itself doesn't change.

 Okay, so the question arises: how do you write a method that will double the salary of this employee? Let's write the second method. It will also be public. We'll place it in cpl2, for example. To double the salary, we don't need a method with just one parameter because we already have the salary variable. We simply multiply it by 2. Inside the method, we write salary = salary * 2, and then we return salary. In this case, you're working with the salary itself, not its value. Now, we can use this method with m1.zp2 and print the salary to the screen. Just look at how the salary of the object m1 changes. After running the method, the salary will be doubled and become 201.1.

 Thus, when you use a primitive data type in the method parameter, remember that you're always using its value, not the variable itself. In this case, it's just a number. But when you work with the variable itself, you'll be using the variable's name.*/