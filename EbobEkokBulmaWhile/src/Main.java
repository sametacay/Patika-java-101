import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sayi1,sayi2,secim,ebob=1,ekok=1;
    System.out.print("1. sayiyi giriniz : ");
    sayi1=scan.nextInt();
    System.out.print("2. sayiyi giriniz : ");
    sayi2=scan.nextInt();
    secim= (sayi1<sayi2) ? sayi1 : sayi2;
    int i=secim;
    while(i>=1)
    {
        if(sayi1%i==0 && sayi2%i==0)
        {
            ebob=i;
            break;
        }
        else
        {
            --i;
        }
    }
    System.out.println("Girdiğiniz sayıların ebobu : "+ebob);
    i=1;
    while(i<=sayi1*sayi2)
        {
            if(i%sayi1==0 && i%sayi2==0)
            {
                ekok=i;
                break;
            }
            else
            {
                ++i;
            }
        }
    System.out.println("Girdiğiniz sayıların ekoku : "+ekok);
    }
}