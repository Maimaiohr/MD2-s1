import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.print("nhap diem mon toan:");
        Scanner sc = new Scanner(System.in);
        float toan = sc.nextFloat();
        System.out.print("nhap diem mon van:");
        float van = sc.nextFloat();
        System.out.print("nhap diem mon anh:");
        float anh = sc.nextFloat();

        System.out.println("Diem trung binh:"+((toan+van+anh)/3));
    }
}
