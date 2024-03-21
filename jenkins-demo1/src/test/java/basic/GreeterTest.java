package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    @Test
    public void testGreet() {
        Greeter greeter = new Greeter();
        assertEquals("Hello, World!", greeter.greet("World"));
    }

    @Test
    public void testGoodbye(){
        Greeter greeter = new Greeter();
        assertEquals("Goodbye, Feb!",greeter.sayGoodbye("Feb"));
    }
}
