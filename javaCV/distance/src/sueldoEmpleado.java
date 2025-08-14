
import java.util.Scanner;

public class sueldoEmpleado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int se;
        int ne;
        int counter;
        int sumSueldo=0;
        int averageSalary;
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
