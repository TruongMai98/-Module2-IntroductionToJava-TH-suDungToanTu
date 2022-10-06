import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // khai bao doi tuong scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // nhap chieu rong

        System.out.println("Enter height: ");
        height = scanner.nextFloat(); // nhap chieu dai

        float area = width * height;

        System.out.println("area is: " + area);

    }
}