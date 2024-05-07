import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,sayikopya,basDegeri,toplam=0;
        System.out.print("Lütfen basamak değerlerinin toplanmasını istediğiniz sayıyı giriniz : ");
        sayi=scan.nextInt();
        sayikopya=sayi;
        while(sayikopya!=0)
        {
            basDegeri=sayikopya%10;
            toplam+=basDegeri;
            sayikopya/=10;
        }
        System.out.println(toplam);
    }
}