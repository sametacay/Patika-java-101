import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,faktoriyel=1;
        System.out.print("Hangi sayının faktoriyelini hesaplamak istersiniz : ");
        sayi = scan.nextInt();
        for(int i =1; i<=sayi; i++)
        {
            faktoriyel*=i;
        }
        System.out.println("Girdiğiniz sayının faktorliyeli : "+faktoriyel);
    }
}