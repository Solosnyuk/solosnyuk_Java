package abstrackt;

public class Circle extends Shape {
    public Circle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public double getArea() {
        return this.a * this.b * this.c;
    }
}
