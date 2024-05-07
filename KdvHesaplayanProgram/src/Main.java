import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int kdvsizFiyat;
    double kdvUcreti,kdvliFiyat,alinanKdvMiktari;
    System.out.print("Kdv'siz fiyatını giriniz : ");;
    kdvsizFiyat=scan.nextInt();
    kdvUcreti=(kdvsizFiyat>=0 && kdvsizFiyat<=1000) ? 0.18 : 0.08;
    kdvliFiyat = (kdvsizFiyat*kdvUcreti)+kdvsizFiyat;
    alinanKdvMiktari = (kdvsizFiyat*kdvUcreti);
    System.out.println("KDV'siz Fiyat : "+kdvsizFiyat);
    System.out.println("KDV'li Fiyat : "+kdvliFiyat);
    System.out.println("KDV tutarı : "+alinanKdvMiktari);
    }
}