import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int derece;
    System.out.print("Bugün ki hava sıcaklığı kaç derecedir : ");
    derece = scan.nextInt();
    if (derece < 5)
    {
        System.out.println(derece+" derecelik hava da kayak yapmanı öneriyoruz.");
    }
    else if(derece>=5 && derece<=15)
    {
        System.out.println(derece+" derecelik hava da sinemaya gitmeni öneriyoruz.");
    }
    else if(derece>=15 && derece<=25)
    {
        System.out.println(derece+" derecelik hava da pikniğe gitmeni öneriyoruz.");
    }
    else
    {
        System.out.println(derece+" derecelik hava da yüzmeye gitmeni öneriyoruz.");
    }
    }
}