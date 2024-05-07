import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    /*
    Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
        Scanner scan = new Scanner(System.in);
        double pi=3.14,alan;
        int r,a;
        System.out.print("r değerini giriniz : ");
        r = scan.nextInt();
        System.out.print("Daire merkez açısı giriniz : ");
        a = scan.nextInt();
        alan=((pi*r*r)*a)/360;
        System.out.println("Yarıçapı "+r+" Merkez açısı "+a+" olan dairenin alanı "+alan+" olur.");
    }
}