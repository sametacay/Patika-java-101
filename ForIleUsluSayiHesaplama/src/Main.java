import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,sonuc=1;
        System.out.print("Hangi sayının üssünü almak istersinixz ? : ");
        a=scan.nextInt();
        System.out.print("Girdiğiniz sayının üssü kaç olsun ? : ");
        b=scan.nextInt();
        if(a>=b) {
            for (int i = 1; i <= b; i++) {
                sonuc *= a;
            }
        }
        else
        {
            System.out.println("Üs değeri taban değerinden büyük olamaz! Tekrar değer giriniz.");
        }
        System.out.println(a+" üzeri "+b+" işleminin sonucu = "+sonuc);
    }
}