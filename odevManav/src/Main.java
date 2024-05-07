import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int ka, ke, kd, km, kp;
        double fa = 2.14, fe = 3.67, fd = 1.11, fm = 0.95, fp = 5, topFiyat;
        System.out.print("Armut kaç kilo ? :");
        ka = inp.nextInt();
        System.out.print("Elma kaç kilo ? :");
        ke = inp.nextInt();
        System.out.print("Domates kaç kilo ? :");
        kd = inp.nextInt();
        System.out.print("Muz kaç kilo ? :");
        km = inp.nextInt();
        System.out.print("Patlıcan kaç kilo ? :");
        kp = inp.nextInt();
        topFiyat = (ka * fa) + (ke * fe) + (kd * fd) + (km * fm) + (kp * fp);
        System.out.println("Toplam Tutar : " + topFiyat + " TL");
    }
}
