import java.util.Scanner;
public class Main {
    static int fib(int n)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21 34
        int a;
        Scanner scan = new Scanner(System.in);
                System.out.print("Fibonacci serisinin kaçıncı rakamını öğrenmek istersiniz ? : ");
                a=scan.nextInt();
        System.out.println("Fibonnaci serisinin "+a+". değeri = "+fib(a));
    }
}