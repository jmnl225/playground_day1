import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalculatorTest2{
    @Before
    public void setup() {
        System.out.println("setup");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("test1");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("test2");
    }

    @After
    public void teardown() {
        System.out.println("teardown");
    }
}
