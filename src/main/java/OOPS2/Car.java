package OOPS2;

public class Car {

    int tyres = 4;
    String Color = "black";


    public boolean StartEngine(int fuel){

        System.out.println("lights should be turned ON");

        if (fuel > 20) {
            System.out.println("We are having Fuel, Please Start the Engine ");
            System.out.println("Engine has started");
            return true;
        } else {
            System.out.println("Engine Turned off");
            return false;
        }
    }


    public void Acceleration(boolean isEngineStarted, int AccelerationUnit){



        if (isEngineStarted==true){
            System.out.println("Acceleration is pressedd");
            for (int i = 0;i<AccelerationUnit;i++){
                System.out.println("Car goes in "+i+"Speedd");
            }
        }
    }

    public void HasBrakeApplied(boolean Check){

        if (Check == true){
            System.out.println("Brake has been applied");
        } else {
            System.out.println("Brake has not been apploed");
        }
    }
}



//Write four methods


//Start Engine
//Turn on Lights
//Petrol check (fuel i more than 20 percent start, Or stop)


//Drive
//Accelerate is pressed check
// move forward
