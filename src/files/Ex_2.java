package files;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_2 {
    public boolean writeUserInputToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How would You like to name this file?");
        String name = scanner.nextLine();
        File file = new File("C:\\tmp\\"+name+".txt");
        try {
            boolean created = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Which text do you want to save?");
        String text = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        StringBuffer stringBuffer = new StringBuffer();
        int counter = 0;
        while (tokenizer.hasMoreTokens()) {
            stringBuffer.append(tokenizer.nextToken()).append(" ");
            counter++;
            if (counter % 4 == 0) {
                stringBuffer.append("\n");
            }
        }
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringBuffer.toString());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }
    public void readFromFile(String fileName){
        File file = new File("C:\\tmp\\"+fileName+".txt");
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(file);
            bufferedReader = new BufferedReader(reader);
            StringBuffer text = new StringBuffer();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
            System.out.println(text.toString());
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
    }
}
