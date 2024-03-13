package Ex;


public class Hexagon implements Ex_3.GeometricFigure {
    private int a;


    @Override
    public int calculateArea() {
        return (int)(3 * Math.pow(a, 2) * Math.sqrt(3) / 2);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}


