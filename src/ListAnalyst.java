import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListAnalyst {
    public static Map<String, Long> groupPassedList(List<String> list) {
        return list.stream()
                .collect(
                        Collectors.groupingBy(
                                String -> String,
                                Collectors.counting()
                        )
                );
    }

    public static List<String> failedIdList(List<TestCase> list) {
        return list.stream()
                .filter(
                        testCase -> "FAILED".equals(testCase.getStatus))
                .sorted(
                        Comparator.comparingLong(TestCase::getDurationMs)
                                .reversed()
                ).collect(Collectors.toList());
    }

    String str = String.format(
            "efgdhgfkjsdhfjkbsdkfbksjf odgjjsdkhjj   sdjghjksghjh %s sfdfj %d klgjjfjlfg %b",
            "Hello",
            10,
            true
    );
}
