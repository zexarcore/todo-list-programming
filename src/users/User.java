package users; // Esto se llama igual a la carpeta que lo contiene.

public class User { // la clase es mismo nombre del archivo.
   
    // atributos, propiedades o caracteristicas.
    private String name;
    private String email;
    private int phone;

    // es el constructor que es la forma de iniciar la clase
    // que siempre se llama igual que la clase.
    public User() {}

    public void ageValidate(){
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