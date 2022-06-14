package crud;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String address;
    String email;
    public static int numberOfStudent;
    public Student() {

}
    public Student(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        numberOfStudent ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getNumberOfStudent() {
        return numberOfStudent;
    }

    public static void setNumberOfStudent(int numberOfStudent) {
        Student.numberOfStudent = numberOfStudent;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

