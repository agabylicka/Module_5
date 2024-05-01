import Ex_3_4.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRectangle {
    private Rectangle rectangle = new Rectangle(2,2);

    @Test
    void calculateArea() {
        //given
        Rectangle rectangle = new Rectangle(3, 2);
        int expected = 6;
        //when
        int actual = rectangle.calculateArea();
        //then
        Assertions.assertEquals(expected, actual);
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
    void calculateAreaWithMinusB() {
        // given
        Rectangle rectangle = new Rectangle(3, -4);
        Exception actual = null;
        //when
        try {
            rectangle.setB(-4);
        } catch (Exception thrown) {
            actual = thrown;
        }
        //then
        Assertions.assertNotNull(actual, "There should be an exception, while using negative in setter.");
    }

    @Test
    void calculateAreaWithZero() {
        Rectangle rectangle = new Rectangle(0, 4);
        //given
        int expected = 0;
        //when
        int actual = rectangle.calculateArea();
        //then
        Assertions.assertEquals(expected, actual);
    }

}
