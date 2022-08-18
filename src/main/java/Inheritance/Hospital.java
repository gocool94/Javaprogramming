package Inheritance;

class Doctor {

    public String DoctorName;
    public String DoctorID;

     boolean Doctor_Details(){

        System.out.println(this.DoctorID +"and the Doctor name is "+this.DoctorName);
         return false;
     }
}


class Surgeon extends Doctor {

    void Surgeon_Details() {
        System.out.println("The surgeon extends from doctor");
    }
}

public class Hospital {

    public static void main(String[] args) {

        Surgeon ajay = new Surgeon();

        ajay.DoctorID = "ID123";
        ajay.DoctorName = "Ajay";

        System.out.println(ajay.Doctor_Details());

    }
}


//Super