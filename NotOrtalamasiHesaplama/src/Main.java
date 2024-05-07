import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int mat,fiz,kim,turkce,tarih,muzik;
    double ort;
    String x;
    System.out.print("Matematik notunuzu giriniz : ");
    mat = scan.nextInt();
    System.out.print("Fizik notunuzu giriniz : ");
    fiz = scan.nextInt();
    System.out.print("Kimya notunuzu giriniz : ");
    kim = scan.nextInt();
    System.out.print("Türkçe notunuzu giriniz : ");
    turkce = scan.nextInt();
    System.out.print("Tarih notunuzu giriniz : ");
    tarih = scan.nextInt();
    System.out.print("Müzik notunuzu giriniz : ");
    muzik = scan.nextInt();
    ort = (mat+fiz+kim+turkce+tarih+muzik)/6;
    x = (ort>60) ? "Sınıfı Geçtiniz" : "Sınıfta kaldınız";
    System.out.println("Ortalamanız "+ort+" "+x);

    }
}