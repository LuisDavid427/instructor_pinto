import java.util.Scanner;

public class caracterNumerico {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        double r;
        char op;
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
