# Sistema de Tareas Pendientes

Este proyecto es una aplicación simple para gestionar tareas pendientes. Permite agregar, mostrar, completar y obtener información sobre tareas.

## Estructura del Proyecto

El proyecto está dividido en los siguientes paquetes y clases:

- `Tareas`: Contiene la clase `Tareas` que representa una tarea.
- `Systema`: Contiene la clase `Systema` que gestiona una lista de tareas.
- `Main`: Contiene la clase `Main` que ejecuta la aplicación.

## Clases y Métodos

### Clase `Tareas`

Representa una tarea con los siguientes atributos y métodos:

- Atributos:
  - `nombre`: Nombre de la tarea.
  - `descripcion`: Descripción de la tarea.
  - `prioridad`: Prioridad de la tarea.
  - `completada`: Estado de la tarea (completada o no).

- Métodos:
  - `getNombre()`: Retorna el nombre de la tarea.
  - `getDescripcion()`: Retorna la descripción de la tarea.
  - `getPrioridad()`: Retorna la prioridad de la tarea.
  - `getCompletada()`: Retorna el estado de la tarea.
  - `setCompletada(boolean completada)`: Establece el estado de la tarea.
  - `toString()`: Retorna una representación en cadena de la tarea.

### Clase `Systema`

Gestiona una lista de tareas con los siguientes métodos:

- `agregarTarea(Tareas tarea)`: Agrega una tarea a la lista.
- `getTareas()`: Muestra todas las tareas.
- `getTareasPendientes()`: Muestra solo las tareas pendientes.
- `getTarea(String nombre)`: Retorna una tarea por su nombre.
- `completarTarea(String nombre)`: Marca una tarea como completada.

### Clase `Main`

Ejecuta la aplicación y permite interactuar con el sistema de tareas a través de un menú.

## Uso

Para ejecutar la aplicación, compila y ejecuta la clase `Main`. El menú permite realizar las siguientes acciones:

1. Agregar Tarea
2. Mostrar Tareas
3. Información de Tarea
4. Completar Tarea
5. Salir

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request para discutir cualquier cambio.
