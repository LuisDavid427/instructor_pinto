import java.util.Scanner;

public class salario {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int TH;
        int TL;
        int p;
        System.out.print("Ingresa tarifa por hora: ");
        TH = scanner.nextInt();
        System.out.print("Ingresa tiempo laburado en horas: ");
        TL = scanner.nextInt();
        p=TH*TL;
        System.out.println("total pagar: "+p);
}
}
