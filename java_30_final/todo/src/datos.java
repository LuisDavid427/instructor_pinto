import java.util.Scanner;
import org.xml.sax.ext.EntityResolver2;

public class datos {
    public static Scanner scanner = new Scanner(System.in);
    public static E1 e1 =new E1();
    public static E2 e2=new E2();
    public static E3 e3=new E3();
    public static E4 e4=new E4();
    public static E5 e5=new E5();
    public static E6 e6=new E6();
    public static E7 e7=new E7();
    public static E8 e8=new E8();
    public static E9 e9=new E9();
    public static E10 e10=new E10();
    public static E11 e11=new E11();
    public static E12 e12=new E12();
    public static E13 e13=new E13();
    public static E14 e14=new E14();
    public static E15 e15=new E15();
    public static E16 e16=new E16();
    public static E17 e17=new E17();
    public static E18 e18=new E18();
    public static E19 e19=new E19();
    public static E20 e20=new E20();
    public static E21 e21=new E21();
    public static E22 e22=new E22();
    public static E23 e23=new E23();
    public static E24 e24=new E24();
    public static E25 e25=new E25();
    public static E26 e26=new E26();
    public static E27 e27=new E27();
    public static E28 e28=new E28();
    public static E29 e29=new E29();
    public static E30 e30=new E30();
    public static E31 e31=new E31();
    public static E32 e32=new E32();


    public static void me1(){
        System.out.print("Ingresa tiempo: ");
        e1.time = scanner.nextInt();
        System.out.print("Ingresa velocidad: ");
        e1.speed = scanner.nextInt();
        e1.distance=e1.time*e1.speed;
        System.out.println("distance is: "+e1.distance);
        
    }
    public static void me2(){
        System.out.print("Ingresa nota 1: ");
        e2.nota1 = scanner.nextInt();
        System.out.print("Ingresa nota 2: ");
        e2.nota2 = scanner.nextInt();
        System.out.print("Ingresa nota 3: ");
        e2.nota3 = scanner.nextInt();
        e2.promedio=e2.nota1+e2.nota2+e2.nota3/3;
        System.out.print("el promedio es: "+e2.promedio);
    }
    public static void me3(){
        System.out.print("ingresa numero de respuestas correctas: ");
        e3.rc = scanner.nextInt();
        System.out.print("ingresa numero de respuestas incorrectas: ");
        e3.ri = scanner.nextInt();
        System.out.print("ingresa numero de respuestas en blanco: ");
        e3.rb = scanner.nextInt();
        e3.prc=e3.rc*4;
        e3.pri=e3.ri*-1;
        e3.pf=e3.prc+e3.pri;
        System.out.println("el puntaje final es: "+e3.pf);
    }
    public static void me4(){
        System.out.print("Ingresa cuantos equipos son: ");
        e4.Cequipos = scanner.nextInt();
        for(e4.counter=1;e4.counter<=e4.Cequipos;e4.counter++){
            System.out.println("Ingresa datos de equipo: "+e4.counter);
            System.out.print(" Ingresa partidos ganados: ");
            e4.pG = scanner.nextInt()*e4.puntajePG;
            System.out.print("Ingresa partidos empatados: ");
            e4.pE = scanner.nextInt()*e4.puntajePE;
            System.out.print("Ingresa partidos perdidos: ");
            e4.pP = scanner.nextInt()*e4.puntajePP;
            e4.puntajeTot=e4.pG+e4.pE+e4.pP;
            System.out.println("puntaje total de equipo: "+e4.counter+" es: "+e4.puntajeTot);
        }
    }
    public static void me5(){
        System.out.print("Ingresa tarifa por hora: ");
        e5.TH = scanner.nextInt();
        System.out.print("Ingresa tiempo laburado en horas: ");
        e5.TL = scanner.nextInt();
        e5.p=e5.TH*e5.TL;
        System.out.println("total pagar: "+e5.p);
    }
    public static void me6(){
        System.out.print("Ingresa lado a: ");
        e6.a = scanner.nextDouble();
        System.out.print("Ingresa lado b: ");
        e6.b = scanner.nextDouble();
        System.out.print("Ingresa lado c: ");
        e6.c = scanner.nextDouble();
        e6.s=(e6.a+e6.b+e6.c)/2;
        e6.area=Math.sqrt(E6.s*(e6.s-e6.a)*(e6.s-e6.b)*(e6.s-e6.c));
        System.out.println("area es: "+e6.area);
    }
    public static void me7(){
        System.out.print("Ingresa GB de el disco: ");
        e7.GB = scanner.nextInt();
        e7.MB=e7.GB*1024;
        e7.CD=((e7.MB/700)+1);
        System.out.println("para hacer la copia de seguridad se necesitan "+e7.CD+" CD");

    }
    public static void me8(){
        System.out.print("Ingresa abcisa de a: ");
        e8.aa = scanner.nextInt();
        System.out.print("Ingresa abcisa de b: ");
        e8.ab = scanner.nextInt();
        System.out.print("Ingresa ordenada a: ");
        e8.oa = scanner.nextInt();
        System.out.print("Ingresa ordenada b: ");
        e8.ob = scanner.nextInt();
        e8.d=Math.sqrt(Math.pow((e8.ab-e8.aa), 2)+Math.pow((e8.ob-e8.oa), 2));
        System.out.println("distancia es: "+e8.d);
    }
    public static void me9(){
        System.out.print("Ingresa año de nacimiento: ");
        e9.an = scanner.nextInt();
        System.out.print("Ingresa año actual: ");
        e9.aa = scanner.nextInt();
        e9.e=e9.aa-e9.an;
        if (e9.e>17) {
            System.out.println("debe solicitar su CUIL");
        }
        else if (e9.e<17) {
            System.out.println("no debe solicitar su CUIL");
        }
        else {
            System.out.println("debe solicitar su CUIL");
        }
    }
    public static void me10(){
        System.out.print("Ingresa edad del hermano 1: ");
        e10.e1 = scanner.nextInt();
        System.out.print("Ingresa edad del hermano 2: ");
        e10.e2 = scanner.nextInt();
        if (e10.e1>e10.e2) {
            e10.de=e10.e1-e10.e2;
            System.out.println("El hermano 1 es mayor por " + e10.de + " años");
        }
        else if (e10.e1<e10.e2) {
            e10.de=e10.e2-e10.e1;
            System.out.println("El hermano 2 es mayor por " + e10.de + " años");
        }
        else {
            System.out.println("Ambos hermanos tienen la misma edad");
            
        }
    }
    public static void me11(){
        System.out.print("Ingresa produccion de el dia lunes: ");
        e11.pl = scanner.nextInt();
        System.out.print("Ingresa produccion de el dia martes: ");
        e11.pma = scanner.nextInt();
        System.out.print("Ingresa produccion de el dia miercoles: ");
        e11.pmi = scanner.nextInt();
        System.out.print("Ingresa produccion de el dia jueves: ");
        e11.pj = scanner.nextInt();
        System.out.print("Ingresa produccion de el dia viernes: ");
        e11.pv = scanner.nextInt();
        System.out.print("Ingresa produccion de el dia sabado: ");
        e11.ps = scanner.nextInt();
        e11.ptot=e11.pl+e11.pma+e11.pmi+e11.pj+e11.pv+e11.ps;
        e11.average=e11.ptot/6;
        if (e11.average>=100) {
            System.out.println("recebira insentivos");
        }
        else{
            System.out.println("no recibira insentivos");   
        }
    }
    public static void me12(){
        System.out.print("Ingresa number One: ");
        e12.n1 = scanner.nextInt();
        System.out.print("Ingresa number Two: ");
        e12.n2 = scanner.nextInt();
        System.out.print("Ingresa number Three: ");
        e12.n3 = scanner.nextInt();
        if (e12.n1>e12.n2 && e12.n1>e12.n3) {
            System.out.println("El mayor es: " + e12.n1);
        }
        else if (e12.n2>e12.n1 && e12.n2>e12.n3) {
            System.out.println("El mayor es: " + e12.n2);
        }
        else if (e12.n3>e12.n1 && e12.n3>e12.n2) {
            System.out.println("El mayor es: " + e12.n3);
        }
        else if(e12.n1==e12.n2 && e12.n1>e12.n3) {
            System.out.println("number One y number Two son iguales y son mayores el 3");
        }
        else if(e12.n1==e12.n3 && e12.n1>e12.n2){
            System.out.println("number One y number Three son iguales y son mayores que 2 ");
        }
        else if(e12.n2==e12.n3 && e12.n2>e12.n1){
            System.out.println("number Two y number Three son iguales y son mayores que 1: ");
        }
        else{
            System.out.println("Los tres numeros son iguales: " + e12.n1);
        }
    }
    public static void me13(){
            System.out.print("Ingresa lado 1: ");
        e13.l1 = scanner.nextDouble();
        System.out.print("Ingresa lado 2: ");
        e13.l2 = scanner.nextDouble();
        System.out.print("Ingresa lado 3: ");
        e13.l3 = scanner.nextDouble();

        if (e13.l1!=e13.l2 && e13.l1!=e13.l3 && e13.l3!=e13.l1) {
            System.out.println("es un triangulo escaleno");
        }
        else if (e13.l1==e13.l2 && e13.l1==e13.l3) {
            System.out.println("es un triangulo equilatero");
        }
        else {
            System.out.println("es un triangulo isoceles");
        }
    }
    public static void me14(){
        System.out.print("Ingresa un numero del uno al 10");
        e14.numero = scanner.nextInt();
        switch (e14.numero) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Numero no valido, ingrese un numero entre 1 y 10.");
        }
    }
    public static void me15(){
        System.out.print("Ingresa el monto de venta: ");
        e15.mv = scanner.nextInt();

        if (e15.mv >= 0 && e15.mv <= 1000) {
            e15.tb = e15.mv * 0 / 100;
            System.out.println("El total a pagar es: " + e15.tb);
        } else if (e15.mv > 1000 && e15.mv <= 5000) {
            e15.tb = e15.mv * 3 / 100;
            System.out.println("El total a pagar es: " + e15.tb);
        } else if (e15.mv > 5000 && e15.mv <= 20000) {
            e15.tb = e15.mv * 5 / 100;
            System.out.println("El total a pagar es: " + e15.tb);
        } else if (e15.mv > 20000) {
            e15.tb = e15.mv * 8 / 100;
            System.out.println("El total a pagar es: " + e15.tb);
        } else {
            System.out.println("Monto no válido");
        }
    }
    public static void me16(){
        System.out.print("Ingresa un numero del 1 al 5: ");
        e16.ne = scanner.nextInt();
        switch (e16.ne) {
            case 1:
                System.out.println("a");
                break;
            case 2:
                System.out.println("e");
                break;
            case 3:
                System.out.println("i");
                break;
            case 4:
                System.out.println("o");
                break;
            case 5:
                System.out.println("u");
                break;
            default:
                System.out.println("el dato ingresado no es valido para este programa");
                break;
        }
    }
    public static void me17(){
        System.out.print("Ingresa un numero entero de 2 cifras: ");
        e17.ne = scanner.nextInt();
        e17.d=(e17.ne/10);
        e17.u=e17.ne%10;
        System.out.println("decenas: " + e17.d);
        System.out.println("unidades: " + e17.u);
    }
    public static void me18(){
        System.out.print("Ingresa un numero entero: ");
        e18.n = scanner.nextInt();
        if (e18.n==0){
            System.out.println("El numero es cero");
        }
        else if(e18.n % 2 == 0) {
            System.out.println("El numero es par");
        } 
        else {
            System.out.println("El numero es impar");
        }
    }
    public static void me19(){
        for(e19.counter=2;e19.counter<=10;e19.counter+=2){
            System.out.print(e19.counter+" es un numero par\n");
        }
    }
    public static void me20(){
        System.out.print("Ingresa el numero de empleados: ");
        e20.ne = scanner.nextInt();

        for(e20.counter=1;e20.counter<=e20.ne;e20.counter++){
            System.out.print("Ingresa el sueldo del empleado " + e20.counter + ": ");
            e20.se = scanner.nextInt();
            e20.sumSueldo += e20.se;
        }

        System.out.println("la cantidad total a pagar es de: " + e20.sumSueldo);
        e20.averageSalary = e20.sumSueldo/e20.ne;
        System.out.println("El sueldo promedio es: " + e20.averageSalary);
    }
    public static void me21(){
        System.out.print("Ingresa un numero de personas a las cuales les desea calcular la edad: ");
        e21.cantP = scanner.nextInt();
        for(e21.counter=0;e21.counter<e21.cantP;e21.counter++){
            System.out.print("Ingresa la edad de la persona: ");
            e21.ep = scanner.nextInt();
            if(e21.ep<=18){
                e21.may +=1;
            }
            else{
                e21.men+=1;
            }
        }
        System.out.println("los mayores de edad son: "+e21.may+" y los menores son: "+e21.men);
    }
    public static void me22(){
        System.out.print("Ingresa primer numero: ");
        e22.pn = scanner.nextInt();
        System.out.print("Ingresa segundo numero: ");
        e22.sn = scanner.nextInt();
        for(e22.counter=0;e22.counter<=e22.sn;e22.counter++){
            e22.p = e22.p + e22.pn;
        }
        System.out.println("El resultado es: " + e22.p);
    }
    public static void me23(){
        for(e23.counter=2;e23.counter<=10;e23.counter++){
            e23.residuo=e23.counter%2;
            if (e23.residuo!=0) {
                System.out.println(e23.counter+" es un numero impar");
            }
            else{
                
            }
        }
    }
    public static void me24(){
        while(e24.s<1000){
            System.out.println((int)e24.s);
            e24.s=Math.pow(e24.s, 2)+1;
        }
    }
    public static void me25(){
        while(e25.semaforo=='V'){
            System.out.print("Ingresa caracter: ");
            e25.caracter = scanner.next().charAt(0);

            switch (Character.toLowerCase(e25.caracter)) {
                case 'a':
                    e25.semaforo='R';
                    break;
                case 'e':
                    e25.semaforo='R';
                    break;
                case 'i':
                    e25.semaforo='R';
                    break;
                case 'o':
                    e25.semaforo='R';
                    break;
                case 'u':
                    e25.semaforo='R';
                    break;
                default:
                    e25.semaforo='V';
            }    
        }  
    }
    public static void me26(){
        System.out.println(e26.a);
        System.out.println(e26.b);
        while(e26.c<1000000){
            System.out.println(e26.c);
            e26.a=e26.b;
            e26.b=e26.c;
            e26.c=e26.a+e26.b;
        }
    }
    public static void me27(){
        System.out.print("Ingresa operador: ");
        e27.op = scanner.next().charAt(0);
        System.out.print("Ingresa numero 1: ");
        e27.n1 = scanner.nextInt();
        System.out.print("Ingresa numero 2: ");
        e27.n2 = scanner.nextInt();
        switch (e27.op) {
            case '+':
                e27.r=e27.n1+e27.n2;
                break;
            case '-':
                e27.r=e27.n1-e27.n2;
                break;
            case '*':
                e27.r=e27.n1*e27.n2;
                break;
            case '^':
                e27.r=Math.pow(e27.n1, e27.n2);
                break;
            default:
                e27.r=0;
                break;
        }
        System.out.print("el resultado es: ");
        System.out.print((int)e27.r);
    }
    public static void me28(){
        for(e28.counter=1;e28.counter<=10;e28.counter ++){
            System.out.print("Ingresa caracter numero: "+e28.counter+": " );
            e28.l = scanner.next().charAt(0);
            switch (Character.toLowerCase(e28.l)) {
                case 'a':
                    e28.nv+=1;
                    break;
                case 'e':
                    e28.nv+=1;
                    break;
                case 'i':
                    e28.nv+=1;
                    break;
                case 'o':
                    e28.nv+=1;
                    break;
                case 'u':
                    e28.nv+=1;
                    break;
                default:
                    e28.nl+=1;
                    break;
        }
        }
        System.out.println("el numero de vocales son: "+e28.nv);
        System.out.println("el numero de consonantes son: "+e28.nl);
    }
    public static void me29(){
        for(e29.counter=1;e29.counter<=160;e29.counter++){
            System.out.print("Ingresa voto "+e29.counter+": ");
            e29.ve = scanner.nextInt();
            switch (e29.ve) {
                case 1:
                    e29.c1+=1;
                    break;
                case 2:
                    e29.c2+=1;
                    break;
                case 3:
                    e29.c3+=1;
                    break;
                default:
                    e29.co+=1;
                    break;
            }
        }
        if(e29.c1>e29.c2 && e29.c1>e29.c3 && e29.c1>e29.co){
            e29.g=e29.c1;
            System.out.println("el ganador con "+e29.g+" votos es el candidato 1");
        }
        else if(e29.c2>e29.c1 && e29.c2>e29.c3 && e29.c2>e29.co){
            e29.g=e29.c2;
            System.out.println("el ganador con "+e29.g+" votos es el candidato 2");
        }
        else if(e29.c3>e29.c1 && e29.c3>e29.c2 && e29.c3>e29.co){
            e29.g=e29.c3;
            System.out.println("el ganador con "+e29.g+" votos es el candidato 3");
        }
        else{
            System.out.println("ningun candidato fue elegido");
        }
    }
    public static void me30(){
        System.out.print("Ingresa numero 1: ");
        e30.n1 = scanner.nextInt();
        System.out.print("Ingresa numero 2: ");
        e30.n2 = scanner.nextInt();
        e30.average=(e30.n1+e30.n2)/2;
        System.out.println("el promedio es: "+e30.average);
    }
    public static void me31(){
        System.out.print("ingresa numero : ");
        e31.n = scanner.nextInt();
            switch (e31.n) {
                case 1:
                    System.out.println("enero");
                    break;
                case 2:
                    System.out.println("febrero");
                    break;
                case 3:
                    System.out.println("marzo");
                    break;
                case 4:
                    System.out.println("abril");
                    break;
                case 5:
                    System.out.println("enero");
                    break;
                case 6:
                    System.out.println("febrero");
                    break;
                case 7:
                    System.out.println("marzo");
                    break;
                case 8:
                    System.out.println("abril");
                    break;
                default:
                    throw new AssertionError();
            }   
    }
    public static void me32(){
        System.out.print("Ingresa cuantas notas desea calcular: ");
        e32.Cnotas = scanner.nextInt();

        for(e32.counter=0;e32.counter<e32.Cnotas;e32.counter++){
            System.out.print("Ingresa nota: ");
            e32.nota = scanner.nextInt();
            e32.sumNotas+=e32.nota;
        }

        e32.promedio=e32.sumNotas/e32.Cnotas;
        System.out.print("promedio: "+e32.promedio);
    }
    

}