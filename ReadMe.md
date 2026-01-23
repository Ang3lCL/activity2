# Ejercicios básicos Java: tipos, Scanner, Strings y selección


## Ejercicio 1: Saludo simple

**Enunciado**  
Escribe un programa que guarde tu nombre en una variable `String` y lo muestre en pantalla con el mensaje: `Hola, <nombre>`.

**Codigo**  
```` java
package actividad_2;

public class ActividadesExtras {
    public static void main(String[] args) {
        //parte 1
        String nombre = "Angel";

        System.out.println("Hola, " + nombre);
        
    }   
}

````

**Salida real**  
Hola, Angel

---
---

## Ejercicio 2: Suma de dos enteros


**Enunciado**  
Escribe un programa que pida por teclado dos números enteros y muestre la suma de ambos.

**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {
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
        
        sc.close();

    }   
}

````

**Salida real**  
Ingresa un numero entero: 5

Ingresa otro numero entero: 4

La suma de los numero es: 9

---
---

## Ejercicio 3: Conversión de double a int (casting)

**Enunciado**  
Escribe un programa que pida un número decimal (double), lo convierta a entero usando casting y muestre ambos valores.

**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        //parte 3
        System.out.print("Ingresa un numero decimal: ");
        double numDecimal = sc.nextDouble(); 
        sc.nextLine();
        double numDouble = numDecimal;
        int numEntero = (int) numDouble;
        System.out.println("Numero original " + numDouble);
        System.out.println("Numero convertido: " + numEntero);

        sc.close();

    }   
}
````

**Salida real**  
Ingresa un numero decimal: 10.15

Numero original 10.15

Numero convertido: 10

---
---

## Ejercicio 4: Calculadora básica con operadores

**Enunciado**  
Escribe un programa que pida dos enteros e imprima: suma, resta, multiplicación, división entera y el residuo (módulo) de la división.

**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

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



        sc.close();

    }   
}

````


**Salida real**  
Ingresa un numero entero: 10

Ingresa otro numero entero: 7

Suma: 17

Resta: 3

Multiplicación: 70

División entera: 1

Módulo: 3

---
---

## Ejercicio 5: Mayor de edad (if-else)

**Enunciado**  
Escribe un programa que pida la edad del usuario y muestre si es mayor o menor de edad usando `if-else`.

**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //parte 5
        System.out.print("Ingresa tu edad: ");
        int edadM = sc.nextInt();
        if (edadM < 18) {
        System.out.println("Eres menor de edad");
        } else {
        System.out.println("Eres mayor de edad");
        }

        sc.close();

    }   
}

````

**Salida real**  
Ingresa tu edad: 18

Eres mayor de edad

---
---

## Ejercicio 6: Clasificación por rango de edad (if-else if)

**Enunciado**  
Escribe un programa que pida la edad y muestre un mensaje según el rango:  
- Menor de 13: “Eres un niño.”  
- De 13 a 17: “Eres un adolescente.”  
- De 18 a 64: “Eres un adulto.”  
- 65 o más: “Eres un adulto mayor.”

**Codigo**
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
        sc.close();

    }   
}

````

**Salida real**  
Ingresa tu edad: 18

Eres un adulto

---
---

## Ejercicio 7: Día de la semana (switch)

**Enunciado**  
Escribe un programa que pida un número del 1 al 7 y muestre el día de la semana correspondiente usando `switch`.  
- 1: Lunes  
- 2: Martes  
- 3: Miércoles  
- 4: Jueves  
- 5: Viernes  
- 6: Sábado  
- 7: Domingo

**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        sc.close();

    }   
}

````

**Salida real**  
Ingresa un número del 1 al 7: 5

Viernes

---
---

## Ejercicio 8: Comparación de nombres con equalsIgnoreCase

**Enunciado**  
Escribe un programa que pida al usuario su nombre y lo compare con un nombre definido en el código   
- Si coincide (ignorando mayúsculas/minúsculas) muestra: `Hola <nombre>, bienvenido.`  
- Si no coincide, muestra: `Hola <nombre>, tu nombre no coincide.`  


**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        sc.close();

    }   
}

````

**Salida real**  
Ingresa tu nombre: angel

Hola angel, bienvenido

---
---

## Ejercicio 9: Clasificación de calificación (if-else y operadores lógicos)

**Enunciado**  
Escribe un programa que pida una calificación entera de 0 a 100 y muestre:  
- 90 a 100: “Excelente”  
- 80 a 89: “Muy bien”  
- 70 a 79: “Aprobado”  
- 0 a 69: “Reprobado”  
Si la calificación está fuera de ese rango, muestra: “Calificación inválida”.

**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //parte 9
        System.out.print("Ingresa tu calificacion sin decimales: ");
        int cal = sc.nextInt();

        if (cal <= 100) {
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
              
        sc.close();

    }   
}

````
**Salida real**  
Ingresa tu calificacion sin decimales: 84

Muy bien

---
---

## Ejercicio 10: Números pares en un rango (for + arreglo pequeño)

**Enunciado**  
Escribe un programa que:  
1. Pida un número entero **positivo** `n` (por ejemplo, máximo 10 para que sea sencillo).  
2. Genere los primeros `n` números pares empezando desde 2.  
3. Guarde esos números en un arreglo.  
4. Recorra el arreglo y muestre los números en una sola línea separados por espacio.  
Este ejercicio es una versión pequeña de la **Parte 2 de la Actividad 2** (pares y arreglos).

**codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
     
        System.out.print("Ingresa un número entre 1 y 10: ");
        int n = sc.nextInt();

        int[] pares = new int[n];
        int i = 0;

        while (i < n) {
            pares[i] = (i + 1) * 2;
            i++;
        }

        i = 0;
        while (i < n) {
            System.out.print(pares[i] + " ");
            i++;
        }

        sc.close();
    }
}
````

**Salida real**  




---
---
## Ejercicio 1: Número positivo o negativo

**Enunciado**  
Escribe un programa que pida un número entero y muestre si es positivo, negativo o cero usando `if-else if-else`.

**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
   
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

        sc.close();

    }   
}

````

**Salida real**  
ingresa un numero entero: 3

el numero es positivo

---
---

## Ejercicio 2: Par y dentro de rango

**Enunciado**  
Escribe un programa que pida un número entero y verifique **dos condiciones**:  
- Que sea par.  
- Que esté entre 1 y 100 (inclusive).  
Si se cumplen ambas, muestra: `El número es par y está entre 1 y 100.`  
En otro caso, muestra: `El número NO cumple las condiciones.`  
Usa operadores lógicos (`&&`).

**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //parte 2 medios
        System.out.print("ingresa un numero entero: ");
        int nume = sc.nextInt();

        if (nume >= 1 && nume <= 100 && nume %2 == 0){
        System.out.println("el numero es par y esta entre 1 y 100");
        }
        else {
        System.out.println("el numero no es par o no esta entre 1 y 100");
        }

        sc.close();

    }   
}

````

**Salida real**  
ingresa un numero entero: 44

el numero es par y esta entre 1 y 100

---
---

## Ejercicio 3: Edad válida y mayor de edad

**Enunciado**  
Escribe un programa que pida una edad entera y verifique:  
1. Que la edad esté en el rango 0 a 120.  
2. Que sea mayor o igual a 18.  
Si la edad es inválida (fuera de 0 a 120) muestra: `Edad inválida.`  
Si es válida y mayor o igual a 18, muestra: `Edad válida y eres mayor de edad.`  
Si es válida y menor a 18, muestra: `Edad válida y eres menor de edad.`

**Codigo**  
````java
package actividad_2;

import java.util.Scanner;

public class ActividadesExtras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

````

**Salida real**  
ingresa tu edad
18

Edad valida, eres mayor de edad

---
---


