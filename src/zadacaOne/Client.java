package zadacaOne;

import java.util.List;

public class Client {
    private int id;
    private String name;
    private int age;
    private List<Phone> phoneList;

    public Client(List<Phone> phoneList, int age, String name, int id) {
        this.phoneList = phoneList;
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }
}
