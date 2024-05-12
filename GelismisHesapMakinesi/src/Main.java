import java.util.Scanner;
public class Main {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number,result=0,i=1;
        while(true)
        {
            System.out.print(i++ +". sayı :");
            number=scan.nextInt();
            result+=number;
            if(number==0)
            {
                break;
            }
        }
        System.out.println("Sonuç : "+result);
    }
    static void minus() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number,result=0;
        for(int i=1; i<=counter; i++)
        {
            System.out.print(i+". sayı :");
            number=scan.nextInt();
            if(i==1)
            {
                result+=number;
                continue;
            }
            result-=number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void multiplication()
    {
        Scanner scan = new Scanner(System.in);
        int number,result=1,i=1;
        while(true) {
            System.out.print(i++ + ". Sayı : ");
            number = scan.nextInt();
            if (number == 1)
                break;
            if(number==0)
            {
                result=0;
                break;
            }
            result*=number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void divided() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz ? : ");
        int counter = scan.nextInt();
        double number,result=0.0;
        for(int i=1; i<=counter; i++)
        {
            System.out.print(i+". Sayı : ");
            number=scan.nextInt();
            if(i!=1 && number==0)
            {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if(i==1)
            {
                result=number;
                continue;
            }
            result/=number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void power()
    {
        Scanner scan=new Scanner(System.in);
        int result=1;
        System.out.print("Taban değerini giriniz : ");
        int a=scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int b=scan.nextInt();
        for(int i=1; i<=b; i++)
        {
            result*=a;
        }
        System.out.println("Sonuç : "+result);
    }
    static void factorial()
    {
        Scanner scan=new Scanner(System.in);
        int result=1;
        System.out.print("Hangi sayının faktöriyeli alınacak ? : ");
        int a = scan.nextInt();
        for(int i=1; i<=a; i++)
        {
            result*=i;
        }
        System.out.println("Sonuç : "+result);
    }
    static void mod() {
        Scanner scan=new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        int a = scan.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        int b = scan.nextInt();
        System.out.println("Sonuç : "+ a%b);
    }
    static void DikdortgenAlanCevre()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("1. Kenarı giriniz : ");
        int a=scan.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        int b=scan.nextInt();
        System.out.println("Dikdörtgenin Alanı : "+ a*b);
        System.out.println("Dikdörtgenin Çevresi : "+ ((a+b)*2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-)Toplama İşlemi\n"+
                       "2-)Çıkarma İşlemi\n"+
                        "3-)Çarpma İşlemi\n"+
                        "4-)Bölme İşlemi\n"+
                        "5-)Üslü Sayı Hesaplama\n"+
                        "6-)Faktöriyel Hesaplama\n"+
                         "7-) Mod alma\n"+
                         "8-)Dikdörtgen Alan ve Çevre Hesabı\n"+
                         "9-)Çıkış Yap";
        do {
            System.out.println(menu);
        System.out.print("Lütfen Bir İşlem Seçiniz : ");
        select = scan.nextInt();
        switch (select)
        {
            case 1:
                plus();
                break;
            case 2:
                minus();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                divided();
                break;
            case 5:
                power();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mod();
                break;
            case 8:
                DikdortgenAlanCevre();
                break;
            case 9:
                System.out.println("Çıkış yapılmıştır.");
                break;
            default:
                System.out.println("Yanlış değer girdiniz lütfen 1 ile 9 arasında değer giriniz.");
        } } while(select!=0 && select!=9);
    }
}