package ss17_doc_ghi_file.bai_tap1.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private int code;
    private String name;
    private String madeIn;
    private Double price;
    private String OthersDescription;

    public Product(int code, String name, String madeIn, Double price, String othersDescription) {
        this.code = code;
        this.name = name;
        this.madeIn = madeIn;
        this.price = price;
        OthersDescription = othersDescription;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOthersDescription() {
        return OthersDescription;
    }

    public void setOthersDescription(String othersDescription) {
        OthersDescription = othersDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return code == product.code && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", price=" + price +
                ", OthersDescription='" + OthersDescription + '\'' +
                '}';
    }
}
