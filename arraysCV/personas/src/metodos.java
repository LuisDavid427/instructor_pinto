import java.util.Scanner;

public class metodos {

    public static Scanner scan = new Scanner(System.in);
    public static atributos v = new atributos();

    public static String[] nombres;
    public static String[] ocupacion;
    public static String[] telefono;
    public static String[] email;
    public static String[] rh;
    public static String[] direccion;

    public static void llArray() {
        System.out.println("Digita la cantidad de personas a las cuales se les van a ingresar los datos:");
        v.cant = scan.nextInt();
        scan.nextLine();

        nombres = new String[v.cant];
        ocupacion = new String[v.cant];
        telefono = new String[v.cant];
        email = new String[v.cant];
        rh = new String[v.cant];
        direccion = new String[v.cant];

        for (int i = 0; i < v.cant; i++) {
            System.out.println("Digite el nombre completo de la persona número: " + (i + 1));
            nombres[i] = scan.nextLine();
        }
        for (int i = 0; i < v.cant; i++) {
            System.out.println("Digite la ocupación de " + nombres[i]);
            ocupacion[i] = scan.nextLine();
        }
        for (int i = 0; i < v.cant; i++) {
            System.out.println("Digite el teléfono de " + nombres[i]);
            telefono[i] = scan.nextLine();
        }
        for (int i = 0; i < v.cant; i++) {
            System.out.println("Digite el email de " + nombres[i]);
            email[i] = scan.nextLine();
        }
        for (int i = 0; i < v.cant; i++) {
            System.out.println("Digite el RH de " + nombres[i]);
            rh[i] = scan.nextLine();
        }
        for (int i = 0; i < v.cant; i++) {
            System.out.println("Digite la dirección de " + nombres[i]);
            direccion[i] = scan.nextLine();
        }
    }
    public static void mostrarArray() {
        System.out.println("Nombres:    " + java.util.Arrays.toString(nombres));
        System.out.println("Ocupación:  " + java.util.Arrays.toString(ocupacion));
        System.out.println("Teléfonos:  " + java.util.Arrays.toString(telefono));
        System.out.println("Emails:     " + java.util.Arrays.toString(email));
        System.out.println("RH:         " + java.util.Arrays.toString(rh));
        System.out.println("Dirección:  " + java.util.Arrays.toString(direccion));
    }

    public static void khowPlace(){
        do{
        System.out.println("conoce el numero de la persona que desea encontrar? \n 1=si, 0=no");
        v.opcion=scan.nextInt();
        if (v.opcion==1) {
            System.out.println("ingrese el numero de la persona: ");
            v.opcion=scan.nextInt()-1;
            if(v.opcion >= 0 && v.opcion <= v.cant){
                System.out.println("nombres: "+ nombres[v.opcion]);
                System.out.println("ocupacion: "+ocupacion[v.opcion]);
                System.out.println("telefonos: "+telefono[v.opcion]);
                System.out.println("emails: "+email[v.opcion]);
                System.out.println("rh: "+rh[v.opcion]);
                System.out.println("direccion: "+direccion[v.opcion]);
            }else{
                System.out.println("la persona no existe");
                System.out.println("desea intentarlo nuevamente? 1=si, 0=no");
                v.opcion=scan.nextInt();
            }
        }

        }while(v.opcion!=0);
    }
    public static void filtroSearch(){
            System.out.println("desea encontrar encontrar a la persona con alguno de sus datos? 1=si, 0=no");
            v.opcion=scan.nextInt();
            if (v.opcion==1) {
                do{
                scan.nextLine();
                System.out.println("ingrese el dato de la persona que sera buscado (nombre, teléfono, email, etc.)");
                v.busqueda=scan.nextLine();
                for(int i = 0; i<v.cant;i++){
                    if (nombres[i].toLowerCase().contains(v.busqueda) ||
                        ocupacion[i].toLowerCase().contains(v.busqueda) ||
                        telefono[i].toLowerCase().contains(v.busqueda) ||
                        email[i].toLowerCase().contains(v.busqueda) ||
                        rh[i].toLowerCase().contains(v.busqueda) ||
                        direccion[i].toLowerCase().contains(v.busqueda)) {

                        v.encontrado=true;
                        System.out.println("Datos encontrados:");
                        System.out.println("Nombre: " + nombres[i]);
                        System.out.println("Ocupacion: " + ocupacion[i]);
                        System.out.println("Telefono: " + telefono[i]);
                        System.out.println("Email: " + email[i]);
                        System.out.println("RH: " + rh[i]);
                        System.out.println("Direccion: " + direccion[i]);
                        
                    }
                }
                
                if(!v.encontrado){
                    System.out.println("No se encontraron datos coincidentes con: " + v.busqueda);

                }
                System.out.println("desaea nuevamente buscar datos? \n 1=si, 0=no");
                v.opcion=scan.nextInt();

                }while(v.opcion!=0);

            
            }

            }
    }
