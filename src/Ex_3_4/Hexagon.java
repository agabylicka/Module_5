package Ex_3_4;


public class Hexagon implements GeometricFigure {
    private Integer a;


    @Override
    public int calculateArea() {
        return (int)(3 * Math.pow(a, 2) * Math.sqrt(3) / 2);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) throws Exception {
        if (a <= 0) {
            throw new Exception("Size has to be positive.");
        }
        this.a = a;
    }
}


