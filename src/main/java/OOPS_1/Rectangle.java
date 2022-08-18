package OOPS_1;

public class Rectangle {

    int lenght;
    int width;

    void insert(int i ,int w){

        lenght= i;
        width = w;
    }

    void calculateArea(){
        System.out.println("The area to be calculated is =======");
        System.out.println(lenght*width);
    }

    public static void main(String[] args){

        Rectangle GokulsHouse = new Rectangle();
        Rectangle AjaysHouse = new Rectangle();

        GokulsHouse.insert(12,13);
        AjaysHouse.insert(14,15);


        System.out.println("Gokul's House");
        GokulsHouse.calculateArea();

        System.out.println("Ajays House");
        AjaysHouse.calculateArea();

    }

}
