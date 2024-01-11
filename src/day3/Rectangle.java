package day3;

public class Rectangle {
    private int base, height;
    public Rectangle (int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int getPerimeter() {
        return (this.base + this.height)* 2;
    }

    private int getArea() {
        return this.base * this.height;
    }

    public void printRectangle()  {
        System.out.println(getArea());
        System.out.println(getPerimeter());
    }

    public static void printTwoRectangles(Rectangle r1, Rectangle r2) {
        r1.printRectangle();
        r2.printRectangle();
    }

}
