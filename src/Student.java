public class Student extends Person {
    String fakultet;

    public Student(String name, Integer age, String fakultet) {
        super(name, age);
        this.fakultet = fakultet;
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о студенте: " + "\n" + "Имя: " + this.name +
                "\n" + "Факультет: " + this.fakultet);
    }
}
