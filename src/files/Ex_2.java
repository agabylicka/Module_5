package files;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_2 {
    public boolean writeUserInputToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How would You like to name this file?");
        String name = scanner.nextLine();
        File file = new File("src\\files\\"+name+".txt");
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
        try (FileWriter writer = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.flush();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return true;
    }
    public void readFromFile(String fileName){
        File file = new File("src\\files\\"+fileName+".txt");
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
