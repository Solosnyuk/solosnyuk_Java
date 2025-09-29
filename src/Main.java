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

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n){
        if (n == 13 || n == 14 || n == 17 || n == 18 || n ==19){
            return 0;
        }else {
            return n;
        }
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - c) <= 1 || Math.abs(a - b) <= 1){
            if (Math.abs(a - c) >= 2 || Math.abs(a - b) >= 2){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }

}

