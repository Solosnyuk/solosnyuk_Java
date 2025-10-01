package animals;

public class Banny extends Animals implements Vegan {

    public Banny(String name){
        super(name);
    }

    @Override
    public void greenOins() {
        System.out.println("ем зелень");
    }
}
