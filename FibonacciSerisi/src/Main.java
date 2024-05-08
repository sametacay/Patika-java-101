import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        Scanner scan = new Scanner(System.in);
        int s1,s2,n,toplam;
        System.out.print("Kaç elemanlı fibonacci serisi istiyorsunuz ? : ");
        n=scan.nextInt();
        s1=0;
        s2=1;
        for(int i=1; i<=n; i++)
        {
            System.out.print(s1+" ");
            toplam = s1+s2;
            s1=s2;
            s2=toplam;
        }
    }
}