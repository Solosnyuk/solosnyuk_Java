public class Employee {
    String name;
    String post;
    String email;
    Integer phone_number;
    Integer Salary;
    Integer age;

    public Employee(String name, String post, String email, Integer phone_number, Integer salary, Integer age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone_number = phone_number;
        this.Salary = salary;
        this.age = age;
    }

    public void GetInfo(){
        System.out.println("Имя " + getName() +
                "\n" + "Должность " + getPost() +
                "\n" + "Email " + getEmail() +
                "\n" + "Телефон " + getPhone_number() +
                "\n" + "Зарплата " + getSalary() +
                "\n" + "Возраст " + getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
