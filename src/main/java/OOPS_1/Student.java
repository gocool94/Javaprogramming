package OOPS_1;

public class Student {

    int IDcardNumber;
    String StudentName;

    public static void main(String[] args) {

        Student swanand = new Student();
        swanand.IDcardNumber=123;
        swanand.StudentName = "Swananad";

        Student gokul = new Student();
        Student divya = new Student();
        Student dj = new Student();

        System.out.println(swanand.IDcardNumber);
        System.out.println(swanand.StudentName);
    }
}
