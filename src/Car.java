public class Car implements Transport{
    String name;
    String speed;

    public Car(String speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public void getSpeed() {
        System.out.println(this.name + " разогнался до " + this.speed);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
