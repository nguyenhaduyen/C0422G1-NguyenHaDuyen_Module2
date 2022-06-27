package ss16_doc_ghi_file.bai_tap;

public class Country {
    private int id;
    private String standFor;
    private String name;

    public Country(int id, String standFor, String name) {
        this.id = id;
        this.standFor = standFor;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStandFor() {
        return standFor;
    }

    public void setStandFor(String standFor) {
        this.standFor = standFor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", standFor='" + standFor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
