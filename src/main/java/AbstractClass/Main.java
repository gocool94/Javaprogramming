package AbstractClass;

interface Polygon {

    void getArea(int length, int breadth);
}

class Rectangle implements Polygon {
    @Override
    public void getArea(int length, int breadth) {

        System.out.println("The Area of the rectangle is " + (length * breadth));

    }
}

class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.getArea(4,5);
    }
}
