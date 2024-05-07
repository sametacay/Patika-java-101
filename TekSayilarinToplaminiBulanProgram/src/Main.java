import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam=0;
        do {
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi = scan.nextInt();
            if(sayi%2==1)
            {
                toplam+=sayi;
            }
        } while (sayi > 0);
        System.out.println("Girdiğiniz sayılardan tek olanların toplamı : "+toplam);
    }
}