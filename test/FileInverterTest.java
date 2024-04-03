import Ex_5_6_7.FileComparator;
import Ex_5_6_7.FileInverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.*;


public class FileInverterTest {
    private FileInverter ex6 = new FileInverter();

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
        FileComparator ex5 = new FileComparator();
        boolean areFilesEqual = ex5.areTextFilesEqual("test_res\\test.txt","test_res\\test_inverted.txt");
        Assertions.assertFalse(areFilesEqual);
    }
}
