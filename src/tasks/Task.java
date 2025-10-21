// Esto se llama igual a la carpeta que lo contiene.
// es para clasificar o modularizar nuestro codigo.
package tasks; 

// public es de acceso global de la aplicacion
// class es una palabra reservada para indicar que es un contenedor.
// la palabra Task es el nombre de la clase.

public class Task {
    // private es una reservada y solo existe dentro de la clase o contenedor.
    // String es el tipo de dato.
    // para finalizar cada linea de codigo es obligatorio ';'
    private String name;
    private String description;
    private boolean status;

    // es el constructor que es la forma de iniciar la clase
    // que siempre se llama igual que la clase.
    public Task() {}

    // Ejemplo de presentacion 3. Variables, constantes, tipos de datos y lectura con Scanner
    public void init(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre");
        String nombre = sc.nextLine();

        System.out.print("Edad");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + "tienes " + edad + " años");
        
        sc.close();
    }

    // Ejemplo de presentacion 4. Operadores y Jerarquía de Operaciones en Java
    public void operators(){
        int a = 10;
        int b = 5;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
    }

    // Ejemplo de presentacion 5. Condicionales en Java
    public void ageValidate(){
        int age = 20;
        if (age >= 18 && age <= 110) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    // Ejemplo de presentacion 6. Condicional múltiple y condicionales anidadas en Java
    public void ifElseIfIn(){
        int numero = 15;

        if (numero < 10) {
            System.out.println("El número es menor que 10");
            if (numero % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
        } else if (numero >= 10 && numero <= 20) {
            System.out.println("El número está entre 10 y 20");
        } else {
            System.out.println("El número es mayor que 20");
        }
    }

    // Ejemplo de presentacion 7. Bucles en Java: while, do-while y for
    public void loops(){
        System.out.println("Bucle while:");
    } 
}