public class Animal {
    static Integer countAnimal = 0;
    String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void run(Integer length){
    }

    public void swim(Integer length){
        System.out.println(getName() + " не умеет плавать((");
    }

}
