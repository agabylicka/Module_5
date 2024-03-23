import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex_5 {
    public boolean areTextFilesEqual(String filePath1, String filePath2) {
        File file = new File(filePath1);
        if (file.exists() == false) {
            System.err.println("File doesn't exist.");
            return false;
        }
        File file_2 = new File(filePath2);
        if (file_2.exists() == false) {
            System.err.println("File 2 doesn't exist.");
            return false;
        }

        String content = "";
        try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            StringBuffer text = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
            content = text.toString();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }

        String content2 = null;
        try (FileReader reader2 = new FileReader(file); BufferedReader bufferedReader2 = new BufferedReader(reader2)) {
            StringBuffer text = new StringBuffer();
            String line;
            while ((line = bufferedReader2.readLine()) != null) {
                text.append(line);
            }
            content2 = text.toString();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
        return content.equals(content2);
    }
}
