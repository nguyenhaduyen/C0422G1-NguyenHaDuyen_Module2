package ss16_doc_ghi_file.thuc_hanh;

import java.io.*;

public class SumValue {
    public static void main(String[] args) {
        readFile(FILE);

    }

    public static final String FILE = "src/ss16_doc_ghi_file/thuc_hanh/file numbers.txt";

    public static void readFile(String file1) {
        try {
            File file = new File(file1);
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tong = " + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


