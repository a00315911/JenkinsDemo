package basic;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void sayHello() {
        new HelloWorld().sayHello();
    }

    @Test
    void callNotCovered() {
        new HelloWorld().notCovered();
    }

}
