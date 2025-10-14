public abstract class Instrument implements PlayAble{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play(){
        System.out.println(this.name + " Играет мелодию");
    }

    public void tune() {
        System.out.println("Произошла настройка инструмента " + this.name);
    }
}
