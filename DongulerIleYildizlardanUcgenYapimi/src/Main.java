import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int sayi;
     System.out.print("Kaç satırlık yıldız işlemi istiyorsunuz ? : ");
     sayi=scan.nextInt();
     for(int i=1; i<=sayi; i++)
     {
         for(int k=1; k<=(sayi-i); k++)
         {
             System.out.print(" ");
         }
         for(int j=1; j<=(2*i)-1; j++)
         {
             System.out.print("*");
         }
        System.out.println();
     }
    }
}