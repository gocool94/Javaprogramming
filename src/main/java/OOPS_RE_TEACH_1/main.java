package OOPS_RE_TEACH_1;

public class main {

    public static void main(String[] args){

        Car Maruthi = new Car(); // Creating an object of Car // constructor is being called here

        Maruthi.setModel_name("Ciaz");




        Maruthi.setColor_name("Magma Grey");
        Maruthi.setIs_Fog_Lamp_available(true);

        Maruthi.setNoofTyres(5);

        Maruthi.setNumberplatenumber(1234567891);


        System.out.println( "This is my Car of "+Maruthi.getModel_name()+" of " +Maruthi.getColor_name() +" with " +
                Maruthi.getNoofTyres()+" tyres and the fog lamp is present to be "+ Maruthi.getIs_Fog_Lamp_available());




        Maruthi.start_engine();
        Maruthi.move_forward();
        Maruthi.Steer_right();
        Maruthi.Steer_left();


        System.out.println("***************************************************************************************");

/*
        Car Skoda = new Car("superb","Black");


        Skoda.is_Fog_Lamp_available = false;


        System.out.println( "This is my Car of "+Skoda.Model_name+" of " +Skoda.Color_name +" with " +
                Skoda.NoofTyres+" tyres and the fog lamp is present to be "+ Skoda.is_Fog_Lamp_available);


        Skoda.start_engine();
        Skoda.move_forward();
        Skoda.Steer_right();
        Skoda.Steer_left();



 */
















    }
}
