package OOPS_Project_Recap;

public class Main {
    public static void main(String[] args) {

        Hamburger gokulhamburger = new Hamburger("Basic","Chicken",3.56,"wheat");
        double price = gokulhamburger.itemizeHamburger();

        gokulhamburger.addHamburgerAddition1("Tomato",2.35);


        System.out.println("Total burger price is " + gokulhamburger.itemizeHamburger());


        HealthyBurger ajaysBurger = new HealthyBurger("Bacon" , 5.67);

        ajaysBurger.addHamburgerAddition1("Egg",4.56);
        ajaysBurger.addHealthAddition2("Lentils",4.44);
        System.out.println("Total Healthy Burger price is  " + ajaysBurger.itemizeHamburger());
    }
}
