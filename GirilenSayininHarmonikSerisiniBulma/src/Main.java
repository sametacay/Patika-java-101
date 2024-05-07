import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int sayi;
    double toplam=0;
    System.out.print("Harmonik Serisini Bulmak İstediğiniz Sayiyi Giriniz : ");
    sayi=scan.nextInt();
    for(int i=1; i<=sayi; i++)
    {
        toplam += (1.0 / i);
    }
        System.out.println(toplam);
    }
}