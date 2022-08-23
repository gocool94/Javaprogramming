package OverLoadingvsOverRiding;

public class MethodOverRiding {

    static class Animal {


        void eat() {

            System.out.println("The Animal is eating");
        }


    }

    static class cow extends Animal {


        @Override
        void eat() {

            System.out.println("We are using method of derived class");
            System.out.println("the Cow is eating");
        }
    }

    static class MethodOverriding {

        public void main(String[] args) {

            cow jersey = new cow();
            Animal anyanimal = new Animal();

            jersey.eat();

            System.out.println("*******************************************");
            anyanimal.eat();

            Animal animal = new Animal();

            animal.eat();
        }
    }
}
