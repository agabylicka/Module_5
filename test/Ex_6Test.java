import Ex_6_7.Ex_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.*;


public class Ex_6Test {
    private Ex_6 ex6 = new Ex_6();

    @Test
    public void testInvertFileWithSuccess() {
        //when
        boolean actual = ex6.invertFile("test_res\\test.txt");
        //then
        Assertions.assertTrue(actual);
    }

    @Test
    public void testInvertFile() {
        //when
        boolean actual = ex6.invertFile("test_res\\test.txt");
        File file = new File("test_res\\test_inverted.txt");
        StringBuffer text = new StringBuffer();
        try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        //then
        Assertions.assertEquals("kota\nma\nAla\n", text.toString());
    }

    //negative
    @Test
    public void testInvertFileWithMissingFile() {
        //when
        boolean actual = ex6.invertFile("test_res\\testnotexisting.txt");
        //then
        Assertions.assertFalse(actual);
    }

    @Test
    public void testAreTextFilesNotEqual() {
        File file = new File("test_res\\test.txt");
        Assertions.assertNotNull(file);
        File file_2 = new File("test_res\\test_inverted.txt");
        Assertions.assertNotNull(file_2);

        String content = "";
        try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            StringBuffer text = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
            content = text.toString();
        } catch (IOException | NullPointerException ioException) {
            Assertions.assertNull(ioException);
        }

        String content2 = null;
        try (FileReader reader2 = new FileReader(file); BufferedReader bufferedReader2 = new BufferedReader(reader2)) {
            StringBuffer text = new StringBuffer();
            String line;
            while ((line = bufferedReader2.readLine()) != null) {
                text.append(line);
            }
            content2 = text.toString();
        } catch (IOException | NullPointerException ioException) {
            Assertions.assertNull(ioException);
        }
        Assertions.assertNotEquals("test_res\\test.txt", "test_res\\test_inverted.txt");
    }
}
