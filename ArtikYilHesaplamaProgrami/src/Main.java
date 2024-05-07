import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yil;
        System.out.print("Yıl giriniz : ");
        yil = scan.nextInt();
        if(yil>0)
        {
        if((yil%100)==0)
        {
            if(yil%400==0)
            {
                System.out.println(yil+" bir artık yıldır !");
            }
            else
            {
                System.out.println(yil+" bir artık yıl değildir !");
            }
        }
        else
        {
            if((yil%4)==0)
            {
                System.out.println(yil+" bir artık yıldır !");
            }
            else
            {
                System.out.println(yil+" bir artık yıl değildir !");
            }
        }
        }
        else
        {
            System.out.println("Hatalı değer girdiniz! Lütfen yıl değeriniz tekrar giriniz.");
        }
    }
}