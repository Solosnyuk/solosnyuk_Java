public class Guitar extends Instrument{
    @Override
    public void play() {
        System.out.println(this.getName() + " играет рок");
    }

    public Guitar(String name) {
        this.setName(name);
    }
}
