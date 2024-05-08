import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sayi1,sayi2,ebob=1,secim,sayi1copy,sayi2copy,ekok=1;
    System.out.print("1. sayiyi giriniz : ");
    sayi1=scan.nextInt();
    System.out.print("2. Sayiyi giriniz : ");
    sayi2=scan.nextInt();
    secim= (sayi1<sayi2) ? sayi1 : sayi2;  //kucuk sayiyi sectim
    for(int i=1; i<=secim; i++)
    {
        if (sayi1%i==0 && sayi2%i==0)
        {
            ebob=i;
        }
    }
        System.out.println("Ebob("+sayi1+","+sayi2+")"+"= "+ebob);
    for(int i =1; i<=sayi1*sayi2; i++)
    {
        if(i%sayi1==0 && i%sayi2==0)
        {
            ekok=i;
            System.out.println("Ekok("+sayi1+","+sayi2+")"+"= "+ekok);
            break;
        }
    }
    }
}