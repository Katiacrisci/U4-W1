package day3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 40);
        rectangle1.printRectangle();
        Rectangle.printTwoRectangles(rectangle1, new Rectangle(50, 90));
        SimCard sim = new SimCard("3406677889");
        sim.printInfoSim();


    }
}
