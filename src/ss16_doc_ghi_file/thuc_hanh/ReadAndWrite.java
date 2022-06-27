package ss16_doc_ghi_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Integer> readFile (String filePath) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
             fileReader = new FileReader(file);
             bufferedReader = new BufferedReader(fileReader);
             String str = "";
             while ((str= bufferedReader.readLine())!=null) {
                numbers.add(Integer.parseInt(str));
            }
            bufferedReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
    public static void writeFile (String filepath,int max) {
        List <Integer> numbers = new ArrayList<>();
        File file = new File (filepath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("So lon nhat la" + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int fileMax (List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i)>max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String sourceFile = "src/ss16_doc_ghi_file/thuc_hanh/result.txt";
        String targetFile = "src/ss16_doc_ghi_file/thuc_hanh/task1.csv";
        List<Integer> number= readFile(sourceFile);
        writeFile(targetFile,fileMax(number));
    }
}
