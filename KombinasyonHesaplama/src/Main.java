import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,r,nfaktoriyel=1,rfaktoriyel=1,neksirfaktoreliyel=1,c;
        /* Klavyeden girdiğiniz sayıların kombinasyonunu hesaplayınız n ve r değerlerini kullanıcıdan alınız.
        n'in r'li kombinasyonu C(n,r) =  [ n! / (r! * (n-r)!) ]
        */
        System.out.print("n sayısını giriniz : ");
        n=scan.nextInt();
        System.out.print("r sayısını giriniz : ");
        r=scan.nextInt();
        if(n>=r) {
            for (int i = 1; i <= n; i++) {
                nfaktoriyel *= i;
            }
            for (int j = 1; j <= r; j++) {
                rfaktoriyel *= j;
            }
            for (int k = 1; k <= (n - r); k++) {
                neksirfaktoreliyel *= k;
            }
        }
        else
        {
            System.out.println("r değeri n değerinden büyük olamaz. Lütfen tekrar değer giriniz.");
        }
        c=((nfaktoriyel)/(rfaktoriyel*neksirfaktoreliyel));
        System.out.println("Kombinasyon C("+n+","+r+") = "+c);
    }
}