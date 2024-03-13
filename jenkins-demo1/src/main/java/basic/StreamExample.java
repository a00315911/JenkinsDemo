package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public List<String> filterAndSort(List<String> input) {
        return input.stream()
                .filter(s -> s.startsWith("J"))
                .sorted()
                .collect(Collectors.toList());
    }
}

