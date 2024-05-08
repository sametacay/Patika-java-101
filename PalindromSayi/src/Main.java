import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number)
    {
        int copynumber,lastNumber,tersSayi=0;
        copynumber=number;
        while(copynumber!=0)
        {
            lastNumber=copynumber%10;
            tersSayi=(tersSayi*10)+lastNumber;
            copynumber/=10;
        }
        if(number==tersSayi)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
    System.out.print("Hangi sayının palindrom olup olmadığına bakmak istersiniz ? : ");
    x=scan.nextInt();
    System.out.println(isPalindrom(x));
    }
}