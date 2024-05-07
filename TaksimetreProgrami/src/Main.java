import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km,taksimetreAcilisUcreti=10;
        double tutar,kmbasiUcret=2.20;
        System.out.print("Kaç km yol gideceksiniz ? : ");
        km=scan.nextInt();
        tutar = taksimetreAcilisUcreti+(km*kmbasiUcret);
        tutar = (tutar<20) ? 20 : tutar;
        System.out.println(km+" kilometrelik yol için taksimetre ücretiniz "+tutar+" TL'dir.");
    }
}