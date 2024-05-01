package Ex_3_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HexagonTest {
    @Test
    void calculateArea() {
        //given
        Rectangle rectangle = new Rectangle(3,4);
        //when
        int actual = rectangle.calculateArea();
        //then
        Assertions.assertEquals(12,actual);
    }

    @Test
    void calculateAreaWithMinusA() {
        // given
        Rectangle rectangle = new Rectangle(-3, 4);
        Exception actual = null;
        //when
        try {
            rectangle.setA(-3);
        } catch (Exception thrown) {
            actual = thrown;
        }
        //then
        Assertions.assertNotNull(actual, "There should be an exception, while using negative in setter.");
    }

    @Test
    void calculateAreaWithZero() {
        //given
        Rectangle rectangle = new Rectangle(0, 4);
        int expected = 0;
        //when
        int actual = rectangle.calculateArea();
        //then
        Assertions.assertEquals(expected, actual);
    }

}
