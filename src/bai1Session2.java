import java.util.Scanner;

public class bai1Session2 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập vào 1 số tự nhiên: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println( n + " chia hết cho 3 và 5");
        } else {
            System.out.println(n + " không chia hết cho 3 va 5");
        }
    }
}
