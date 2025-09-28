package three;

public class Cat implements Person{
    public String name;
    Integer limitRun = 4;
    Integer limitSwim = 0;

    public Cat(String name){
        this.name = name;
    }

    public boolean run(Integer length) {
        if (length <= limitRun){
            System.out.println("Кот " + this.name + " успешно пробежал " + length);
            return true;
        }
        System.out.println("Кот " + this.name + " не смог пробежать " + length);
        return false;
    }

    public boolean jump(Integer length) {
        if (length < limitSwim){
            return true;
        }
        System.out.println(this.name + " не умеет плавать");
        return false;
    }

    public String getName() {
        return name;
    }
}
