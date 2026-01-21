package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {
        //parte 1
        String nombre = "Angel";

        System.out.println("Hola, " + nombre);
       
        //parte 2
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingresa un numero entero: ");
        int numEntero1 = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Ingresa otro numero entero: ");
        int numEntero2 = sc.nextInt(); 
        sc.nextLine();   
        int suma = numEntero1 + numEntero2;  
        System.out.println("La suma de los numeros es: " + suma); 
        
        //parte 3
        System.out.print("Ingresa un numero decimal: ");
        double numDecimal = sc.nextDouble(); 
        sc.nextLine();
        double numDouble = numDecimal;
        int numEntero = (int) numDouble;
        System.out.println("Numero original " + numDouble);
        System.out.println("Numero convertido: " + numEntero);

        //parte 4
        System.out.print("Ingresa un numero entero: ");
        int numEntero3 = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Ingresa otro numero entero: ");
        int numEntero4 = sc.nextInt();         
        sc.nextLine();
        int suma1 = numEntero3 + numEntero4;
        int resta = numEntero3 - numEntero4;
        int multiplicacion = numEntero3 * numEntero4;
        int division = numEntero3 / numEntero4; 
        int modulo = numEntero3 % numEntero4; 
        System.out.println("Suma: " + suma1);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División entera: " + division);
        System.out.println("Módulo: " + modulo);

        //parte 5
        System.out.print("Ingresa tu edad: ");
        int edadM = sc.nextInt();
        if (edadM < 18) {
        System.out.println("Eres menor de edad");
        } else {
        System.out.println("Eres mayor de edad");
        }

        //parte 6
        System.out.print("Ingresa tu edad: ");
        int edadC = sc.nextInt();

        if (edadC < 13) {
        System.out.println("Eres un niño");
        } else if (edadC < 18) {
        System.out.println("Eres un adolescente");
        } else if (edadC < 65) {
        System.out.println("Eres un adulto");
        } else {
        System.out.println("Eres un adulto mayor");
        }

        //parte 7
        System.out.print("Ingresa un número del 1 al 7: ");
        int opcion = sc.nextInt();
        sc.nextLine(); 
        switch (opcion) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opción no válida");    
        }

        //parte 8
        System.out.print("Ingresa tu nombre: ");
        String name = sc.nextLine();
        String nombre1 = "Angel";
        if (name.equalsIgnoreCase(nombre1)) {
        System.out.println("Hola " + name + ", bienvenido");
        }
        else {
        System.out.println("Hola " + name + ", tu nombre no coincide");
        }

        //parte 9
        System.out.print("Ingresa tu calificacion sin decimales: ");
        int cal = sc.nextInt();

        if (cal >= 90 && cal <= 100 ) {
        System.out.println("Exelente");
        } else if (cal < 90) {
        System.out.println("Muy bien");
        } else if (cal < 80) {
        System.out.println("Aprovado");
        } else if (cal < 70) {
        System.out.println("Reprobado");
        } else {
        System.out.println("Calificacion invalida");
        }
        
        //parte 10
        System.out.println("dame un numero entero entre 1 y 10: ");
        int n = sc.nextInt();
        
        
        // parte 1 medios
        System.out.print("ingresa un numero entero: ");
        int nu = sc.nextInt();

        if (nu > 0) {
        System.out.println("el numero es positivo");
        } else if (nu < 0) {
        System.out.println("el numero es negativo");
        } else if (nu == 0) {
        System.out.println("el numero es cero");
        }

        //parte 2 medios
        System.out.print("ingresa un numero entero: ");
        int nume = sc.nextInt();

        if (nume >= 1 && nume <= 100 && nume %2 == 0){
        System.out.println("El numero es par y esta entre 1 y 100");
        }
        else {
        System.out.println("El numero no es par o no esta entre 1 y 100");
        }

        //parte 3 medios
        System.out.println("ingresa tu edad");
        int age = sc.nextInt();

        if (age <= 120 && age >= 0 && age >= 18){
        System.out.println("Edad valida, eres mayor de edad");
        } else if (age <= 120 && age >= 0 && age < 18){
        System.out.println("Edad valida, eres menor de edad");
        } else {
        System.out.println("Edad invalida");
        }

        sc.close();

    }   
}
