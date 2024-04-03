package Ex_3_4;


public class Rectangle implements GeometricFigure {

    private Integer a, b;
    public Rectangle(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public int calculateArea() {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(Integer a) throws Exception {
        if (a == null) {
            throw new NullPointerException("Size cannot be null.");
        }
        if (a <= 0) {
            throw new Exception("Size has to be positive.");
        }
        this.a = a;
    }

    public void setB(Integer b) throws Exception {
        if (b == null) {
            throw new NullPointerException("Size cannot be null.");
        }
        if (b <= 0) {
            throw new Exception("Size has to be positive.");
        }
        this.b = b;
    }
}
