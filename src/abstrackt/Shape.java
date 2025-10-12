package abstrackt;

public abstract class Shape {
    int a;
    int b;
    int c;

    public Shape(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract double getArea();
}
