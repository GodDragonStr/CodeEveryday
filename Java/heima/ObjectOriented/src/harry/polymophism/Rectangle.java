package harry.polymophism;

public class Rectangle extends GeometricObject {
    private double length;
    private double width;

    Rectangle(String color, double weight, double length, double width) {
        super(color, weight);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double findArea(){
        return this.length * this.width;
    }

    @Override
    public void show() {
        System.out.println("Rectangle");
    }

}
