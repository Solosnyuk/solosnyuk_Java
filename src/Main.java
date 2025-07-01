import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee bob = new Employee("Боб",34,"male",3000);
        Employee fred = new Employee("Фрэд", 40,"male",3000);
        Manager skott = new Manager("Скотт", 45, "male",3400,2);

        System.out.println(bob.getSalary(Month.monthsOneQartal(2)));

    }
}
