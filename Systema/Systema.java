package Systema;
import Tareas.*;
import java.util.ArrayList;

public class Systema {

    private ArrayList<Tareas> tareas; // Atributo de la clase Tienda (Lista de productos)

    public Systema() { // Constructor
        this.tareas = new ArrayList<>(); // Inicializar la lista de productos
    }

    public void agregarTarea(Tareas tarea) { // Método para agregar un producto a la lista
        this.tareas.add(tarea); // Agregar un producto a la lista

    }

    public void getTareas() { // Método para mostrar los productos de la lista
        if(this.tareas.isEmpty()){
            System.out.println("No hay tareas");
        }else{
            for (Tareas tarea : this.tareas) { // Recorrer la lista de productos
                System.out.println(" Nombre: " + tarea.getNombre()+ " Completado: " + tarea.getCompletada() + " Prioridad: " + tarea.getPrioridad()); // Imprimir el producto
            }
        }
    }

    public void getTareasPendientes(){
        if(this.tareas.isEmpty()){
            System.out.println("No hay tareas");
        }else{
            int i = 0;
            for (Tareas tarea : this.tareas) { // Recorrer la lista de productos
                if(!tarea.getCompletada()){
                    System.out.println(" Nombre: " + tarea.getNombre()+ " Completado: " + tarea.getCompletada() + " Prioridad: " + tarea.getPrioridad()); // Imprimir el producto
                    i++;
                }
                if(i == 0){
                    System.out.println("No hay tareas pendientes");
                }
            }
        }
    }

    public Tareas getTarea(String nombre) {
        for (Tareas tarea : this.tareas) {
            if (tarea.getNombre().equals(nombre)) {
                return tarea;
            }
        }
        return null;
    }

    public void completarTarea(String nombre) {
        for (Tareas tarea : this.tareas) {
            if (tarea.getNombre().equals(nombre)) {
                tarea.setCompletada(true);
                System.out.println("Tarea " + nombre + " completada");
            }
        }
    }
}
