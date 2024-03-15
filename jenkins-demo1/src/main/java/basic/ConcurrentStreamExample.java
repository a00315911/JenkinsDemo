package basic;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ConcurrentStreamExample {
    private AtomicInteger count = new AtomicInteger(0);

    public List<String> toUpperCaseConcurrent(List<String> input) {
        return input.parallelStream()
                .map(s -> {
                    count.incrementAndGet();
                    return s.toUpperCase();
                })
                .collect(Collectors.toList());
    }

    public int getCount() {
        return count.get();
    }

    public static void main(String[] args) {
        ConcurrentStreamExample example = new ConcurrentStreamExample();
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "concurrency");
        List<String> upperCasedWords = example.toUpperCaseConcurrent(words);

        upperCasedWords.forEach(System.out::println);
        System.out.println("Total processed count: " + example.getCount());
    }
}
