package basic;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void sayHello() {
        new HelloWorld().sayHello();
    }

    @Test
    public void callNotCovered() {
        new HelloWorld().notCovered();
    }

}
