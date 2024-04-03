package Ex_3_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TriangleTest {

    private Triangle triangle = new Triangle(3, 4);

    @Test
    void calculateArea() {
        // given
        // 3 * 4 * 0.5 = 6
        int expected = 6;
        // when
        int actual = triangle.calculateArea();
        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateAreaWithMinusA() {
        // given
        Triangle triangle = new Triangle(-3, 4);
        Exception actual = null;
        //when
        try {
            triangle.setA(-3);
        } catch (Exception thrown) {
            actual = thrown;
        }
        //then
        Assertions.assertNotNull(actual, "There should be an exception, while using negative in setter.");
    }

    @Test
    void calculateAreaWithMinusB() {
        // given
        Triangle triangle = new Triangle(3, -4);
        Exception actual = null;
        //when
        try {
            triangle.setB(-3);
        } catch (Exception thrown) {
            actual = thrown;
        }
        //then
        Assertions.assertNotNull(actual, "There should be an exception, while using negative in setter.");
    }

    @Test
    void calculateAreaWithZero() {
        Triangle triangle = new Triangle(0, 4);
        //given
        int expected = 0;
        //when
        int actual = triangle.calculateArea();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setAWithNull() {
        //given
        Triangle triangle = new Triangle(null, 4);
        Exception actual = null;
        //when
        try {
            triangle.setA(null);
        } catch (Exception thrown) {
            actual = thrown;
        }
        //then
        Assertions.assertNotNull(actual, "There should be an exception, while using null in setter.");
    }

    @Test
    void setBWithNull() {
        //given
        Triangle triangle = new Triangle(5,null);
        Exception actual = null;
        //when
        try {
            triangle.setB(null);
        } catch (Exception thrown) {
            actual = thrown;
        }
        //then
        Assertions.assertNotNull(actual, "There should be an exception, while using null in setter.");
    }
}