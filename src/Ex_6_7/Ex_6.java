package Ex_6_7;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex_6 {
    public boolean invertFile(String filepath) {
        boolean rtn = false;
        File file = new File(filepath);
        File file2 = new File(filepath.replace(".txt", "_inverted.txt"));
        List<String> text = new ArrayList<String>();
        try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                text.add(line);
            }
            System.out.println(text.toString());
            rtn = true;
        } catch (FileNotFoundException fnfException) {
            fnfException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        //in case of failure of read file - stop with failure
        if (rtn == false) {
            return false;
        }

        try (FileWriter writer = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.flush();
            rtn = false;
            for (int i = text.size() - 1; i >= 0; i--) {
                String line = text.get(i);
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
            rtn = true;
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return rtn;
    }
}
