package OOPS_Project;

public class main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage",3.5,"wheat");


        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddtion1("Tomato",0.27);
        hamburger.addHamburgerAddtion2("Letuce",7);
        hamburger.addHamburgerAddtion2("potato",3);

        System.out.println("Total burger price is  " + hamburger.itemizeHamburger());
    }
}
