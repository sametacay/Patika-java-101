import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,ilkSayi,enBuyuk,enKucuk,sayi;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n=scan.nextInt();
        System.out.print("1. sayıyı giriniz : ");
        ilkSayi=scan.nextInt();
        enBuyuk=ilkSayi;
        enKucuk=ilkSayi;
        for(int i=2; i<=n; i++)
        {
            System.out.print(i+". Sayıyı Giriniz : ");
            sayi=scan.nextInt();
            if(sayi>enBuyuk)
            {
                enBuyuk=sayi;
            }
            if(sayi<enKucuk)
            {
                enKucuk=sayi;
            }
        }
        System.out.println("En büyük sayı : "+enBuyuk);
        System.out.println("En küçük sayı : "+enKucuk);
    }
}