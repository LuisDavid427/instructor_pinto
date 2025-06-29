import java.util.Scanner;
public class threeNumbers {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int n1;
    int n2;
    int n3;
    
    System.out.print("Ingresa number One: ");
    n1 = scanner.nextInt();
    System.out.print("Ingresa number Two: ");
    n2 = scanner.nextInt();
    System.out.print("Ingresa number Three: ");
    n3 = scanner.nextInt();
    if (n1>n2 && n1>n3) {
        System.out.println("El mayor es: " + n1);
    }
    else if (n2>n1 && n2>n3) {
        System.out.println("El mayor es: " + n2);
    }
    else if (n3>n1 && n3>n2) {
        System.out.println("El mayor es: " + n3);
    }
    else if(n1==n2 && n1>n3) {
        System.out.println("number One y number Two son iguales y son mayores el 3");
    }
    else if(n1==n3 && n1>n2){
        System.out.println("number One y number Three son iguales y son mayores que 2 ");
    }
    else if(n2==n3 && n2>n1){
        System.out.println("number Two y number Three son iguales y son mayores que 1: ");
    }
    else{
        System.out.println("Los tres numeros son iguales: " + n1);
    }
    scanner.close();
    }
}
