public class Main {
    public static void main(String[] args) {
        Employee bob = new Employee("Боб","Инженер","bob@mail.ru",
                29323234,2100,27);
        Employee max = new Employee("Макс","рабочий","max@mail.ru",
                29334545,2200,21);
        Employee ilya = new Employee("Илья","Инженер","ilya@mail.ru",
                29311114,1800,60);
        Employee alis = new Employee("Алиса","Хр","Alisa@mail.ru",
                29320934,1149,23);
        Employee jo = new Employee("Джо","Инженер","jo@mail.ru",
                29323888,2150,55);

        Employee[] employees = new Employee[]{bob,max,ilya,alis,jo};
        for (Employee employee : employees) {
            if (employee.getAge() >= 40){
                employee.GetInfo();
            }
        }
    }
}

