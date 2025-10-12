public class Bike implements Transport{
    String name;
    String speed;

    public Bike(String name, String speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void getSpeed() {
        System.out.println(this.name + " разогнался до " + this.speed);
    }
}
