package basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class StreamExampleTest {

    @Test
    public void testFilterAndSort() {
        StreamExample example = new StreamExample();
        List<String> input = Arrays.asList("Java", "Python", "JavaScript");
        List<String> expected = Arrays.asList("Java", "JavaScript");
        List<String> result = example.filterAndSort(input);
        assertEquals(expected, result);
    }
}
