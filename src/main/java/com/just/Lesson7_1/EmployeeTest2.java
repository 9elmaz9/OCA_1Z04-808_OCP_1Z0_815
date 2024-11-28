package com.just.Lesson7_1;



public class EmployeeTest2 {

    public static void main(String[] args) {

        com.just.Lesson7.hw.Employee emp1 = new com.just.Lesson7.hw.Employee(5); //publik  OK

        //default and private  не видно из другой папки
    //    com.just.Lesson7.hw.Employee emp2 = new com.just.Lesson7.hw.Employee("Ivanov");
    //    com.just.Lesson7.hw.Employee emp3 = new com.just.Lesson7.hw.Employee(555.5);

       // System.out.println(emp1.id);  //  не видно потому что деволтный акссес в ругой папке не виден
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary); //потому что прайват поэтому не видно тут


        // из за того что методы паблик удается увидеть информацию которую они несут
        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

    }
}
