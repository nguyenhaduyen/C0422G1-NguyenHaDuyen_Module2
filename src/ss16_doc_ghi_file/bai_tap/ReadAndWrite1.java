package ss16_doc_ghi_file.bai_tap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite1 {
    public static List<String> readFile (String filePath) {
        List<String> countries = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader =new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine())!=null) {
                countries.add(str);
            }

            bufferedReader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }

    public static void main(String[] args) {
        List <Country> countries = new ArrayList<>();
        List<String> list =readFile("src/ss16_doc_ghi_file/bai_tap/country.csv");
        for (String s: list) {
            String[] arr = s.split(",");
            countries.add(new Country(Integer.parseInt(arr[0]),arr[1],arr[2]));
        }
        for (Country s: countries) {
            System.out.println(s);
        }
    }
}
