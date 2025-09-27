public class Dog extends Animal{
    public static Integer countDog = 0;

    public Dog(String name){
        super(name);
        countDog++;
        countAnimal++;
    }

    public void run(Integer length){
        if (length < 500){
            System.out.println(getName() + " пробежал " + length);
        }else {
            System.out.println(getName() + " не может столько пробежать(");
        }
    }

    public void swim(Integer length){
        if (length < 10){
            System.out.println(getName() + " проплыл " + length);
        }else {
            System.out.println(getName() + " не может столько проплыть((");
        }
    }
}
