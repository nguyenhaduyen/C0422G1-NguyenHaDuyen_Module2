package crud;

import java.util.Scanner;

public class StudentManagement {
   static Scanner scanner = new Scanner(System.in);
   static Student[] students;


   static { //khoi static bien khoi thanh toan cuc, dung dau cung dc, ưu tien chay trước
        System.out.println("Moi nhap so luong sv");
        int size = Integer.parseInt(scanner.nextLine());
        students = new Student[size];
        Student student1 = new Student("An",15,"ABC","hgah");
        Student student2 = new Student("Binh",18,"ABC","hgah");
        Student student3 = new Student("Hoa",20,"ABC","hgah");
        students [0] = student1;
        students [1] = student2;
        students [2] = student3;
    }
    public static void main(String[] args) {
       boolean flag = true;
       do {
           System.out.println("Menu");
           System.out.println("1. Display");
           System.out.println("2. Add");
           System.out.println("3. Delete");
           System.out.println("4. Edit");
           System.out.println("0. Exit");
           Scanner scanner = new Scanner(System.in);
           System.out.println("Moi nhap so");
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice) {
               case 1:
                   display();
                   break;
               case 2:
                   add();
                   display();
                   break;
               case 3:
                   delete();
                   display();
                   break;
               case 4:
                   edit();
                   display();
                   break;
               default: flag = false;
           }
       }
       while (flag);
    }
    public static void add() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null && students.length > 3) {
                System.out.println("Moi nhap ten");
                String name = scanner.nextLine();
                System.out.println("Nhap tuoi");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap dia chi");
                String address = scanner.nextLine();
                System.out.println("Nhap email");
                String email = scanner.nextLine();
                Student student = new Student(name,age,address,email);
                students[i] = student;
            }
        }
    }
    public static void display() {
        for (Student s: students) {
            if (s!=null) {
                System.out.println(s.toString());
            }
            else {
                break;
            }

        }
    }
    public static void delete() {
        System.out.println("Moi nhap vi tri can xoa");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<students.length;i++) {
            if (index ==i) {
                students[i]= null;
                for (int j=i;j<students.length-1;j++){
                   students[j] = students[j+1] ;
                }
            }
        }
    }
    public static void edit() {
        System.out.println("Moi nhap vi tri can sua");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<students.length;i++) {
            if (i == index) {
                System.out.println("Moi nhap ten");
                String name = scanner.nextLine();
                System.out.println("Nhap tuoi");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap dia chi");
                String address = scanner.nextLine();
                System.out.println("Nhap email");
                String email = scanner.nextLine();
                Student student = new Student(name,age,address,email);
                students[i] = student;
            }
        }
    }


}
