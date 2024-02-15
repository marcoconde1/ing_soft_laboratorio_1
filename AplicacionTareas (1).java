import java.util.ArrayList;
import java.util.Scanner;

public class AplicacionTareas {

    private static ArrayList<String> tareas = new ArrayList<>();

    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    private static void mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("***************************************************************");
            System.out.println("\t\tSIS-213");
            System.out.println("\tAPLICACIÓN DE TAREAS");
            System.out.println("***************************************************************");
            System.out.println("\n# Integrantes");
            System.out.println("**Marco Conde Valdez**");
            System.out.println("**Mauricio Cruz Rada**");
            System.out.println("\n1. Añadir Tareas");
            System.out.println("2. Ver Tareas");
            System.out.println("3. Salir");

            System.out.print("\nIngrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    añadirTarea();
                    break;
                case 2:
                    mostrarMenuVerTareas();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
    }

    private static void añadirTarea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n## Añadir Tarea");
        System.out.print("Ingrese la tarea: ");
        String nuevaTarea = scanner.nextLine();
        tareas.add(nuevaTarea);
        System.out.println("Tarea añadida correctamente.");
    }

    private static void mostrarMenuVerTareas() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("***************************************************************");
            System.out.println("\t\tSIS-213");
            System.out.println("\tAPLICACIÓN DE TAREAS");
            System.out.println("***************************************************************");
            System.out.println("\n(submenu ver tareas)");
            System.out.println("1. Ver Tareas Pendientes");
            System.out.println("2. Ver Tareas Completadas");
            System.out.println("3. Volver al Menú Principal");

            System.out.print("\nIngrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verTareasPendientes();
                    break;
                case 2:
                    verTareasCompletadas();
                    break;
                case 3:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
    }

    private static void verTareasPendientes() {
        System.out.println("\n## Ver Tareas Pendientes");
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

    private static void verTareasCompletadas() {
        System.out.println("\n## Ver Tareas Completadas");
        // Implementar lógica para ver tareas completadas si es necesario
    }
}
