import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
            final float tiGia = 160;
            System.out.print("nhap jpy:");
            Scanner sc = new Scanner(System.in);
            float jpy = sc.nextFloat();
            float vnd = jpy * tiGia;


        System.out.println(vnd);
    }
}
