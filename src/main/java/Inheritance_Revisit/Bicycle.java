package Inheritance_Revisit;

public class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {

        this.gear = gear;
        this.speed = speed;
    }


    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public void Bicycle() {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrease_speed_value) {

        speed -= decrease_speed_value;
    }

    public void Speedup(int increment) {

        speed+= increment;
    }


}
