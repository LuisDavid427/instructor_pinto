import java.util.Scanner;

public class E26 {
    public static int a = 0, b = 1, c = a + b;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

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
