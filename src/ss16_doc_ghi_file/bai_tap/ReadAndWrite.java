package ss16_doc_ghi_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static  List<String> readFile (String sourcePath) {
        List<String> word = new ArrayList<>();
        File sourceFile = new File(sourcePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(sourceFile);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine())!=null) {
                word.add(str);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return word;
    }
    public static void write (List<String> word,String targetPath) {
        File file = new File(targetPath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write("Noi dung la" +word);
            int count =0;
            for (String s: word) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                count += s.length();
            }
            System.out.println("So ki tu la" + (count));
            bufferedWriter.close();
        }catch (FileNotFoundException e) {
            System.err.println("File da ton tai");
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/ss16_doc_ghi_file/bai_tap/file.csv";
        String targetPath = "src/ss16_doc_ghi_file/bai_tap/result.csv";
        List <String> word = readFile(sourcePath);
        write(word,targetPath);
    }
}
