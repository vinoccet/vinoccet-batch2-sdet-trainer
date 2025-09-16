package edu.in;

public class StringDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
//        a==b
        String name = "vinoth";
        name = name.concat(" kumar");
        String name1 = "vinoth";
        String name2 = new String("vinoth");

        Employee employee1 = new Employee("vinoth");
        Employee employee2 = new Employee("vinoth");

        System.out.println(name == name1);//T
        System.out.println(name == name2);//F

        System.out.println(name.equals(name2));//T
        System.out.println(employee1.equals(employee2));//F ==
    }

}


class Employee {
    String name;


    public Employee(String name) {

        this.name = name;
    }
}