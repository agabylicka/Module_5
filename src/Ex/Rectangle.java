package Ex;

public class Rectangle implements Ex_3.GeometricFigure {

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

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
