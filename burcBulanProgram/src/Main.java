import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int gun,ay;
        Scanner scan = new Scanner(System.in);
    System.out.println("Doğduğunuz ayı giriniz : ");
    ay = scan.nextInt();
    System.out.println("Doğduğunuz günü giriniz : ");
    gun = scan.nextInt();

    if((ay==1) && (gun>=1 && gun<=31))
    {
        if(gun<22)
        {
            System.out.println("Oğlak burcu.");
        }
        else
        {
            System.out.println("Kova burcu.");
        }
    }
       else if((ay==2) && (gun>=1 && gun<=31))
        {
            if(gun<20)
            {
                System.out.println("Kova burcu.");
            }
            else
            {
                System.out.println("Balık burcu.");
            }
        }
       else if((ay==3) && (gun>=1 && gun<=31))
        {
            if(gun<21)
            {
                System.out.println("Balık burcu.");
            }
            else
            {
                System.out.println("Koç burcu.");
            }
        }
       else if((ay==4) && (gun>=1 && gun<=31))
        {
            if(gun<21)
            {
                System.out.println("Koç burcu.");
            }
            else
            {
                System.out.println("Boğa burcu.");
            }
        }
      else if((ay==5) && (gun>=1 && gun<=31))
        {
            if(gun<22)
            {
                System.out.println("Boğa burcu.");
            }
            else
            {
                System.out.println("İkizler burcu.");
            }
        }
       else if((ay==6) && (gun>=1 && gun<=31))
        {
            if(gun<23)
            {
                System.out.println("İkizler burcu.");
            }
            else
            {
                System.out.println("Yengeç burcu.");
            }
        }
       else if((ay==7) && (gun>=1 && gun<=31))
        {
            if(gun<23)
            {
                System.out.println("Yengeç burcu.");
            }
            else
            {
                System.out.println("Aslan burcu.");
            }
        }
       else if((ay==8) && (gun>=1 && gun<=31))
        {
            if(gun<23)
            {
                System.out.println("Aslan burcu.");
            }
            else
            {
                System.out.println("Başak burcu.");
            }
        }
       else if((ay==9) && (gun>=1 && gun<=31))
        {
            if(gun<23)
            {
                System.out.println("Başak burcu.");
            }
            else
            {
                System.out.println("Terazi burcu.");
            }
        }
       else if((ay==10) && (gun>=1 && gun<=31))
        {
            if(gun<23)
            {
                System.out.println("Terazi burcu.");
            }
            else
            {
                System.out.println("Akrep burcu.");
            }
        }
       else if((ay==11) && (gun>=1 && gun<=31))
        {
            if(gun<22)
            {
                System.out.println("Akrep burcu.");
            }
            else
            {
                System.out.println("Yay burcu.");
            }
        }
       else if((ay==12) && (gun>=1 && gun<=31))
        {
            if(gun<22)
            {
                System.out.println("Yay burcu.");
            }
            else
            {
                System.out.println("Oğlak burcu.");
            }
        }
       else
    {
        System.out.println("Hatalı giriş yaptınız");
    }
    }
}