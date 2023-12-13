package harry.polymophism;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    @Override
    public double findArea(){
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public void show() {
        System.out.println("Circle");
    }

}
