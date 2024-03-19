import Ex_6_7.Ex_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Ex_6Test {
    @Test
    public void testInvertFileWithSuccess() {
        //given
        Ex_6 ex6 = new Ex_6();
        //when
        boolean actual = ex6.invertFile("test_res\\test.txt");
        //then
        Assertions.assertTrue(actual);
    }

    @Test
    public void testInvertFile() {
        //given
        Ex_6 ex6 = new Ex_6();
        //when
        boolean actual = ex6.invertFile("test_res\\test.txt");
        File file = new File("test_res\\test_inverted.txt");
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        StringBuffer text = new StringBuffer();
        try {
            reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //then
        Assertions.assertEquals("kota\nma\nAla\n", text.toString());
    }

    //negative
    @Test
    public void testInvertFileWithMissingFile() {
        //given
        Ex_6 ex6 = new Ex_6();
        //when
        boolean actual = ex6.invertFile("test_res\\testnotexisting.txt");
        //then
        Assertions.assertFalse(actual);
    }


}
