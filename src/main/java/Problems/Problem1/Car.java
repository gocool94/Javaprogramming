package Problems.Problem1;

public class Car extends Vehicle{
    private int wheels;

    public Car() {
    }

    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(int wheels, int doors, int gears, boolean isManual) {
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public Car(String name, String size, int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {

        this.currentGear = currentGear;

        System.out.println("Car.setCurrrent Gear(): Changed to " + this.currentGear + "gear");
    }

    public void changeVelocity(int speed,int direction) {

        System.out.println("Velocity " + speed + "direction " + direction);

        move(speed,direction);
    }
}
