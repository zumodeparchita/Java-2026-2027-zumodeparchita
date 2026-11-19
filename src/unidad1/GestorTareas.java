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
                    break;
                case 3:
                    break;
                case 4:
                    listarTareas(tareas, numTareas);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
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

    static void listarTareas(String[] tareas, int numTareas){

        for (int i = 0; i < numTareas; i++){
            System.out.println(tareas[i]);
        }
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
