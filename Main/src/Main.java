import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kiểm tra năm nhuận");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập vào số năm muốn kiểm tra : ");
        int leapYear = scanner.nextInt();

        if ((leapYear % 4 == 0 && leapYear % 100 != 0) || (leapYear % 100 == 0 && leapYear % 400 == 0)){
            System.out.println("Năm " + leapYear + " là năm nhuận!!");
        }
        else {
            System.out.println("Năm " + leapYear + " không phải là năm nhuận!!");
        }
    }
}
