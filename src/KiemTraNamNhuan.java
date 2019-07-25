import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam: ");
        int year = scanner.nextInt();
        boolean check = false;
        if ((year % 4 == 0) && (year % 100 != 0)) {
            check = true;
        }
        if ((year % 100 == 0) && (year % 400 == 0)) {
            check = true;
        }
        if (check) {
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year +" khong la nam nhuan");
        }
    }
}
