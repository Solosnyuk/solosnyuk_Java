package zadacaOne;

import java.util.List;

public class Student {
    String name;
    List<Integer> grade;

    public Student(String name, List<Integer> grade) {
        this.name = name;
        this.grade = grade;
    }

    public List<Integer> getGrade() {
        return grade;
    }

    public void setGrade(List<Integer> grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
