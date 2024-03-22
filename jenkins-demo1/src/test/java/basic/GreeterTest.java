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

    @Test
    public void testWelcome() {
        Greeter greeter = new Greeter();
        String name = "John";
        String expectedResult = "Welcome, John!";
        String result = greeter.welcome(name);
        assertEquals(expectedResult, result);
    }
}
