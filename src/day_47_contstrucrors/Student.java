package day_47_contstrucrors;

public class Student {

    //no args constructor
    public Student() {
        System.out.println("no-args constructor");
    }
    //cons with 1 param ;string name
    public Student(String name) {
        System.out.println("name param constructor | name " +name);
    }
    public Student(int age){
        System.out.println("age cons "+ age);
    }
    public Student(String name,int age){
        System.out.println("name + age "+ name +" ," +age);
    }
}
