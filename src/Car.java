public class Car implements Movable{
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + " едет назад");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + " едет вперед");
    }
}
