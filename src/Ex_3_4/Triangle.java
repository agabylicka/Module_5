package Ex_3_4;


public class Triangle implements GeometricFigure {

    private int a, b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return (int) (a * b * 0.5);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) throws Exception {
        if (a <= 0) {
            throw new Exception("Size has to be positive.");
        }
        this.a = a;
    }

    public void setB(int b) throws Exception {
        if (b <= 0) {
            throw new Exception("Size has to be positive.");
        }
        this.b = b;
    }
}
