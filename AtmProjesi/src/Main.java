import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username, password;
        int hak = 3,secim,bakiye=1500,para;
        while(hak>0) {
            System.out.print("Kullanıcı adınız : ");
            username = scan.nextLine();
            System.out.print("Şifreniz : ");
            password= scan.nextLine();
            if(username.equals("patika")&& password.equals("dev123")) {
                System.out.println("Sisteme başarıyla giriş yaptınız,\nKodluyoruz bankasına hoşgeldiniz.");

                do {
                    System.out.println("1-)Para Yatırma\n2-)Para Çekme\n3-)Bakiye Sorgulama\n4-)Çıkış Yap.");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = scan.nextInt();
                    if(secim==1)
                    {
                        System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                        para=scan.nextInt();
                        bakiye+=para;
                        System.out.println(+para+" TL hesabınız başarıyla yatırılmıştır yeni hesap bakiyeniz "+bakiye+"'dir.");
                    }
                    if(secim==2)
                    {
                        System.out.println("Hesap bakiyeniz : "+bakiye);
                        System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                        para=scan.nextInt();
                        if(para>bakiye)
                        {
                            System.out.println("Çekmek istediğiniz tutar hesabınızda ki bakiye miktarından fazla olamaz!");
                        }
                        else
                        {
                            bakiye-=para;
                            System.out.println(para+" TL Size teslim edilmiştir yeni hesap bakiyeniz "+bakiye+" Tl'dir iyi günler dileriz.");
                        }
                    }
                    if(secim==3)
                    {
                        System.out.println("Hesap bakiyeniz : "+bakiye);
                    }
                    if(secim>4)
                    {
                        System.out.println("Yanlış seçim yaptınız lütfen tekrar seçim yapınız.");
                    }
                } while (secim != 4);
                System.out.println("Sistemden çıkış yapılıyor. Sizi tekrar aramızda görmekten mutluluk duyar iyi günler dileriz.");
                break;
            }
            else
            {
                --hak;
                if(hak==0)
                {
                    System.out.println("Hesabınız bloke olmuştur 3 giriş hakkınızı da doldurdunuz.");
                }
                else
                {
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar Deneyiniz.");
                    System.out.println("Kalan hakkınız : "+ hak);
                }
            }
        }
}
    }
