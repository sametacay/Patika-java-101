import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hak=3, secim, bakiye = 1500, para;
        String username, password;
        while (hak > 0) {
            System.out.print("Kullanıcı adınız : ");
            username = scan.nextLine();
            System.out.print("Şifreniz : ");
            password = scan.nextLine();
            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Giriş başarılı.");
                System.out.println("Kodluyoruz bankasına hoşgeldiniz.");
                do {
                    System.out.println("1-)Para Yatırma\n2-)Para Çekme\n3-)Bakiye Sorgulama\n4-)Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = scan.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            para = scan.nextInt();
                            bakiye += para;
                            System.out.println(para + " Tl Başarıyla hesabınız yatırılmıştır yeni hesap bakiyeniz " + bakiye + " TL 'dir.");
                            break;
                        case 2:
                            System.out.println("Hesap bakiyeniz : " + bakiye);
                            System.out.println("Lütfen çekmek istediğiniz tutarı giriniz : ");
                            para = scan.nextInt();
                            if (para > bakiye) {
                                System.out.println("Çekmek istediğiniz tutar hesap bakiyesinden yüksek olamaz.");
                            } else {
                                bakiye -= para;
                                System.out.println(para + " TL size teslim edilmiştir yeni hesap bakiyeniz " + bakiye + " Tl'dir.");
                            }
                            break;
                        case 3:
                            System.out.println("Hesap bakiyeniz : " + bakiye);
                            break;
                        case 4:
                            System.out.println("Sistemden çıkış yapılıyor sizi tekrar aramızda görmekten mutluluk duyar, iyi günler dileriz.");
                            break;
                        default:
                            System.out.println("Yanlış seçim yaptınız lütfen tekrar seçim yapınız.");
                    }
                } while (secim != 4);
                break;
            } else {
                --hak;
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur 3 giriş hakkınızı da doldurdunuz.");
                } else {
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar Deneyiniz.");
                    System.out.println("Kalan hakkınız : " + hak);
                }
            }
        }
    }
}
