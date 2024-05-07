import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    double a,b,c,u,alan;
    System.out.print("1. Kenarı girinixz : ");
    a = scan.nextInt();
    System.out.print("2. Kenarı girinixz : ");
    b = scan.nextInt();
    System.out.print("3. Kenarı girinixz : ");
    c = scan.nextInt();
    // ucgenin cevresi = 2u u=(a+b+c)/2  Alan*Alan=u*(u-a)*(u-b)*(u-c)
        u = (a+b+c)/2;
    alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
    System.out.println("Girdiğiniz kenarlara ait üçgenin alanı : "+alan);
    }
}