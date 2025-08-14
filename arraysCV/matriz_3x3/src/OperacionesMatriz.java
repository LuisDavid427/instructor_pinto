import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OperacionesMatriz {

    public static Scanner scan = new Scanner(System.in);
    public static int [][] matriz = new int [3][3];
    public static Integer [] flatArray = new Integer[9];
    public static Integer[] copiaAsc = new Integer[9];
    public static Integer[] copiaDesc = new Integer[9];


    public static void llenarMatriz(){
        System.out.println("--- Ingrese los 9 números para la matriz (1-45) ---");
        for (int i = 0; i < 9; i++){
            int numero;
            while(true){
                System.out.print("numero " + (i + 1) +": ");
                numero = scan.nextInt();
                if(numero >= 1 && numero <= 45) break;
                System.out.println("numero invalido, intentelo de nuevo");
            }
            matriz[i / 3][i % 3] = numero;
            flatArray[i] = numero;
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz)
            System.out.println(Arrays.toString(fila));
    }

    public static void imprimirMatrizDesdeArray(Integer[] array){
        for(int i = 0; i < 3; i++){
            System.out.print("[");
            for(int j = 0; j < 3; j++){
                System.out.print(array[i * 3 + j]+(j < 2 ? "," : ""));
            }
            System.out.println("]");
        }
    }

    public static void mostrarOriginal(){
        System.out.println("--- Matriz Original ---");
        imprimirMatriz(matriz);
    }

    public static void ordenarAscendente(){
        copiaAsc = Arrays.copyOf(flatArray, 9);
        Arrays.sort(copiaAsc);
        System.out.println("\n--- Matriz Ordenada Ascendente ---");
        imprimirMatrizDesdeArray(copiaAsc);
    }

    public static void ordenarDescendente(){
        copiaDesc = Arrays.copyOf(flatArray, 9);
        Arrays.sort(copiaDesc, Collections.reverseOrder());
        System.out.println("\n--- Matriz Ordenada Descendente ---");
        imprimirMatrizDesdeArray(copiaDesc);
    }

    public static int pedirIndice(String mensaje) {
        int valor;
        while(true){
            System.out.print(mensaje);
            valor = scan.nextInt()-1;
            if(valor >= 0 && valor <=2) return valor;
            System.out.println("Valor inválido.");
        }
    }
    
    public static int pedirValor(String mensaje){
        int valor;
        while(true){
            System.out.print(mensaje);
            valor = scan.nextInt()-1;
            if(valor >= 0 && valor <= 8) return valor;
            System.out.println("Valor inválido.");
        }
    }
    
    public static void sumaMatriz(){
        mostrarOriginal();
        System.out.println("\n--- Suma de dos elementos de la matriz original ---");
        System.out.println("Primera posición:");
        int fila1 = pedirIndice("Fila 1 : ");
        int col1 = pedirIndice("Columna 1 : ");

        System.out.println("Segunda posición:");
        int fila2 = pedirIndice("Fila 2 : ");
        int col2 = pedirIndice("Columna 2 : ");

        int valor1 = matriz[fila1][col1];
        int valor2 = matriz[fila2][col2];

        System.out.println("Resultado: " + valor1 + " + " + valor2 + " = " + (valor1 + valor2));
    }

    public static void sumaAsc(){
        ordenarAscendente();

        System.out.println("\n--- Suma de dos elementos de la matriz ascendente ---");

        System.out.println("Primer valor:");
        int campo1 = pedirValor("digite el campo (de 1 a 9): ");
        System.out.println("segundo valor:");
        int campo2 = pedirValor("digite el campo (de 1 a 9): ");

        int valor1 = copiaAsc[campo1];
        int valor2 = copiaAsc[campo2];

        System.out.println("Resultado: " + valor1 + " + " + valor2 + " = " + (valor1 + valor2));
    }

    public static void sumaDesc(){
        ordenarDescendente();

        System.out.println("\n--- Suma de dos elementos de la matriz descentente ---");

        System.out.println("Primer valor:");
        int campo1 = pedirValor("digite el campo (de 1 a 9): ");
        System.out.println("segundo valor:");
        int campo2 = pedirValor("digite el campo (de 1 a 9): ");

        int valor1 = copiaDesc[campo1];
        int valor2 = copiaDesc[campo2];

        System.out.println("Resultado: " + valor1 + " + " + valor2 + " = " + (valor1 + valor2));
    }

    public static void optionSuma(){
        System.out.println("\n--- que matriz desea elegir para la suma? ---");
        System.out.println("matriz original = 1");
        System.out.println("matriz ascendente = 2");
        System.out.println("matriz descendente = 3");
        int option = scan.nextInt();
        switch(option){
            case 1 -> sumaMatriz();
            case 2 -> sumaAsc();
            case 3 -> sumaDesc();
        }
    }
}
