import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sayi,toplam=0;
    System.out.print("Bir sayı giriniz : ");
    sayi=scan.nextInt();
    for(int i =1; i<sayi; i++)
    {
        if(sayi%i==0)
        {
            toplam+=i;
        }
    }
    if(toplam==sayi)
    {
        System.out.println(sayi+" Mükemmel sayıdır.");
    }
    else
    {
        System.out.println(sayi+" mükemmel sayı değildir.");
    }
    }
}