package OOPS2_Assignment;

public class Person {


    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        if (this.firstName.isEmpty()) {
            return this.lastName;
        } else if (this.lastName.isEmpty() && this.firstName.isEmpty()) {
            return "";

        } else {
            return this.firstName;
        }
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {

        if (this.lastName.isEmpty()) {
            return this.firstName;
        } else if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else {
            return this.lastName;
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 || age < 100) {
            this.age = 0;
        } else {

            this.age = age;
        }
    }

    public boolean isTeen() {

        if (this.age > 12 && this.age < 20 ) {
            return true;
        }else {
            return false;
        }
    }


    public String getfullName() {


    return this.firstName +" "+ this.lastName;

    }


/*
    Person
        Write a class with the name Person. The class needs three fields (instance variables) with the names firstName,
        lastName of type String and age of type int. [DONE]

        Write the following methods (instance methods):
        •	Method named getFirstName without any parameters, it needs to return the value of the firstName field. [DONE]
        •	Method named getLastName without any parameters, it needs to return the value of the lastName field. [DONE]
        •	Method named getAge without any parameters, it needs to return the value of the age field. [DONE]
        •	Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field. [DONE]
        •	Method named setLastName with one parameter of type String, it needs to set the value of the lastName field. [DONE]
        •	Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100,
        it needs to set the age field value to 0. [DONE]


        •	Method named isTeen without any parameters,
        it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false. [DONE]

        •	Method named getFullName without any parameters,
        it needs to return the full name of the person. [DONE]

        •	In case both firstName and lastName fields are empty,
        Strings return an empty String. [DONE]

        •	In case lastName is an empty String, return firstName. [DONE]

        •	In case firstName is an empty String, return lastName. [DONE]

        To check if s String is empty, use the method isEmpty from the String class. For example,firstName.isEmpty()
        returns true if the String is empty or in other words, when the String does not contain any characters
     */
}
