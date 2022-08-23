package Problems.Problem1;

public class Vehicle {
    private String name;

    public Vehicle() {
    }

    private String size;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }

    public int getCurrentDirection() {
        return CurrentDirection;
    }

    private int CurrentVelocity;
    private int CurrentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.CurrentVelocity = CurrentVelocity;
        this.CurrentDirection = CurrentDirection;
    }



    public void steer(int direction) {

        this.CurrentDirection += direction;
        System.out.println("vehicle .steer() : Sterring at" + CurrentDirection + "Degrees" );
    }


    public void move(int velocity, int direction) {
        CurrentVelocity = velocity;
        CurrentDirection = direction;

        System.out.println("Vehicle move (): Moving at " +CurrentVelocity+ "in direction " +CurrentDirection + "Degrees");
    }

    public void stop() {

        this.CurrentVelocity = 0;

    }
}
