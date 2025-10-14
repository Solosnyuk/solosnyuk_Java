public class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println(this.getName() + " играет классику");
    }

    public Piano(String name) {
        this.setName(name);
    }
}
