package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterTest {

    @Test
    void testGreet() {
        Greeter greeter = new Greeter();
        assertEquals("Hi, World!", greeter.greet("World"));
    }

    @Test
    void testGoodbye() {
        Greeter greeter = new Greeter();
        assertEquals("Goodbye, Jan!", greeter.sayGoodbye("Jan"));
    }

    @Test
    void testWelcome() {
        Greeter greeter = new Greeter();
        String name = "John";
        String expectedResult = "Welcome, John!";
        String result = greeter.welcome(name);
        assertEquals(expectedResult, result);
    }
}
