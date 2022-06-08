package ss2_vong_lap.bai_tap;


public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("In 20 so nguyen to dau tien");
        int num=2;
        int uoc = 0;
        int count = 0;
        while (count != 20) {
            for ( int i=2;i<num;i++) {
                if (num%i==0) {
                    uoc ++;
                    break;
                }
            }

            if (uoc ==0) {
                System.out.println(num);
                count ++;
            }
            uoc = 0;
            num++;
        }
    }
}

