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
    }
}