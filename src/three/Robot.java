package three;

public class Robot implements Person{
    public String name;
    Integer limitRun = 3;
    Integer limitSwim = 3;

    public Robot(String name){
        this.name = name;
    }

    public boolean run(Integer length) {
        if (length <= limitRun){
            System.out.println("Робот " + this.name + " успешно пробежал " + length);
            return true;
        }
        System.out.println("Робот " + this.name + " не смог пробежать " + length);
        return false;
    }

    public boolean jump(Integer length) {
        if (length <= limitSwim){
            System.out.println("Робот " + this.name + " успешно пробежал " + length);
            return true;
        }
        System.out.println("Робот" + this.name + " не смог пробежать " + length);
        return false;
    }

    public String getName() {
        return name;
    }
}
