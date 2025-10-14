public class Robot implements Movable {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + " движется вперед");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + " движется назад");
    }
}
