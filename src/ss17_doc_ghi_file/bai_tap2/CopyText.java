package ss17_doc_ghi_file.bai_tap2;

import ss17_doc_ghi_file.bai_tap1.model.Product;
import ss17_doc_ghi_file.bai_tap1.util.ReadAndWrite;

import java.util.List;

public class CopyText {
    public static void CopyText (String sourceFile, String targetFile) {
      List<Product> productList = ReadAndWrite.read(sourceFile);
      ReadAndWrite.write(targetFile,productList);
    }

    public static void main(String[] args) {
         CopyText("src/ss17_doc_ghi_file/bai_tap1/util/product.txt","src/ss17_doc_ghi_file/bai_tap2/file.dat");
    }
}
