import java.util.Scanner;

public class principal {

    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        datos d=new datos();
        int opcion;
        do{
        System.out.println("Elige un ejercicio:");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.println("12. Ejercicio 12");
        System.out.println("13. Ejercicio 13");
        System.out.println("14. Ejercicio 14");
        System.out.println("15. Ejercicio 15");
        System.out.println("16. Ejercicio 16");
        System.out.println("17. Ejercicio 17");
        System.out.println("18. Ejercicio 18");
        System.out.println("19. Ejercicio 19");
        System.out.println("20. Ejercicio 20");
        System.out.println("21. Ejercicio 21");
        System.out.println("22. Ejercicio 22");
        System.out.println("23. Ejercicio 23");
        System.out.println("24. Ejercicio 24");
        System.out.println("25. Ejercicio 25");
        System.out.println("26. Ejercicio 26");
        System.out.println("27. Ejercicio 27");
        System.out.println("28. Ejercicio 28");
        System.out.println("29. Ejercicio 29");
        System.out.println("30. Ejercicio 30");
        System.out.println("31. Ejercicio 31");
        System.out.println("32. Ejercicio 32\n33 salir \nque ejercicio desea ejecutar");
        opcion = scanner.nextInt();

        switch(opcion) {
            case 1:
                d.me1();
                break;
            case 2:
                d.me2();
                break;
            case 3:
                d.me3();
                break;
            case 4:
                d.me4();
                break;
            case 5:
                d.me5();
                break;
            case 6:
                d.me6();
                break;
            case 7:
                d.me7();
                break;
            case 8:
                d.me8();
                break;
            case 9:
                d.me9();
                break;
            case 10:
                d.me10();
                break;
            case 11:
                d.me11();
                break;    
            case 12:
                d.me12();
                break;
            case 13:
                d.me13();
                break;
            case 14:
                d.me14();
                break;
            case 15:
                d.me15();
            case 16:
                d.me16();
                break;
            case 17:
                d.me17();
                break;
            case 18:
                d.me18();
                break;
            case 19:
                d.me19();
                break;
            case 20:
                d.me20();
                break;
            case 21:
                d.me21();
                break;
            case 22:
                d.me22();
                break;
            case 23:
                d.me23();
                break;
            case 24:
                d.me24();
                break;
            case 25:
                d.me25();
                break;
            case 26:
                d.me26();
                break;
            case 27:
                d.me28();
                break;
            case 28:
                d.me28();
                break;
            case 29:
                d.me29();
                break;
            case 30:
                d.me30();
                break;
            case 31:
                d.me31();
                break;
            case 32:
                d.me32();
                break;
        }
        }while(opcion<33);
    }
}
