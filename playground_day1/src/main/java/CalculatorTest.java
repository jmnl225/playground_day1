
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator cal;

    @BeforeEach
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void 덧셈() {
        assertEquals(7, cal.add(3, 4));
    }

    @Test
    public void 뺄셈() {
        assertEquals(1, cal.subtract(5, 4));

        //기대값과 결과값이 다를 경우 해당 값들을 출력하고 위치를 표시
        //assertEquals(2, cal.subtract(5, 4));
    }

    @Test
    public void 곱셉() {
        assertEquals(6, cal.multiply(2, 3));
        System.out.println(cal.add(1,1));
    }

    @Test
    public void 나눗셈() {
        assertEquals(2, cal.divide(8, 4));
    }

    @AfterEach
    public void tearDown() {
        //테스트 이후 실행되는 코드
        cal = null;
        //System.out.println(cal);
    }

}
