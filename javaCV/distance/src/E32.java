import java.util.Scanner;

public class E32 {
    public static int sumNotas = 0, nota, promedio, Cnotas, counter;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa cuantas notas desea calcular: ");
        Cnotas = scanner.nextInt();

        for(counter=0;counter<Cnotas;counter++){
            System.out.print("Ingresa nota: ");
            nota = scanner.nextInt();
            sumNotas+=nota;
        }

        promedio=sumNotas/Cnotas;
        System.out.print("promedio: "+promedio);
    }
}

