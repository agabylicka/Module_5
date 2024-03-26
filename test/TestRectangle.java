import Ex_3_4.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRectangle {
    private Rectangle rectangle = new Rectangle(2,3);
    @Test
    public void testEquals() {
        //given
        int expected = 6;
        //when
        int actual = rectangle.calculateArea();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZero() {
        //given
        int expected = 0;
        Rectangle emptyRectangle = new Rectangle(0,2);
        //when
        int actual = emptyRectangle.calculateArea();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetterA() {
        // given
        int expected = 2;
        // when
        int actual = rectangle.getA();
        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetterB() {
        // given
        int expected = 3;
        // when
        int actual = rectangle.getB();
        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetterA() {
        // given
        Rectangle testedRectangle = new Rectangle(0,3);
        int testedSize = 2 ;
        // when
        testedRectangle.setA(testedSize);
        // then
        Assertions.assertEquals(rectangle.getA(), testedRectangle.getA());
    }

    @Test
    public void testSetterB() {
        // given
        Rectangle testedRectangle = new Rectangle(2,0);
        int testedSize = 3;
        // when
        testedRectangle.setB(testedSize);
        // then
        Assertions.assertEquals(rectangle.getB(), testedRectangle.getB());
    }
}
