public class Manager extends Employee {

    private int countEmployee;

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public Manager(String name, int age, String sex, int salary, int countEmployee) {
        super(name,age,sex,salary);
        this.countEmployee = countEmployee;
    }

    @Override
    public double getSalary(Month[] months) {
        int salaryMonth = 0;
        for(Month month : months) {
            salaryMonth = month.getWorkDay() * getSalary();
        }
        double salaryOnMonth = salaryMonth + (salaryMonth * 0.01 * getCountEmployee());
        return salaryOnMonth;
    }

    public int getCountEmployee() {
        return countEmployee;
    }

    public void setCountEmployee(int countEmployee) {
        this.countEmployee = countEmployee;
    }
}
