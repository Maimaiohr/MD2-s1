import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        String fullName;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("fullname:");
        fullName = sc.nextLine();
        System.out.println("age:");
        age = sc.nextInt();

        System.out.println("Fullname is:"+fullName);
        System.out.println("Was born in:"+(2024-age));
    }
}
