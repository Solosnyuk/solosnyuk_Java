import three.Cat;
import three.Human;
import three.Obstacle.Obstacle;
import three.Obstacle.Poole;
import three.Obstacle.Swimm;
import three.Person;
import three.Robot;


public class Main {
    public static void main(String[] args) {
        Person[] persone = {new Robot("mask"),
                new Human("Bob"),
                new Cat("mikki")};

        Obstacle[] obstacles = {new Poole(1),
                new Poole(3),
                new Poole(5)};
        
        Obstacle[] pooleAndSwimm = {new Poole(3),
                                    new Swimm(3)};

        for (Person person : persone) {
            System.out.println("\n" + person.getName() + " начинает испытания:");
            boolean success = true;

            for (Obstacle obstacle : obstacles) {
                boolean result;

                if (obstacle instanceof Poole) {
                    result = person.run(obstacle.getLength());
                } else if (obstacle instanceof Swimm) {
                    result = person.jump(obstacle.getLength());

                    if (!result) {
                        System.out.println(person.getName() + " выбыл из испытаний.");
                        success = false;
                        break;
                    }
                }

                if (success) {
                    System.out.println(person.getName() + " прошёл все препятствия!");
                }
            }
        }
    }
}

