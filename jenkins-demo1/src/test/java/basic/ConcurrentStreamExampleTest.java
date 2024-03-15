package basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class ConcurrentStreamExampleTest {

    @Test
    public void testToUpperCaseConcurrent() {
        ConcurrentStreamExample example = new ConcurrentStreamExample();
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "concurrency");

        List<String> upperCasedWords = example.toUpperCaseConcurrent(words);

        assertEquals(Arrays.asList("HELLO", "WORLD", "JAVA", "STREAM", "CONCURRENCY"), upperCasedWords,
                "The words should be transformed to upper case");

        assertEquals(words.size(), example.getCount(),
                "The processed count should match the number of input words");
    }
}

