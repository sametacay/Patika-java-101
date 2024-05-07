import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sayi;
    System.out.print("Hangi sayıya kadar 2'nin katlarını yazdırmak istersiniz? : ");
    sayi = scan.nextInt();
    for(int i=0; i<=sayi; i+=2)
    {
        System.out.println(i);
    }
    }
}