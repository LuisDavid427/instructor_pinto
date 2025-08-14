import java.util.Scanner;
public class parImpar {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Ingresa un numero entero: ");
        n = scanner.nextInt();
        if (n==0){
            System.out.println("El numero es cero");
        }
        else if(n % 2 == 0) {
            System.out.println("El numero es par");
        } 
        else {
            System.out.println("El numero es impar");
        }
    }
}
