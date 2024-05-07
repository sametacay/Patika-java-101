import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sayi,sayikopya,basDegeri,basNumarasi=0,usSonucu,sonuc=0;
    System.out.print("Lütfen bir sayı giriniz : ");
    sayi=scan.nextInt();
    sayikopya = sayi;
    while(sayikopya!=0)
    {
        sayikopya/=10;
        basNumarasi++;
    }
    sayikopya=sayi;
    while(sayikopya!=0)
    {
        basDegeri = sayikopya%10;
        usSonucu=1;
        for(int i =1; i<=basNumarasi; i++)
        {
            usSonucu*=basDegeri;
        }
        sonuc+=usSonucu;
        sayikopya/=10;
    }
    if(sayi==sonuc)
    {
        System.out.println(sayi+" sayısı bir armstrong sayıdır.");
    }
    else
    {
        System.out.println(sayi+" sayısı bir armstrong sayı değildir.");
    }
    }
}