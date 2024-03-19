package Ex_6_7;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex_6 {
    public boolean invertFile(String filepath) {
        boolean rtn = false;
        File file = new File(filepath);
        File file2 = new File(filepath.replace(".txt", "_inverted.txt"));
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        List<String> text = new ArrayList<String>();
        try {
            reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
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
            //in case of failure of read file - stop with failure
            if (rtn == false) {
                return false;
            }
        }
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            rtn = false;
            writer = new FileWriter(file2);
            bufferedWriter = new BufferedWriter(writer);
            for (int i = text.size() - 1; i >= 0; i--) {
                String line = text.get(i);
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
            rtn = true;
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return rtn;
    }
}
