// Estamos importando la clase Task 
// desde el paquete tasks
import tasks.Task;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Instanciar la clase Task
        // instanciar es crear un objeto
        // un objecto es un tipo de dato personalizado
        Task task = new Task();
        // invocar o llamar el metodo o accion init
        task.init();
        // invocar o llamar el metodo o accion AgeValidate
        task.AgeValidate();
    }
}
