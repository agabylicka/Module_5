package Ex;


public class Triangle implements Ex_3.GeometricFigure {
    private int a, b;
    @Override
    public int calculateArea() {
        return (int)(a * b * 0.5);
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
