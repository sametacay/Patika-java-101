import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int km,yas,tip;
    double kmUcret=0.10,toplamUcret,indirimUcreti = 0;
    System.out.print("Kaç km yol katedeceksiniz? :");
    km = scan.nextInt();
    System.out.print("Kaç yaşındasınız ? : ");
    yas=scan.nextInt();
    System.out.print("Yolculuk tipinizi seçiniz.\n1-)Gidiş\n2-)Gidiş-Dönüş\nSeçiminiz : ");
    tip=scan.nextInt();
    toplamUcret = km*kmUcret;
    if((km>0 && yas>0) && (tip==1 | tip==2))
    {
        if(tip==1)
        {
        if (yas<12)
        {
            indirimUcreti = toplamUcret*0.50;
        }
        if (yas>=12 && yas<=24)
        {
            indirimUcreti= toplamUcret*0.10;
        }
        if (yas>65)
        {
            indirimUcreti = toplamUcret*0.30;
        }
        }
        else
        {
            toplamUcret = (toplamUcret*2)*0.80;
            if (yas<12)
            {
                indirimUcreti = toplamUcret*0.50;
            }
            if (yas>=12 && yas<=24)
            {
                indirimUcreti= toplamUcret*0.10;
            }
            if (yas>65)
            {
                indirimUcreti = toplamUcret*0.30;
            }
        }
        toplamUcret=(toplamUcret)-(indirimUcreti);
        System.out.println("Bilet tutarınız : "+toplamUcret);
    }
    else
        {
            System.out.println("Hatalı değer girdiniz. Lütfen tekrar değer giriniz.");
        }
    }
}