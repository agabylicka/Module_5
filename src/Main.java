import Ex_3_4.Hexagon;
import Ex_3_4.Rectangle;
import Ex_3_4.Square;
import Ex_3_4.Triangle;
import Ex_5_6_7.FileComparator;
import Ex_5_6_7.FileInverter;
import files.ChooseFileName;
import files.PrintDirectory;

public class Main {
    public static void main(String[] args) {
        ChooseFileName ex2 = new ChooseFileName();
        ex2.writeUserInputToFile();

        PrintDirectory printDirectory = new PrintDirectory();
        printDirectory.printDirectory("src\\files");

        FileComparator ex5 = new FileComparator();
        boolean comparison = ex5.areTextFilesEqual("src\\resources\\file1.txt", "src\\resources\\file2.txt");
        if (comparison) {
            System.out.println("Files are equal.");
        } else {
            System.out.println("Files are not equal.");
        }

        FileInverter ex6 = new FileInverter();
        ex6.invertFile("src\\Ex_6_7\\file3.txt");

        Rectangle rectangle = new Rectangle(3,2);
        int rectangleField = rectangle.calculateArea();

        Triangle triangle = new Triangle(3,4);
        int triangleField = triangle.calculateArea();

        Hexagon hexagon = new Hexagon();
        try {
            hexagon.setA(5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        int hexagonField = hexagon.calculateArea();

        Square square = new Square(5);
        System.out.println(square.calculateArea());
        square.calculateArea();

        Square square1 = new Square(3);
        System.out.println(square.calculateDiameter(3));
        square.calculateDiameter(3);
    }
}