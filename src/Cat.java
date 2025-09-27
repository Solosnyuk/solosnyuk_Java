public class Cat extends Animal{
    public static Integer countCat = 0;
    public Cat(String name) {
        super(name);
        countCat++;
        countAnimal++;
    }

    @Override
    public void run(Integer length){
        if (length < 200){
            System.out.println(getName() + " пробежал " + length);
        }else {
            System.out.println(getName() + " не может столько пробежать(");
        }
    }
}
