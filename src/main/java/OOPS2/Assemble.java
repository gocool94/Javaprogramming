package OOPS2;

public class Assemble {

    public static void main(String[] args){

       Car Ferrari = new Car();


       Boolean isStarted = Ferrari.StartEngine(30);

       Ferrari.Acceleration(isStarted,50);

       Ferrari.HasBrakeApplied(false);
    }
}
