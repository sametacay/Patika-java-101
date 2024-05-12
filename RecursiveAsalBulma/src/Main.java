import java.util.Scanner;
public class Main {
    static int RecAsal(int sayi,int sinir)
    {
        if(sayi<2)
            return 0;
        if(sinir==1)
            return 1;
        if(sayi%sinir==0)
            return 0;
        else
            return RecAsal(sayi,sinir-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Asallığı kontrol ettirilecek sayıyı giriniz : ");
        int sayi=scan.nextInt();
       int sonuc = RecAsal(sayi,sayi/2);
       if(sonuc==1)
           System.out.println(sayi+" sayisi ASALDIR!");
       else
           System.out.println(sayi+" sayisi ASAL değildir!");
    }
}