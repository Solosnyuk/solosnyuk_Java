package zadacaOne;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static Client findHigAgeClient(List<Client> clientList) {
        return clientList.stream()
                .filter(
                        c -> c.getPhoneList().stream()
                                .anyMatch(
                                        p -> p.getPhoneType() == PhoneType.STATIONARY
                                )
                )
                .max(Comparator.comparingInt(Client::getAge))
                .orElseThrow();
    }
}
