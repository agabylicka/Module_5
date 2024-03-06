package files;

import java.io.File;

public class PrintDirectory {
    public void printDirectory(String directoryPath) {
        //String text;
        File file = new File(directoryPath);
        File[] text = file.listFiles();
        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i]);
        }
    }
}