package Ex;


public class Square extends Rectangle {
    public Square(int a){
        super(a,a);
    }
    public int calculateDiameter(int a) {
        return 4*a;
    }

}
