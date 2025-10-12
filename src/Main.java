import abstrackt.Circle;
import abstrackt.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2,3,5);
        System.out.println(circle.getArea());
    }
}