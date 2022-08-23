package Inheritance_Revisit;

public class MountainBike extends Bicycle {

    public int seat_height;

    public MountainBike(int gear, int speed, int adjusted_seat_height) {

        super(gear,speed);

        this.seat_height = adjusted_seat_height;


    }



    public void setSeat_height (int seatHeighttoSet) {

        seat_height = seatHeighttoSet;
    }




}
