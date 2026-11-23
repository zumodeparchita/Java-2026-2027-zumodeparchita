package unidad1;

import java.util.Arrays;
import java.util.Scanner;

public class GestorTareas {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_TAREAS = 10;

    static void main() {
        String[] tareas = new String[MAX_TAREAS];
        int numTareas = 0;
        int opcion;

        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    if (anadirTarea(tareas, numTareas)) numTareas++;
                    break;
                case 2:
                    cambiarEstadoTarea(tareas, numTareas, "EN REVISIÓN");
                    break;
                case 3:
                    cambiarEstadoTarea(tareas, numTareas, "COMPLETADA");
                    break;
                case 4:
                    listarTareas(tareas, numTareas);
                    break;
                case 5:
                    filtrarDescripcion(tareas, numTareas);
                    break;
                case 6:
                    filtrarUsuario(tareas, numTareas);
                    break;
                case 7:
                    resumen(tareas, numTareas);
                    break;
            }
        } while (opcion != 0);

    }

    static int mostrarMenu() {
        int opcion;
        System.out.println("Gestor de Tareas de Mantenimiento Informático");
        System.out.println("-".repeat(45));

        System.out.println("\t1. Añadir una nueva tarea");
        System.out.println("\t2. Revisar tarea");
        System.out.println("\t3. Completar tarea");
        System.out.println("\t4. Listar tareas");
        System.out.println("\t5. Buscar tarea por descripción");
        System.out.println("\t6. Filtrar tareas por usuario");
        System.out.println("\t7. Resumen\n");
        System.out.println("\t0. SALIR\n");
        do {
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
        } while (opcion < 0 || opcion > 7);
        System.out.println();
        return opcion;
    }

    static boolean anadirTarea(String[] tareas, int numTarea) {

        if (numTarea >= MAX_TAREAS) {
            System.out.println("Error: no se pueden añadir más tareas, memoria llena...");
            return false;
        }
        String usuario, descripcion, tarea;
        System.out.println("Añadir tarea");
        System.out.println("-".repeat(45));
        System.out.print("Descripción: ");
        descripcion = sc.nextLine();
        System.out.print("Usuario: ");
        usuario = sc.nextLine();

        descripcion = convertirPrimeraMayuscula(descripcion);
        usuario = convertirCamelCase(usuario);

        tarea = descripcion.concat(" | Solicitado por: ")
                .concat(usuario)
                .concat(" | Estado: PENDIENTE | Responsable: Ninguno");

        tareas[numTarea] = tarea;
        System.out.println();

        return true;
    }

    static void listarTareas(String[] tareas, int numTareas) {

        System.out.println("Lista tareas");
        System.out.println("-".repeat(45));

        for (int i = 0; i < numTareas; i++) {
            System.out.println((i + 1) + ". " + tareas[i]);
        }
        System.out.println();
    }

    static void cambiarEstadoTarea(String[] tareas, int numTareas, String nuevoEstado) {
        String[] partes;
        String responsable = "";
        int n;
        listarTareas(tareas, numTareas);

        do {
            System.out.print("¿Qué tarea quieres revisar? ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 0 || n > numTareas);
        n--;

        System.out.print("Responsable? ");
        responsable = sc.nextLine();

        partes = tareas[n].split("\\|");

        tareas[n] = partes[0].concat("|")
                .concat(partes[1]);
        if (nuevoEstado.equals("EN REVISIÓN")) {
            tareas[n] = tareas[n].concat("| Estado: EN REVISIÓN | ");
        } else {
            tareas[n] = tareas[n].concat("| Estado: COMPLETADA | ");
        }
        tareas[n] = tareas[n].concat("Responsable: ")
                .concat(convertirCamelCase(responsable));

        System.out.println("\nTarea revisada...\n");
    }

    static void filtrarDescripcion(String[] tareas, int numTareas) {

    }

    static void filtrarUsuario(String[] tareas, int numTareas) {
        String usuario;
        System.out.println("Filtrar tareas por usuario...");
        System.out.println("Ingrese el usuario: ");
        usuario = sc.nextLine();

        usuario = convertirCamelCase(usuario);

        for (int i = 0; i < numTareas; i++) {
            if (tareas[i].contains("Solicitado por: " + usuario)) {
                System.out.println(tareas[i]);
            }
        }
        System.out.println();
    }

    static void resumen(String[] tareas, int numTareas) {
        int contCom = 0, contPen = 0, contRev = 0;
        System.out.println("Resumen Tareas...");
        System.out.println("-".repeat(45));
        for (int i = 0; i < numTareas; i++){
            if(tareas[i].contains("Estado: EN REVISIÓN")) contRev++;
            if(tareas[i].contains("Estado: PENDIENTE")) contPen++;
            if(tareas[i].contains("Estado: COMPLETADA")) contCom++;
        }

        System.out.println("Total Tareas: " + numTareas);
        System.out.println("\tPendientes: " + contPen);
        System.out.println("\tEn Revisión: " + contRev);
        System.out.println("\tCompletadas: " + contCom);
        System.out.println();
    }

    static String convertirCamelCase(String texto) {
        String[] usuarioArray = texto.split("\\s+");
        String formateado = "";
        for (String s : usuarioArray) {
            formateado = formateado.concat(s.substring(0, 1).toUpperCase()
                    .concat(s.substring(1).toLowerCase().concat(" ")));
        }
        formateado = formateado.trim();
        texto = formateado;

        return texto;
    }

    static String convertirPrimeraMayuscula(String texto) {
        texto = texto.substring(0, 1).toUpperCase().concat(texto.substring(1).toLowerCase());
        return texto;
    }


}
