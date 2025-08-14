import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n, n1, n0, fdd, gdd, fn, gn, diferencia, hdd;
        int a, b, c, d, e, f, g;
        double ad, bd;
        char[] ac, bc;

        System.out.print("Ingresa el número del ejercicio: ");
        a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.println("estas funciones( f(n) y g(n)) crecen de forma parecida porque pertenecen a Θ(h(n))");
                System.out.println("para todas las n>=n0");
                System.out.println("ingresa n0");
                n0 = scanner.nextDouble();
                System.out.println("ingresa n de la función f(n)");
                n = scanner.nextDouble();
                System.out.println("ingresa n de la función g(n)");
                n1 = scanner.nextDouble();
                while(n0 > n || n0 > n1){ 
                    System.out.println("n0 es mayor que n, esto no puede ser posible");
                    System.out.println("ingresa n0");
                    n0 = scanner.nextDouble();
                    System.out.println("ingresa n de la función f(n)");
                    n = scanner.nextDouble();
                    System.out.println("ingresa n de la función g(n)");
                    n1 = scanner.nextDouble();
                }
                System.out.println("ingresa el valor de f en f(n)");
                fdd = scanner.nextDouble();
                System.out.println("ingresa el valor de g en g(n)");
                gdd = scanner.nextDouble();
                fn=fdd*n;
                gn=gdd*n1;
                System.out.println("f(n) es:" + fn);
                System.out.println("g(n) es:" + gn);
                while(fn<gn){
                    System.out.println("f(n) es menor que g(n), esto no puede ser posible");
                    System.out.println("ingresa n0");
                    n0 = scanner.nextDouble();
                    System.out.println("ingresa n de la función f(n)");
                    n = scanner.nextDouble();
                    System.out.println("ingresa n de la función g(n)");
                    n1 = scanner.nextDouble();
                        while(n0 > n && n0 > n1){ 
                            System.out.println("n0 es mayor que n, esto no puede ser posible");
                            System.out.println("ingresa n0");
                            n0 = scanner.nextDouble();
                            System.out.println("ingresa n de la función f(n)");
                            n = scanner.nextDouble();
                            System.out.println("ingresa n de la función g(n)");
                            n1 = scanner.nextDouble();
                        }
                    System.out.println("ingresa el valor de f en f(n)");
                    fdd = scanner.nextDouble();
                    System.out.println("ingresa el valor de g en g(n)");
                    gdd = scanner.nextDouble();
                    fn=fdd*n;
                    gn=gdd*n1;
                    System.out.println("f(n) es:" + fn);
                    System.out.println("g(n) es:" + gn);
                }
                diferencia = fn - gn;
                System.out.println("la diferencia entre f(n) y g(n) es decir f(n) - g(n) es: " + diferencia);
                System.out.println("podemos decir que la diferencia entre estos dos a medida que n crece nunca va a ser negativa, ni mayor que f(n) pero si puede ser 0 o igual o mayor que g(n)");

                break;

            case 2:
                System.out.print("Ingrese el valor de a (mayor que 1): ");
                ad = scanner.nextDouble();
                System.out.print("Ingrese el valor de b (mayor que 1): ");
                bd = scanner.nextDouble();
                System.out.print("Ingrese el valor de n (mayor que 0): ");
                n = scanner.nextDouble();
        
                double loga_n = Math.log(n) / Math.log(ad);
                double logb_n = Math.log(n) / Math.log(bd);

        
                double expA = Math.pow(2, loga_n);
                double expB = Math.pow(2, logb_n);

        
                System.out.println("\nlog_a(n) = " + loga_n);
                System.out.println("log_b(n) = " + logb_n);
                System.out.println("2^log_a(n) = " + expA);
                System.out.println("2^log_b(n) = " + expB);

        
                double razon = loga_n / logb_n;
                    if (razon > 0.9 && razon < 1.1) {
                        System.out.println("\nlog_a(n) pertenece a teta(log_b(n))");
                    } else {
                        System.out.println("\nlog_a(n) no pertenece a teta(log_b(n))");
                    }
                double razonPotencias = expA / expB;
                if (razonPotencias > 0.9 && razonPotencias < 1.1) {
                    System.out.println("2^log_a(n) pertenece a teta(2^log_b(n))");
                } else {
                    System.out.println("2^log_a(n) no pertenece a teta(2^log_b(n))");
                }
                break;

            case 3:
                System.out.print("Ingrese un valor grande para n (ej: 1000 o más): ");
                n = scanner.nextDouble();

                fdd = n;

                hdd = Math.pow(n, 2);

                double logF = Math.log10(fdd);
                double logH = Math.log10(hdd);

                System.out.println("f(n) = " + fdd);
                System.out.println("h(n) = " + hdd);

                System.out.println("log10(f(n)) = " + logF);
                System.out.println("log10(h(n)) = " + logH);



                if (fdd <= hdd) {
                    System.out.println("f(n) pertenece a teta(h(n))");
                
                    if (logF <= logH + 1) {
                        System.out.println("log(f(n)) pertenece a teta(log(h(n))) → (a) es VERDADERA");
                    } else {
                        System.out.println("log(f(n)) no pertenece a teta(log(h(n))) → (a) sería FALSA");
                    }
                }

                if (logF <= logH + 1) {
                    System.out.println("log(f(n)) pertenece a teta(log(h(n)))");

                    if (fdd <= hdd + 1) {
                        System.out.println("f(n) pertenece a teta(h(n)) → (b) sería VERDADERA");
                    } else {
                        System.out.println("f(n) no pertenece a teta(h(n)) → (b) es FALSA");
                    }
                }
                break;
case 4:
    System.out.print("Ingresa el valor de x: ");
    a = scanner.nextInt();
    c = 0;

    for (b = 1; b <= a; b++) {
        for (d = 1; d <= b; d++) {
            System.out.println(b + ", " + d + ", " + a);
            c++;
        }
    }

    if (a > 0) {
        for (b = 1; b <= 4; b++) {
            System.out.println("Llamada recursiva con x = " + (a / 2));
        }
    }

    System.out.println("Total de líneas generadas: " + c);
    break;

case 5:
    System.out.print("Ingresa un número positivo: ");
    a = scanner.nextInt();
    b = 1;
    c = 1;

    while (c < a) {
        b++;
        c += b;
    }

    if (c == a) {
        System.out.println(a + " es un número triangular.");
    } else {
        System.out.println(a + " no es un número triangular.");
    }
    break;

case 6:
    System.out.print("Ingresa la complejidad del programa (1, 2 o 3): ");
    a = scanner.nextInt();

    System.out.print("Ingresa el tamaño máximo de entrada con 1 hora de CPU: ");
    b = scanner.nextInt();

    System.out.print("Ingresa el número de horas asignadas: ");
    c = scanner.nextInt();

    switch (a) {
        case 1:
            d = c * b;
            System.out.println("El mayor tamaño de entrada con " + c + " horas es: " + d);
            break;
        case 2:
            ad = Math.sqrt(c * Math.pow(b, 2));
            System.out.println("El mayor tamaño de entrada con " + c + " horas es: " + (int) ad);
            break;
        case 3:
            d = c * b * 10;
            System.out.println("El mayor tamaño de entrada con " + c + " horas es: " + d);
            break;
        default:
            System.out.println("Complejidad no válida.");
            break;
    }
    case 7:
    System.out.print("Ingresa la complejidad del programa (1, 2 o 3): ");
    a = scanner.nextInt();

    System.out.print("Ingresa el tamaño máximo de entrada con 1 hora de CPU: ");
    b = scanner.nextInt();

    System.out.print("Ingresa el factor de mejora (100 veces más rápido): ");
    c = scanner.nextInt();

    switch (a) {
        case 1:
            d = c * b;
            System.out.println("El mayor tamaño de entrada con la mejora es: " + d);
            break;
        case 2:
            ad = Math.sqrt(c * Math.pow(b, 2));
            System.out.println("El mayor tamaño de entrada con la mejora es: " + (int) ad);
            break;
        case 3:
            d = c * b * 10;
            System.out.println("El mayor tamaño de entrada con la mejora es: " + d);
            break;
        default:
            System.out.println("Complejidad no válida.");
            break;
    }
    break;

case 8:
    System.out.print("Ingresa el tamaño del vector: ");
    a = scanner.nextInt();
    
    int[] vector8 = new int[a];

    System.out.println("Ingresa los valores del vector:");
    for (b = 0; b < a; b++) {
        vector8[b] = scanner.nextInt();
    }

    c = vector8[0];
    d = vector8[0];

    for (b = 1; b < a; b += 2) {
        if (b == a - 1) {
            if (vector8[b] > d) {
                d = vector8[b];
            }
            if (vector8[b] < c) {
                c = vector8[b];
            }
        } else {
            if (vector8[b] > vector8[b + 1]) {
                if (vector8[b] > d) {
                    d = vector8[b];
                }
                if (vector8[b + 1] < c) {
                    c = vector8[b + 1];
                }
            } else {
                if (vector8[b + 1] > d) {
                    d = vector8[b + 1];
                }
                if (vector8[b] < c) {
                    c = vector8[b];
                }
            }
        }
    }

    System.out.println("El valor máximo es: " + d);
    System.out.println("El valor mínimo es: " + c);
    break;

case 9:
    System.out.print("Ingresa el valor de n: ");
    a = scanner.nextInt();

    b = 1;
    while (a > 1) {
        b = 2 * b + (int) Math.log(a);
        a /= 4;
    }

    System.out.println("El orden de la función T(n) es aproximadamente: " + b);
    break;
case 10:
    System.out.print("Ingresa un número positivo n: ");
    a = scanner.nextInt();

    if (a == 1) {
        System.out.println("Total(n) = 1");
    } else {
        b = 1;
        c = 1;

        while (c < a) {
            b *= 2;
            c += b;
        }

        System.out.println("El orden temporal de la función es aproximadamente: " + b);
    }
    break;

case 11:
    System.out.print("Ingresa el tamaño del primer string (n): ");
    a = scanner.nextInt();
    System.out.print("Ingresa el tamaño del segundo string (m): ");
    b = scanner.nextInt();

    ac = new char[a];  
    bc = new char[b];

    System.out.println("Ingresa el primer string caracter por caracter:");
    for (c = 0; c < a; c++) {
        ac[c] = scanner.next().charAt(0); 
    }

    System.out.println("Ingresa el segundo string caracter por caracter:");
    for (c = 0; c < b; c++) {
        bc[c] = scanner.next().charAt(0); 
    }

    d = a - b + 1;
    e = 0;

    while (e < d) {
        f = e;
        g = 0;
        while (g < b && f < a && ac[f] == bc[g]) {
            f++;
            g++;
        }

        if (g == b) {
            System.out.println("Se encontró el string en la posición: " + e);
            break;
        } else {
            e++;
        }
    }

    System.out.println("Comparaciones realizadas en el peor caso: " + e * b);
    break;
case 12:
    System.out.print("Ingresa el tamaño del vector a ordenar: ");
    a = scanner.nextInt();

    int[] vector12 = new int[a];

    System.out.println("Ingresa los valores del vector:");
    for (b = 0; b < a; b++) {
        vector12[b] = scanner.nextInt();
    }

    
    for (c = 0; c < a - 1; c++) {
        for (d = 0; d < a - c - 1; d++) {
            if (vector12[d] > vector12[d + 1]) {
                e = vector12[d];
                vector12[d] = vector12[d + 1];
                vector12[d + 1] = e;
            }
        }
    }

    System.out.println("El vector ordenado es:");
    for (b = 0; b < a; b++) {
        System.out.print(vector12[b] + " ");
    }
    break;
case 13:
    System.out.print("Ingresa una cadena para verificar si es palíndromo: ");
    String cadena = scanner.next();
    ac = cadena.toCharArray();  
    b = ac.length;  

    c = 0;
    d = b - 1;
    e = 1;

    while (c < d) {
        if (ac[c] != ac[d]) {
            e = 0;
            break;
        }
        c++;
        d--;
    }

    if (e == 1) {
        System.out.println("La cadena es un palíndromo.");
    } else {
        System.out.println("La cadena no es un palíndromo.");
    }
    break;

case 14:
    System.out.print("Ingresa el tamaño del problema n: ");
    a = scanner.nextInt();

    ad = a * Math.log(a) + a * Math.log(a);
    
    if (ad < Math.pow(a, 2)) {
        System.out.println("La estrategia Divide y Vencerás es más eficiente.");
    } else {
        System.out.println("El algoritmo trivial sigue siendo más eficiente.");
    }
    break;

case 15:
    System.out.print("Ingresa el tamaño del vector de enteros: ");
    a = scanner.nextInt();

    int[] vector15 = new int[a];

    System.out.println("Ingresa los valores del vector:");
    for (b = 0; b < a; b++) {
        vector15[b] = scanner.nextInt();
    }

    c = vector15[0];
    d = vector15[0];

    for (b = 1; b < a; b++) {
        if (vector15[b] > d) {
            d = vector15[b];
        }
        if (vector15[b] < c) {
            c = vector15[b];
        }
    }

    System.out.println("El número de comparaciones realizadas en el peor caso es: " + (2 * a - 2));
    break;
    
            default:
                System.out.println("Número de ejercicio no válido.");
                break;
        }
    }
}