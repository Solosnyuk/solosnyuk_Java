package three;

public class Human implements Person{
    String name;
    Integer limitRun = 40;
    Integer limitSwim = 5;

    public Human(String name){
        this.name = name;
    }

    public boolean run(Integer length) {
        if (length <= limitRun){
            System.out.println("Человек " + this.name + " успешно пробежал " + length);
            return true;
        }
        System.out.println("Человек " + this.name + " не смог пробежать " + length);
        return false;
    }

    public boolean jump(Integer length) {
        if (length <= limitSwim){
            System.out.println("Человек " + this.name + " проплыл " + length);
            return true;
        }
        System.out.println("Человек " + this.name + " не смог проплыть " + length);
        return false;
    }

    public String getName() {
        return name;
    }
}
