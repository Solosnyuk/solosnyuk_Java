package animals;

public class Wolf extends Animals implements  Meet{

    public Wolf(String name){
       super(name);
    }

    @Override
    public void blood() {
        System.out.println("Love meet");
    }
}
