import files.Ex_2;
import files.PrintDirectory;

public class Main {
    public static void main(String[] args) {
        Ex_2 ex2 = new Ex_2();
        ex2.writeUserInputToFile();

        PrintDirectory printDirectory = new PrintDirectory();
        printDirectory.printDirectory("C:\\tmp");
    }
}