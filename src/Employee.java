public class Employee {
    public String name;
    public int age;
    public int weight;
    public String color;

    public Employee(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    void getStatus() {
        if (this.color != "black") {
            System.out.println(this.name + " является свободным");
        }
        System.out.println(this.name + " является нигером");
    }
}
