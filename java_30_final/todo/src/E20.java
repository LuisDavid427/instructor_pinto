
import java.util.Scanner;

public class E20 {
    public static int se, ne, counter, sumSueldo = 0, averageSalary;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el numero de empleados: ");
        ne = scanner.nextInt();

        for(counter=1;counter<=ne;counter++){
            System.out.print("Ingresa el sueldo del empleado " + counter + ": ");
            se = scanner.nextInt();
            sumSueldo += se;
        }

        System.out.println("la cantidad total a pagar es de: " + sumSueldo);
        averageSalary = sumSueldo/ne;
        System.out.println("El sueldo promedio es: " + averageSalary);
    }
}
