import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam=0;
        do
        {
        System.out.print("Lütfen bir sayı giriniz : ");
        sayi=scan.nextInt();
        if(sayi%4==0)
        {
            toplam+=sayi;
        }
        }while(sayi%2==0);
        System.out.println("Girdiğiniz sayılardan 4'ün katı olan sayıların toplamı : "+toplam);
    }
}