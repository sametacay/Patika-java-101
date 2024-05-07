import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double a,b;
    int secim;
    Scanner scan= new Scanner(System.in);
    System.out.print("1. Sayiyi giriniz : ");
    a = scan.nextInt();
        System.out.print("2. Sayiyi giriniz : ");
        b = scan.nextInt();
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz\n1-)Toplama\n2-)Çıkarma\n3-)Çarpma\n4-)Bölme");
        secim = scan.nextInt();
        switch(secim) {
            case 1:
                System.out.println("Toplam sonucu : "+(a+b));
                break;
            case 2:
                System.out.println("Çıkarma Sonucu : "+(a-b));
                break;
            case 3:
                System.out.println("Çarpma Sonucu : "+(a*b));
                break;
            case 4:
                if(b!=0)
                {
                    System.out.println("Bölme Sonucu : "+(a/b));
                }
                else
                {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
            {
                System.out.println("Yanlış seçim yaptınız. Lütfen tekrar deneyiniz.");
            }
        }



    }
}