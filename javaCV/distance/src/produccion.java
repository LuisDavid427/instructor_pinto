import java.util.Scanner;

public class produccion {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int pl;
    int pma;
    int pmi;
    int pj;
    int pv;
    int ps;
    int ptot;
    int average;
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
