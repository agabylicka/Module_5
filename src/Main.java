import Ex.*;
import files.Ex_2;
import files.PrintDirectory;

public class Main {
    public static void main(String[] args) {
        Ex_2 ex2 = new Ex_2();
        ex2.writeUserInputToFile();

        PrintDirectory printDirectory = new PrintDirectory();
        printDirectory.printDirectory("C:\\tmp");

        Ex_5 ex5 = new Ex_5();
        boolean comparison = ex5.areTextFilesEqual("src\\resources\\file1.txt", "src\\resources\\file2.txt");
        if (comparison) {
            System.out.println("Files are equal.");
        } else {
            System.out.println("Files are not equal.");
        }

        Ex_6 ex6 = new Ex_6();
        ex6.invertFile("src\\Ex\\file3.txt");

        Rectangle rectangle = new Rectangle(3,2);
        int rectangleField = rectangle.calculateArea();

        Triangle triangle = new Triangle();
        triangle.setA(3);
        triangle.setB(4);
        int triangleField = triangle.calculateArea();

        Hexagon hexagon = new Hexagon();
        hexagon.setA(5);
        int hexagonField = hexagon.calculateArea();

        Square square = new Square(5);
        System.out.println(square.calculateArea());
        square.calculateArea();

        Square square1 = new Square(3);
        System.out.println(square.calculateDiameter(3));
        square.calculateDiameter(3);
    }
}