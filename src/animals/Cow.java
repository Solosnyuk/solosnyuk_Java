package animals;

public class Cow extends Animals implements Vegan {

    public Cow(String name){
        super(name);
    }

    @Override
    public void greenOins() {
        System.out.println("Люблю много зелени");
    }
}
