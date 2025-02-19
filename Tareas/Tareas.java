package Tareas;

public class Tareas {
    private String nombre;
    private String descripcion;
    private int prioridad;
    private boolean completada;

    public Tareas(String nombre, String descripcion, int prioridad){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public int getPrioridad(){
        return this.prioridad;
    }

    public boolean getCompletada(){
        return this.completada;
    }

    public void setCompletada(boolean completada){
        this.completada = completada;
    }

    public String toString(){
        return "Nombre: " + this.nombre + "\nDescripción: " + this.descripcion + "\nPrioridad: " + this.prioridad + "\nCompletada: " + this.completada;
    }

    
}
