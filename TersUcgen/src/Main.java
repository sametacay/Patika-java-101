import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int n;
    System.out.print("Kaç basamaklı ters üçgen yazdırmak istersiniz ? : ");
    n=scan.nextInt();
    for(int i=n; i>=1; i--)
    {
    for(int k=1; k<=2*i-1; k++)
    {
        System.out.print("*");
    }
    System.out.println();
    }
    }
}