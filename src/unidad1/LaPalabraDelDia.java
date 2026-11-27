package unidad1;

import java.util.Random;
import java.util.Scanner;

public class LaPalabraDelDia {
    static final Random random = new Random();
    static final Scanner sc = new Scanner(System.in);
    static final String NEGRO = "\u001b[30m";
    static final String VERMELLO = "\u001b[31m";
    static final String VERDE = "\u001b[32m";
    static final String AMARELO = "\u001b[33m";
    static final String AZUL = "\u001b[34m";
    static final String MAGENTA = "\u001b[35m";
    static final String CYAN = "\u001b[36m";
    static final String BRANCO = "\u001b[37m";
    static final String RESET = "\u001B[0m";
    static final String[] DICCIONARIO = {
            "abrir", "actor", "ahora", "aislar", "aleta", "amigo", "anillo", "arbol", "arena", "avion", "bajar", "banco", "barco", "besar", "bolsa", "bruja", "bueno", "burro", "caber", "cable", "calle", "campo", "canto", "carne", "carta",
            "casco", "causa", "cerca", "cielo", "clase", "clima", "cobre", "comer", "copia", "corte", "culpa", "curso", "dados", "danza", "datos", "debil", "deber", "dedos", "dejar", "dulce", "duena", "ellos", "entre", "epoca", "error",
            "falda", "fatal", "fecha", "feliz", "fiera", "firma", "flaco", "flora", "forma", "fruta", "fuego", "fuera", "fuerte", "gafas", "gallo", "ganar", "gente", "globo", "golpe", "gordo", "gracia", "grado", "grano", "grave", "grito",
            "grupo", "guapo", "hacer", "hielo", "hogar", "hoyos", "hueso", "huevo", "ideas", "joven", "judio", "juego", "jugar", "junto", "justo", "labio", "lacio", "largo", "latir", "lejos", "lento", "letra", "libro", "light", "lindo",
            "lista", "llave", "llena", "lleno", "lluvia", "lugar", "lunes", "madre", "mages", "mango", "mapas", "marca", "mente", "mesas", "miedo", "mismo", "mocos", "moler", "monte", "morir", "mucho", "mundo", "museo", "nadar", "negro",
            "nieve", "noche", "norte", "notas", "nuevo", "obras", "olvido", "ondas", "orden", "otoño", "padre", "pagar", "palma", "panes", "papel", "parte", "pasar", "patio", "pausa", "pecho", "pedir", "pelea", "pelos", "perro",
            "piano", "piedra", "pilas", "pisos", "plata", "playa", "plaza", "pobre", "poder", "polvo", "poner", "postre", "prado", "presa", "prisa", "pulpo", "queso", "quien", "radio", "rapaz", "rayos", "recto", "reina", "reloj", "rubio",
            "ruido", "rumbo", "sabio", "sacar", "salir", "salsa", "salud", "salto", "sanar", "sapos", "secar", "sello", "selva", "sepia", "serio", "siete", "signo", "sitio", "sobre", "sofas", "suave", "suelo", "sueno", "super", "tabla",
            "tarde", "techo", "tecla", "tejer", "tenis", "tiene", "tierra", "tigre", "tinta", "tipos", "tocar", "todos", "torre", "trigo", "tuyos", "unico", "unido", "usted", "vacas", "valer", "vamos", "vasos", "veces", "velas", "vemos",
            "venta", "verde", "video", "viejo", "viaje", "vidas", "vinos", "viral", "visto", "vivir", "volar", "votar", "yerba", "zorro"
    };

    static void main() {
        String[] tablero = new String[5];
        String palabraSecreta;
        int intentos = 2;
        tablero[0] = "LUNAS";
        tablero[1] = "VERDE";

        palabraSecreta = escogerPalabra(DICCIONARIO);
        System.out.println(palabraSecreta);
        mostrarTablero(tablero, intentos);

    }

    private static String escogerPalabra(String[] diccionario) {
        return diccionario[random.nextInt(0, diccionario.length)].toUpperCase();
    }

    private static void mostrarTablero(String [] tablero, int intentos){
        System.out.println("           ADIVINA");
        System.out.println("      LA PALABRA DEL DÍA");
        for(int i = 0; i < intentos; i++){
            mostrarIntento(tablero[i]);
            System.out.println();
        }
        System.out.println("          _ _ _ _ _");
    }

    private static void mostrarIntento(String palabraIntento){
        System.out.print("          ");
        for(int i = 0; i < palabraIntento.length(); i++){
            System.out.print(palabraIntento.charAt(i) + " ");
        }
    }

}


