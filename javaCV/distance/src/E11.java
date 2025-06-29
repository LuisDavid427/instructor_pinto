import java.util.Scanner;

public class E11 {
    public static int pl, pma, pmi, pj, pv, ps, ptot, average;

    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa produccion de el dia lunes: ");
    pl = scanner.nextInt();
    System.out.print("Ingresa produccion de el dia martes: ");
    pma = scanner.nextInt();
    System.out.print("Ingresa produccion de el dia miercoles: ");
    pmi = scanner.nextInt();
    System.out.print("Ingresa produccion de el dia jueves: ");
    pj = scanner.nextInt();
    System.out.print("Ingresa produccion de el dia viernes: ");
    pv = scanner.nextInt();
    System.out.print("Ingresa produccion de el dia sabado: ");
    ps = scanner.nextInt();
    ptot=pl+pma+pmi+pj+pv+ps;
    average=ptot/6;
    if (average>=100) {
        System.out.println("recebira insentivos");
    }
    else{
        System.out.println("no recibira insentivos");   
    }
    }
}
