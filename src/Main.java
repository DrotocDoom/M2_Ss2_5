import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số từ 100-999: ");
        int number = sc.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        String hundredText = "";
        String tenText = "";
        String unitText = "";

        // Hàng trăm
        switch (hundreds) {
            case 1: hundredText = "Một trăm"; break;
            case 2: hundredText = "Hai trăm"; break;
            case 3: hundredText = "Ba trăm"; break;
            case 4: hundredText = "Bốn trăm"; break;
            case 5: hundredText = "Năm trăm"; break;
            case 6: hundredText = "Sáu trăm"; break;
            case 7: hundredText = "Bảy trăm"; break;
            case 8: hundredText = "Tám trăm"; break;
            case 9: hundredText = "Chín trăm"; break;
        }

        // Hàng chục
        switch (tens) {
            case 0: tenText = "lẻ"; break;
            case 1: tenText = "mười"; break;
            case 2: tenText = "hai mươi"; break;
            case 3: tenText = "ba mươi"; break;
            case 4: tenText = "bốn mươi"; break;
            case 5: tenText = "năm mươi"; break;
            case 6: tenText = "sáu mươi"; break;
            case 7: tenText = "bảy mươi"; break;
            case 8: tenText = "tám mươi"; break;
            case 9: tenText = "chín mươi"; break;
        }

        // Hàng đơn vị
        switch (units) {
            case 1: unitText = "một"; break;
            case 2: unitText = "hai"; break;
            case 3: unitText = "ba"; break;
            case 4: unitText = "bốn"; break;
            case 5: unitText = "năm"; break;
            case 6: unitText = "sáu"; break;
            case 7: unitText = "bảy"; break;
            case 8: unitText = "tám"; break;
            case 9: unitText = "chín"; break;
        }

        System.out.println(hundredText + " " + tenText + " " + unitText);
    }
}