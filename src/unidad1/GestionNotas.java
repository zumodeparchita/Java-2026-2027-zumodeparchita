package unidad1;

import java.util.Scanner;

public class GestionNotas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nombres = {
                "Ana", "Carlos", "Lucia", "Pedro",
                "Marta", "David", "Elena", "Pablo"
        };
        double[] notas = {
                7.5, 4.2, 8.8, 5.5, 3.7, 6.0, 9.2, 4.8
        };

        // 1. Mejora 1-3
        System.out.println("=== LISTADO DE ALUMNOS ===");
        mostrarAlumnos(nombres, notas, 0, 10);

        System.out.println("\n=== ALUMNOS APROBADOS ===");
        mostrarAlumnos(nombres, notas, 5, 10);

        System.out.println("\n=== ALUMNOS SUSPENSOS ===");
        mostrarAlumnos(nombres, notas, 0, 4.9);

        // 4. Calcular la nota media
        System.out.println("\n=== NOTA MEDIA ===");
        System.out.printf("\t%.2f%n", calcularMedia(notas));

        // 5. Obtener la nota máxima
        System.out.println("\n=== NOTA MÁXIMA ===");
        System.out.println("\t" + obtenerMaxima(notas));

        // 6. Contar los alumnos aprobados
        System.out.println("\n=== NÚMERO DE APROBADOS ===");
        System.out.println("\t" + contarAprobados(notas));

        // 7. Comprobar si todos han aprobado
        System.out.println("\n=== TODOS HAN APROBADO ===");
        System.out.println("\t" + todosAprobados(notas));

        // 8. Buscar un alumno
        System.out.println("\n=== BUSCAR ALUMNO ===");
        int posicion = buscarAlumno(nombres, "Carlos");
        if (posicion != -1) {
            System.out.println("\tCarlos está en la posición " + posicion);
        } else {
            System.out.println("\tAlumno no encontrado");
        }

        // 9. Consultar la nota de un alumno
        System.out.println("\n=== CONSULTAR NOTA ===");
        double nota = consultarNota(nombres, notas, "Lucia");

        if (nota != -1) {
            System.out.println("\tNota de Lucia: " + nota);
        } else {
            System.out.println("\tAlumno no encontrado");
        }

        // 10. Modificar la nota de un alumno
        System.out.println("\n=== MODIFICAR NOTA ===");
        boolean modificada = modificarNota(nombres, notas, "Carlos", 6.5);

        if (modificada) {
            System.out.println("Nota modificada correctamente");
        } else {
            System.out.println("No se ha podido modificar la nota");
        }

        // 11. Incrementar todas las notas
        System.out.println("\n=== LISTADO DESPUÉS DEL INCREMENTO ===");
        int cambios = incrementarNotas(notas, 0.5);
        mostrarAlumnos(nombres, notas, 0, 10);
        System.out.println("Se han cambiado: " + cambios + " notas");


        // 12. Calcular el porcentaje de aprobados
        System.out.println("\n=== PORCENTAJE DE APROBADOS ===");
        System.out.println(porcentajeAprobados(notas) + "%");

        // 13. Contar las notas superiores a 7
        System.out.println("\n=== NOTAS SUPERIORES A 7 ===");
        // System.out.println(contarSuperiores(notas, 7));

        // 14. Obtener la nota de una posición
        System.out.println("\n=== CONSULTAR NOTA POR POSICIÓN ===");
        //System.out.println(obtenerNota(notas, 3));

    }

    // IMPLEMENTA AQUÍ LOS MÉTODOS NECESARIOS

    public static void mostrarAlumnos(String[] nombres, double[] notas, double min, double max) {

        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] <= max && notas[i] >= min) {
                System.out.println("\t" + nombres[i] + ": " + notas[i]);
            }
        }
    }

    public static double calcularMedia(double[] notas) {
        double media = 0;

        for (double nota : notas) {
            media = media + nota;
        }

        return media / notas.length;
    }

    public static double obtenerMaxima(double[] notas) {
        double maxNota = 0;
        for (double nota : notas) {
            if (nota > maxNota) {
                maxNota = nota;
            }
        }
        return maxNota;
    }

    public static int contarAprobados(double[] notas) {
        int numAprobados = 0;
        for (double nota : notas) {
            if (nota > 4.99 && nota <= 10) {
                numAprobados++;
            }
        }
        return numAprobados;
    }

    public static boolean todosAprobados(double[] notas) {
        int i = 0;
        while (i < notas.length && notas[i] >= 5) {
            i++;
        }
        return i >= notas.length;
    }

    public static int buscarAlumno(String[] alumnos, String nombre) {
        int posicion = -1;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].equalsIgnoreCase(nombre)) {
                posicion = i;
            }
        }
        return posicion;
    }

    public static double consultarNota(String[] nombres, double[] notas, String texto) {

        int posicion = buscarAlumno(nombres, texto);
        if (posicion != -1) {
            return notas[posicion];
        } else {
            return -1;
        }
    }

    public static boolean modificarNota(String[] nombres, double[] notas, String alumno, double nuevaNota) {
        int notaModificar;

        if (nuevaNota > 10 || nuevaNota < 0) {
            return false;
        }
        notaModificar = buscarAlumno(nombres, alumno);

        if (notaModificar == -1) {
            return false;
        } else {
            notas[notaModificar] = nuevaNota;
            return true;
        }
    }

    public static int incrementarNotas(double[] notas, double incremento) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {

            if ((notas[i] + incremento) > 10) {
                notas[i] = 10;
            } else {
                notas[i] += incremento;
            }

            contador++;
        }
        return contador;
    }

    public static String porcentajeAprobados(double[] notas) {

        int porcentajeAprobados = (contarAprobados(notas) / notas.length) * 100;


    }


}

