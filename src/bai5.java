import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        final float PI = 3.14f;
        System.out.print("r=");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float c = 2*PI*r;
        float s = PI*r*r;
        System.out.println("chu vi la:"+c);
        System.out.println("dien tich la:"+s);

    }
}
