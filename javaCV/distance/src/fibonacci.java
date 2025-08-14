import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println(a);
        System.out.println(b);
        while(c<1000000){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
