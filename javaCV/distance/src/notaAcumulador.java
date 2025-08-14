import java.util.Scanner;

public class notaAcumulador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sumNotas=0;
        int nota;
        int promedio;
        System.out.print("Ingresa cuantas notas desea calcular: ");
        int Cnotas = scanner.nextInt();

        for(int counter=0;counter<Cnotas;counter++){
            System.out.print("Ingresa nota: ");
            nota = scanner.nextInt();
            sumNotas+=nota;
        }

        promedio=sumNotas/Cnotas;
        System.out.print("promedio: "+promedio);
        scanner.close();
    }
}

