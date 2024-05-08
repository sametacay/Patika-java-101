public class Main {
    public static void main(String[] args) {
    // ödev| Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
        for(int i=2; i<=100; i++)
        {
        boolean asal=true;
        for(int j=2; j<i; j++)
        {
            if(i%j==0)
            {
                asal=false;
                break;
            }
        }
            if(asal)
            {
                System.out.print(i+" ");
            }
        }
    }
}