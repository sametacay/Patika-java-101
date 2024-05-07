import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int mat,fiz,trk,kim,mzk;
    double ort=0;
    System.out.println("Matematik notunuzu giriniz : ");
    mat = scan.nextInt();
    System.out.println("Fizik notunuzu giriniz : ");
    fiz = scan.nextInt();
    System.out.println("Türkçe notunuzu giriniz : ");
    trk = scan.nextInt();
    System.out.println("Kimya notunuzu giriniz : ");
    kim = scan.nextInt();
    System.out.println("Müzik notunuzu giriniz : ");
    mzk = scan.nextInt();
    if(mat>=1 && mat<=100)
    {
        ort += mat;
    }
    if(fiz>=1 && fiz<=100)
    {
        ort += fiz;
    }
    if(trk>=1 && trk<=100)
    {
        ort += trk;
    }
    if(kim>=1 && kim<=100)
    {
        ort += kim;
    }
    if(mzk>=1 && mzk<=100)
    {
        ort += mzk;
    }
    ort /= 5;
    if(ort >=55)
    {
        System.out.println("Sınıfı geçtiniz. Ortalamanız : "+ort);
    }
    else
    {
        System.out.println("Ortalamanız : "+ort+" sınıfta kaldınız.");
    }
    }

}