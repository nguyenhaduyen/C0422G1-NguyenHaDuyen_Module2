package ss5_static.thu_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String collegue = "ABC";
    Student (int r,String n){
        rollno =r;
        name=n;
    }
    static void change() {
        collegue = "EFD";
    }
    void display() {
        System.out.println(rollno + "\t" + name+ "\t" + collegue);
    }
    }

