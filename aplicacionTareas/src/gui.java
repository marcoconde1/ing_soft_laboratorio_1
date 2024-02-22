import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class gui {
    ArrayList<Tareas> t = new ArrayList<>();
    ListaTareas lt = new ListaTareas(t);
    public void gui_principal() throws ParseException {
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

        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> gui_anadirTareas();
            case 2 -> gui_verTareas();
            case 3 -> System.out.println("¡Hasta luego!");
            default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
        }
    }

    public void  gui_anadirTareas() throws ParseException {
        System.out.println("***************************************************************");
        System.out.println("\t\tSIS-213");
        System.out.println("\tAPLICACIÓN DE TAREAS");
        System.out.println("***************************************************************");
        System.out.println("\nAÑADIR TAREA");
        System.out.print("Ingrese la tarea: ");
        Scanner sc = new Scanner(System.in);
        String tarea = sc.next();

        System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
        String fechaS = sc.next();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = df.parse(fechaS);

        Tareas t = new Tareas(lt.size(),tarea,fecha);

        lt.add(t);

        System.out.println("\nTarea Añadida Correctamente\n");
        gui_principal();

    }

    public void gui_verTareas() throws ParseException {
        System.out.println("***************************************************************");
        System.out.println("\t\tSIS-213");
        System.out.println("\tAPLICACIÓN DE TAREAS");
        System.out.println("***************************************************************");
        System.out.println("1. Ver Tareas Pendientes");
        System.out.println("2. Ver Tareas Completadas");
        System.out.println("3. Borrar Tareas");
        System.out.println("4. Volver al Menú Principal");
        System.out.print("\nIngrese su opción: ");

        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> gui_tareasPendientes();
            case 2 -> gui_tareasCompletadas();
            case 3 -> gui_borrar();
            case 4 -> gui_principal();
            default -> gui_principal();
        }
    }

    public void gui_tareasPendientes() throws ParseException {
        System.out.println("***************************************************************");
        System.out.println("\t\tSIS-213");
        System.out.println("\tAPLICACIÓN DE TAREAS");
        System.out.println("***************************************************************");
        System.out.println("TAREAS PENDIENTES\n");

        lt.mostrar_tareas_pendientes();

        System.out.println("\nIngrese el id para completar las tareas.");
        System.out.println("Ingrese 0 para volver atras.");
        System.out.print("\nIngrese su opción: ");

        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();

        while(opcion>=1){
            lt.getTareas().get(opcion-1).completarTarea();

            System.out.println("\nLa tarea se completo con exito.\n");
            System.out.println("***************************************************************");
            System.out.println("\t\tSIS-213");
            System.out.println("\tAPLICACIÓN DE TAREAS");
            System.out.println("***************************************************************");
            System.out.println("TAREAS PENDIENTES\n");

            lt.mostrar_tareas_pendientes();

            System.out.println("\nIngrese el id para completar las tareas.");
            System.out.println("Ingrese 0 para volver atras.");
            System.out.print("\nIngrese su opción: ");

            opcion = sc.nextInt();
        }
        gui_verTareas();

    }

    public void gui_borrar() throws ParseException {
        System.out.println("***************************************************************");
        System.out.println("\t\tSIS-213");
        System.out.println("\tAPLICACIÓN DE TAREAS");
        System.out.println("***************************************************************");
        System.out.println("BORRAR TAREAS\n");

        lt.mostrar_tareas();

        System.out.println("\nIngrese el id para borrar las tarea.");
        System.out.println("Ingrese 0 para volver atras.");
        System.out.print("\nIngrese su opción: ");

        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();

        while(opcion>=1){
            lt.getTareas().remove(opcion-1);

            System.out.println("\nLa tarea se completo con exito.\n");
            System.out.println("***************************************************************");
            System.out.println("\t\tSIS-213");
            System.out.println("\tAPLICACIÓN DE TAREAS");
            System.out.println("***************************************************************");
            System.out.println("BORRAR TAREAS\n");

            lt.mostrar_tareas();

            System.out.println("\nIngrese el id para borrar las tarea.");
            System.out.println("Ingrese 0 para volver atras.");
            System.out.print("\nIngrese su opción: ");

            opcion = sc.nextInt();
        }
        gui_verTareas();

    }
    public void gui_tareasCompletadas() throws ParseException {
        System.out.println("***************************************************************");
        System.out.println("\t\tSIS-213");
        System.out.println("\tAPLICACIÓN DE TAREAS");
        System.out.println("***************************************************************");
        System.out.println("TAREAS COMPLETADAS\n");

        lt.mostrar_tareas_completadas();

        System.out.println("\nIngrese un numero para volver atras.");

        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();
        gui_verTareas();
    }




    }

