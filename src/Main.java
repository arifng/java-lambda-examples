import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        countAndSort();
    }

    private static void countAndSort() {
        String[] arr = {"apple","apple","apple","apple","banana","banana","malta","malta","malta","malta","malta","malta","malta"};
        List<Map.Entry<String, Long>> collect = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .toList();

        for (Map.Entry<String, Long> entry : collect) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
