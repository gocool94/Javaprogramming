package OOPS_Project;

public class Hamburger {

    private String name;
    private String meat;
    private double price;

    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddtion1(String name,double price) {

        this.addition1Name = name;
        this.addition1price = price;
    }

    public void addHamburgerAddtion2(String name,double price) {

        this.addition1Name = name;
        this.addition1price = price;
    }

    public void addHamburgerAddtion3(String name,double price) {

        this.addition1Name = name;
        this.addition1price = price;
    }

    public void addHamburgerAddtion4(String name,double price) {

        this.addition1Name = name;
        this.addition1price = price;
    }


    public double itemizeHamburger() {

        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is "  + this.price);


        if(this.addition1Name!= null) {
            hamburgerPrice += this.addition1price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1price);
        }

        if(this.addition2Name!= null) {
            hamburgerPrice += this.addition2price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2price);
        }

        if(this.addition3Name!= null) {
            hamburgerPrice += this.addition3price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3price);
        }

        if(this.addition4Name!= null) {
            hamburgerPrice += this.addition4price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4price);
        }

        return hamburgerPrice;


    }

    private String addition1Name;
    private double addition1price;

    private String addition2Name;
    private double addition2price;

    private String addition3Name;
    private double addition3price;

    private String addition4Name;
    private double addition4price;

}
