package ss4_huong_doi_tuong.thuc_hanh;

public class Rectangle {
     double width,height;
     public Rectangle() {

     }
     public Rectangle (double width,double height) {
         this.width = width;
         this.height = height;
     }
     public double getArea() {
         return this.height*this.width;
     }
     public double getPerimeter () {
         return (this.height + this.width)*2;
     }
     public String display () {
         return "Rectangle co width la: " + this.width + "co height la" + this.height;
     }
}
