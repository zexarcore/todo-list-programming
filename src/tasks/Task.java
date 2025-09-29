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

    public void AgeValidate(){
        int age = 20;
        if (age >= 18 && age <= 110) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    public void init(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre");
        String nombre = sc.nextLine();

        System.out.print("Edad");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + "tienes " + edad + " años");
        
        sc.close();
    }

    public void operator(){}
}