import java.util.Scanner;
public class Main {
    static int Us(int taban, int us)
    {
    if(us==0)
        return 1;
    else if(taban==1)
        return 1;
    else
        return taban*Us(taban,us-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int taban=scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int us=scan.nextInt();
        System.out.println("Sonuç : "+Us(taban,us));
    }
}