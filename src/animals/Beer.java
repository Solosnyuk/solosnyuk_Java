package animals;

public class Beer extends Animals implements Vegan, Meet {

    public Beer(String name){
        super(name);
    }

    @Override
    public void blood() {
        System.out.println("Ем мясо");
    }

    @Override
    public void greenOins() {
        System.out.println("Ем зелень");
    }
}
