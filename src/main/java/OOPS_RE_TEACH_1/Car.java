package OOPS_RE_TEACH_1;

public class Car {

/*
        //this keyword

            ->  this  keyword can be used to refer current class instance variable
            -> this can be used to invoke current class method

            -> this() keyword is used to invoke currenct class constructor
            -> this can be passed as an argument in the method call
            -> this can be passed as an argument in the constructor call as well.
            -> this can be used to return the current class instance from the method


 */


    //Encapsulation is binding up of data and its member together


    // GET ->  AND  SET ->





//4 rules for a constructor

    // the name should be same as that of class name

    // return type

    public String getColor_name() {
        return this.Color_name;
    }

    public void setColor_name(String color_name) {
        this.Color_name = color_name;
    }

    public String getModel_name() {
        return this.Model_name;
    }

    public void setModel_name(String model_name) {
        Model_name = model_name;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getNoofTyres() {
        return NoofTyres;
    }

    public void setNoofTyres(int noofTyres) {
        NoofTyres = noofTyres;
    }

    public boolean getIs_Fog_Lamp_available() {
        return is_Fog_Lamp_available;
    }

    public void setIs_Fog_Lamp_available(boolean is_Fog_Lamp_available) {
        this.is_Fog_Lamp_available = is_Fog_Lamp_available;
    }

    public long getNumberplatenumber() {
        return Numberplatenumber;
    }

    public void setNumberplatenumber(long numberplatenumber) {
        this.Numberplatenumber = numberplatenumber;
    }

    //Abstract, static , final and synchronised


    public Car(){
        System.out.println("Consturctor has been created");
    }




    private String Color_name;
    private String Model_name;



    private int acceleration = 0;

    public Car(String model, String color) {

        this.Color_name = color;
        this.Model_name = model;


    }


    //field
    //What the car has?

    private int NoofTyres = 4;

    private boolean is_Fog_Lamp_available;




    private long Numberplatenumber;

    //field or data member or instance variale




    //method
    // what the car does?

    public void start_engine() {

        System.out.println("The Engine is turned ON");
        System.out.println("Acceleration is " +this.acceleration);
        System.out.println("The AC is turned on ");
    }

    public void Steer_left(){

        System.out.println("Car is Steering left");

    }

    public void Steer_right(){

        System.out.println("Car is Steering right");

        System.out.println(this.Model_name);

    }

    public void move_forward(){

        for (int i = this.acceleration;i<60;i++) {

            System.out.println("Car is Moving forward"+i );

        }





    }


}
