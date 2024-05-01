package Ex_3_4;


public class Rectangle implements GeometricFigure {

    private int a, b;
    public Rectangle(int a, int b) {
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
