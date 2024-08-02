import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        System.out.print("nhap chieu dai a:");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float s = a*a;
        float c = a*4;

        System.out.println("chu vi:"+c);
        System.out.println("dien tich:"+s);

    }
}
