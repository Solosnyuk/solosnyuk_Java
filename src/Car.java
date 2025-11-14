import java.util.Objects;

public class Car {
    String brand;
    String model;
    Integer year;

    public Car(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
