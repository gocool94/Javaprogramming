package UnderstandingKeywords;

public class main {
    public static void main(String[] args) {

        House gokulsHome = new House();

        System.out.println(gokulsHome.HouseMake = "Brick");
        gokulsHome.setHouseMaterial("Cement");
        System.out.println(gokulsHome.getHouseMaterial());

        House Ajayshome = gokulsHome;

        System.out.println(Ajayshome.HouseMaterial);
        System.out.println(Ajayshome.HouseMake);

        Ajayshome.HouseMake = "Sand";

        System.out.println(gokulsHome.HouseMake);




    }
}
