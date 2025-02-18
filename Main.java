
import java.util.Scanner;
import Tareas.*;
import Systema.*;
public class Main{
    public static void main(String[] args){
        boolean seguirir = true;
        Scanner sc = new Scanner(System.in);
        Systema sistema = new Systema();
        do{
        System.out.println("Sistema Tareas Pendientes");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Mostrar Tareas");
        System.out.println("3. Informacion de Tarea");
        System.out.println("4. Completar Tarea");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opción: ");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Agregar Tarea: Ingresa el nombre");
                String nombre = sc.next();
                sc.nextLine();
                System.out.println("Agregar Tarea: Ingresa la prioridad");
                int prioridad = sc.nextInt();
                sc.nextLine();
                System.out.println("Agregar Tarea: Ingresa la descripción");
                String descripcion = sc.nextLine();
                sistema.agregarTarea(new Tareas(nombre, descripcion, prioridad));
                System.out.println("Tarea " + nombre + " agregada correctamente");
                break;
            case 2:
                System.out.println("Qqui tipo? 1. Todas 2. Pendientes");
                int tipo = sc.nextInt();
                switch (tipo) {
                    case 1:
                        System.out.println("Mostrar Tareas");
                        sistema.getTareas();
                        break;
                    case 2:
                        System.out.println("Mostrar Tareas");
                        sistema.getTareasPendientes();
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("De que tarea quieres recivir informacion?");
                String tarea = sc.next();
                Tareas tareaObject = sistema.getTarea(tarea);
                if(tareaObject != null){
                    System.out.println(tareaObject.toString());
                }else{
                    System.out.println("Tarea no encontrada");
                }
                break;
            case 4:
                System.out.println("que tarea has completado?");
                String tareaCompletada = sc.next();
                Tareas tareac = sistema.getTarea(tareaCompletada);
                if(tareac != null){
                    tareac.setCompletada(true);
                }else{
                    System.out.println("Tarea no encontrada");
                }
                break;
            case 5:
                System.out.println("Salir");
                seguirir = false;
                break;
            default:
                System.out.println("Opción no válida");
        }
        }while(seguirir);
        sc.close();
    }

    
}