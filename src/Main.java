import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sayi2=0;
        while (true) {
            System.out.print("İşlem seçin: +, -, *, /, pow, sqrt, veya çıkış için q: ");
            String islem = scanner.next();
            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Hesap makinesi kapatılıyor...");
                break;
            }
            System.out.print("Birinci sayıyı girin: ");
            double sayi1 = scanner.nextDouble();
            if(!islem.equals("sqrt")){
                System.out.print("İkinci sayıyı girin: ");
                sayi2 = scanner.nextDouble();
            }
            switch (islem) {
                case "+":
                    System.out.println("Sonuç: " + toplama(sayi1, sayi2));
                    break;
                case "-":
                    System.out.println("Sonuç: " + cikarma(sayi1, sayi2));
                    break;
                case "*":
                    System.out.println("Sonuç: " + carpma(sayi1, sayi2));
                    break;
                case "/":
                    if (sayi2 != 0) {
                        System.out.println("Sonuç: " + bolme(sayi1, sayi2));
                    } else {
                        System.out.println("Hata: Sıfıra bölme yapılamaz!");
                    }
                    break;
                case "pow":
                    System.out.println("Sonuç: " + uslu(sayi1, sayi2));
                    break;
                case "sqrt":
                    System.out.println("Sonuç: " + karekok(sayi1));
                    break;
                default:
                    System.out.println("Geçersiz işlem! Lütfen tekrar deneyin.");
            }
        }
        scanner.close();
    }

    public static double toplama(double a, double b) {
        return a + b;
    }

    public static double cikarma(double a, double b) {
        return a - b;
    }

    public static double carpma(double a, double b) {
        return a * b;
    }

    public static double bolme(double a, double b) {
        return a / b;
    }

    public static double uslu(double a, double b) {
        return Math.pow(a,b);
    }

    public static double karekok(double a) {
        return Math.sqrt(a);
    }
}
