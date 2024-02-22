import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamTest {

    public static void main(String[] args) {
        // 示例1: 并行化处理集合
        List<String> strings = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        strings.parallelStream()
                .filter(s -> s.startsWith("c"))
                .forEach(System.out::println);

        System.out.println("----");

        // 示例2: 并行化数值流
        IntStream.range(1, 100)
                .parallel()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("----");

        // 示例3: 计算大量数据的总和
        int total = IntStream.rangeClosed(1, 1_000_000)
                .parallel()
                .sum();
        System.out.println("Total: " + total);
    }

    @Test
    public void test() {
        List<String> stringList = Arrays.asList("Hello", "World", "Java", "Stream");
        stringList.stream().mapToInt(String::length).forEach(System.out::println);
    }
}

