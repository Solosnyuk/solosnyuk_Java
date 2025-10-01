package animals;

public class Leon extends Animals implements Meet {

    public Leon(String name){
        super(name);
    }

    @Override
    public void blood() {
        System.out.println("Люблю много мяса");
    }
}
