package unidad1;
    public class GestionNotas {

        public static void main(String[] args) {

            String[] nombres = {
                    "Ana", "Carlos", "Lucia", "Pedro",
                    "Marta", "David", "Elena", "Pablo"
            };

            double[] notas = {
                    7.5, 4.2, 8.8, 5.5, 3.7, 6.0, 9.2, 4.8
            };

            // 1. Mostrar todos los alumnos
            System.out.println("=== LISTADO DE ALUMNOS ===");
            // mostrarAlumnos(nombres, notas);

            // 2. Mostrar los alumnos aprobados
            System.out.println("\n=== ALUMNOS APROBADOS ===");
            // mostrarAprobados(nombres, notas);

            // 3. Mostrar los alumnos suspensos
            System.out.println("\n=== ALUMNOS SUSPENSOS ===");
            // mostrarSuspensos(nombres, notas);

            // Mejora 1-3
            // Llamada para mostrar todos
            System.out.println("=== LISTADO DE ALUMNOS ===");

            // Llamada para mostrar aprobados
            System.out.println("\n=== ALUMNOS APROBADOS ===");

            // Llamada para mostrar suspensos
            System.out.println("\n=== ALUMNOS SUSPENSOS ===");


            // 4. Calcular la nota media
            System.out.println("\n=== NOTA MEDIA ===");
            // System.out.println(calcularMedia(notas));

            // 5. Obtener la nota máxima
            System.out.println("\n=== NOTA MÁXIMA ===");
            // System.out.println(obtenerMaxima(notas));

            // 6. Contar los alumnos aprobados
            System.out.println("\n=== NÚMERO DE APROBADOS ===");
            // System.out.println(contarAprobados(notas));

            // 7. Comprobar si todos han aprobado
            System.out.println("\n=== TODOS HAN APROBADO ===");
            // System.out.println(todosAprobados(notas));

            // 8. Buscar un alumno
            System.out.println("\n=== BUSCAR ALUMNO ===");
        /* int posicion = buscarAlumno(nombres, "Carlos");
        if (posicion != -1) {
            System.out.println("Carlos está en la posición " + posicion);
        } else {
            System.out.println("Alumno no encontrado");
        } */

            // 9. Consultar la nota de un alumno
            System.out.println("\n=== CONSULTAR NOTA ===");
        /* double nota = consultarNota(nombres, notas, "Lucia");

        if (nota != -1) {
            System.out.println("Nota de Lucia: " + nota);
        } else {
            System.out.println("Alumno no encontrado");
        } */

            // 10. Modificar la nota de un alumno
            System.out.println("\n=== MODIFICAR NOTA ===");
        /* boolean modificada = modificarNota(
                nombres, notas, "Carlos", 6.5);

        if (modificada) {
            System.out.println("Nota modificada correctamente");
        } else {
            System.out.println("No se ha podido modificar la nota");
        } */

            // 11. Incrementar todas las notas
            System.out.println("\n=== LISTADO DESPUÉS DEL INCREMENTO ===");
            // incrementarNotas(notas, 0.5);
            // mostrarAlumnos(nombres, notas);

            // 12. Calcular el porcentaje de aprobados
            System.out.println("\n=== PORCENTAJE DE APROBADOS ===");
            // System.out.println(porcentajeAprobados(notas) + "%");

            // 13. Contar las notas superiores a 7
            System.out.println("\n=== NOTAS SUPERIORES A 7 ===");
            // System.out.println(contarSuperiores(notas, 7));

            // 14. Obtener la nota de una posición
            System.out.println("\n=== CONSULTAR NOTA POR POSICIÓN ===");
            //System.out.println(obtenerNota(notas, 3));

        }

        // IMPLEMENTA AQUÍ LOS MÉTODOS NECESARIOS

    }

