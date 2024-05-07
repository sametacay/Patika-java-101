import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,i=1,sonuc=1;
        System.out.print("Hangi sayının üssünü almak istersiniz? : ");
        a=scan.nextInt();
        System.out.print("Girdiğiniz sayının üssü kaç olsun : ");
        b=scan.nextInt();
        while(i<=b)
        {
            sonuc*=a;
            i++;
        }
        System.out.println(a+" üzeri "+b+" işleminin sonucu = "+sonuc);
    }
}