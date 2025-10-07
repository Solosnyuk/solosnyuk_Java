import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Model> modelList = new ArrayList<>(
                Arrays.asList(
                        new Model(10),
                        new Model(15),
                        new Model(10),
                        new Model(2)
                )
        );

        Map<Model, Integer> countModel = new HashMap<>();

        for (Model model : modelList) {
            countModel.put(model,countModel.getOrDefault(model,0) + 1);
        }

        countModel.entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .forEach(n -> System.out.println(n.getKey()));
    }
}

