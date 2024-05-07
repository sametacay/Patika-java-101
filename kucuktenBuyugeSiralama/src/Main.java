import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // kullanıcının girdiği 3 değeri küçükten büyüğe sıralayınız.
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("1. Sayiyi giriniz : ");
        a = scan.nextInt();
        System.out.println("2. Sayiyi giriniz : ");
        b = scan.nextInt();
        System.out.println("3. Sayiyi giriniz : ");
        c = scan.nextInt();
        if((a<b) && (a<c))
        {
            if(b<c)
            {
                System.out.println("a<b<c'dir.");
            }
            else
            {
                System.out.println("a<c<b'dir.");
            }
        }
        else if((b<a) && (b<c))
        {
            if(a<c)
            {
                System.out.println("b<a<c'dir.");
            }
            else
            {
                System.out.println("b<c<a'dir.");
            }
        }
        else
        {
            if(a<b)
            {
                System.out.println("c<a<b'dir.");
            }
            else
            {
                System.out.println("c<b<a'dir.");
            }
        }
    }
}