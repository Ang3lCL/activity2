package actividad_2;

import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
     
        System.out.print("Ingresa tu nombre: ");
        String name = sc.nextLine();
        String nombre1 = "Angel";
        if (name.equalsIgnoreCase(nombre1)) {
        System.out.println("Hola " + name + ", bienvenido");
        }
        else {
        System.out.println("Hola " + name + ", tu nombre no coincide");
        }

        //parte 2
        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();

        int[] pares = new int[n];
        int i = 0;

        // Generar números pares
        while (i < n) {
            pares[i] = (i + 1) * 2;
            i++;
        }

        // Mostrar números
        i = 0;
        while (i < n) {
            System.out.print(pares[i] + " ");
            i++;
        }

        sc.close();
    }
}