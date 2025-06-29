import java.util.Scanner;

public class E27 {

    public static int n1, n2;
    public static double r;
    public static char op;
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa operador: ");
        op = scanner.next().charAt(0);
        System.out.print("Ingresa numero 1: ");
        n1 = scanner.nextInt();
        System.out.print("Ingresa numero 2: ");
        n2 = scanner.nextInt();
        switch (op) {
            case '+':
                r=n1+n2;
                break;
            case '-':
                r=n1-n2;
                break;
            case '*':
                r=n1*n2;
                break;
            case '^':
                r=Math.pow(n1, n2);
                break;
            default:
                r=0;
                break;
        }
        System.out.print("el resultado es: ");
        System.out.print((int)r);
    }
}
