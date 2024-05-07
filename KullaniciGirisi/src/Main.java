import java.net.StandardSocketOptions;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username, password, newPassword;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        username = scan.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = scan.nextLine();
        if (username.equals("patika") && password.equals("java")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
            int secim;
            System.out.println("Şifrenizi unuttuysanız sıfırlamak ister misiniz?\n1-)Evet\n2-)Hayır");
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Yeni şifrenizi giriniz:");
                    newPassword = scan.next();
                    if (password.equals("java")) {
                        System.out.println("Yeni şifre eski şifre ile aynı olamaz.");
                    } else {
                        System.out.println("Şifreniz değiştirilmiştir.");
                    }
                    break;
                case 2:
                    System.out.println("Lütfen tekrar giriş yapınız.");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız.");
            }
        }
    }
}