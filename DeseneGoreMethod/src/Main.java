import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir n değeri girin: ");
        int n = scanner.nextInt();

        recursiveMethod(n);

    }
    static void recursiveMethod(int originalN) {
        recursiveHelper(originalN, originalN);
    }

    static void recursiveHelper(int originalN, int currentN) {
        // Kurala göre işlem
        System.out.print(currentN + " ");

        // Recursive çağrı
        if (currentN > 0) {
            // Sayı pozitif olduğu sürece çıkarma işlemine devam et
            recursiveHelper(originalN, currentN - 5);
        } else {
            // Sayı negatif veya 0 olduğunda ekleme işlemine geç
            recursiveAddition(originalN, currentN + 5);
        }
    }

    static void recursiveAddition(int originalN, int currentN) {
        // Kurala göre işlem
        System.out.print(currentN + " ");

        // Recursive çağrı
        if (currentN < originalN) {
            // Sayı başlangıç değerine eşit veya daha küçük olduğu sürece ekleme işlemine devam et
            recursiveAddition(originalN, currentN + 5);
        }
    }
}