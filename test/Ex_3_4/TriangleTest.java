package Ex_3_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TriangleTest {

    private Triangle triangle = new Triangle(3, 4);

    @Test
    void calculateArea() {
        //given
        int expected = 6;

        //when
        int actual = triangle.calculateArea();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetA() {
        // given
        int expected = 3;

        // when
        int actual = triangle.getA();

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetB() {
        // given
        int expected = 3;

        // when
        int actual = triangle.getA();

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetA() {
        // given
        Triangle testedTriangle = new Triangle(0,3);
        int testedSize = 3 ;

        // when
        testedTriangle.setA(testedSize);

        // then
        Assertions.assertEquals(triangle.getA(), testedTriangle.getA());
    }

    @Test
    void testSetB() {
        // given
        Triangle testedTriangle = new Triangle(3,0);
        int testedSize = 4;

        // when
        testedTriangle.setB(testedSize);

        // then
        Assertions.assertEquals(triangle.getB(), testedTriangle.getB());
    }
}