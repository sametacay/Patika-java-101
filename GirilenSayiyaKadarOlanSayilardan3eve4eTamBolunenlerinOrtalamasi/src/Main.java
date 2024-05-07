import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam=0,sayac=0;
        double ort;
        System.out.print("Hangi sayıya kadar 3'e ve 4'e tam bölünen sayıların ortalamasını hesaplatmak istersiniz ? : ");
        sayi=scan.nextInt();
        for(int i=1; i<=sayi; i++)
        {
            if(i%3==0 && i%4==0)
            {
                sayac++;
                toplam+=i;
            }
        }
        ort = toplam/sayac;
        System.out.println("0'dan "+sayi+"'ya kadar olan tam sayılardan 3'e ve 4'e tam bölünen sayıların ortalaması "+ort);
    }
}