package zadacaOne;

public class User {
    private static String name;
    private static Integer age;
    private Group group;

    public User(String name, Integer age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static void setAge(Integer age) {
        User.age = age;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
