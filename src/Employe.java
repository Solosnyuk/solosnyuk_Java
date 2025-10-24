public class Employe {
    String name;
    String departament;
    Double salary;

    public Employe(String name, String departament, Double salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }

    public Double getSalary() {
        return salary;
    }
}
