public class MenuMatriz {

    public static void main(String[] args) {
        int opcion;
        boolean matrizLlena = false;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Llenar matriz");
            System.out.println("2. Mostrar matriz original");
            System.out.println("3. Mostrar matriz ordenada ascendente");
            System.out.println("4. Mostrar matriz ordenada descendente");
            System.out.println("5. Sumar dos elementos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = OperacionesMatriz.scan.nextInt();

            switch (opcion) {
                case 1 -> {
                    OperacionesMatriz.llenarMatriz();
                    matrizLlena = true;
                }
                case 2 -> {
                    if (matrizLlena) OperacionesMatriz.mostrarOriginal();
                    else System.out.println("Debe llenar la matriz primero.");
                }
                case 3 -> {
                    if (matrizLlena) OperacionesMatriz.ordenarAscendente();
                    else System.out.println("Debe llenar la matriz primero.");
                }
                case 4 -> {
                    if (matrizLlena) OperacionesMatriz.ordenarDescendente();
                    else System.out.println("Debe llenar la matriz primero.");
                }
                case 5 -> {
                    if (matrizLlena) OperacionesMatriz.optionSuma();
                    else System.out.println("Debe llenar la matriz primero.");
                }
                case 6 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        OperacionesMatriz.scan.close();
    }
}
