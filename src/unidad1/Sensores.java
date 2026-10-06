package unidad1;

import java.util.Random;
import java.util.Scanner;

public class Sensores {
    public static void main(String[] args) throws InterruptedException {
        Random aleatorios = new Random();

        int SENSIBILIDAD = 2000, LECTURAS_ANOMALAS = 3, TMIN = 15, TMAX = 30, HMIN = 30, HMAX = 70, AUSENCIA = 0, PRESENCIA = 1;
        int temp, hum, presen, tempMaxReg = 0, humMaxReg = 0, tempMinReg = 0, humMinReg = 0, tempProm = 0, humProm = 0, contTemp = 0, contHum = 0, contPres = 0;

        System.out.println("Sistema de monitoreo de sensores y alarmas");

        while (true) {
            Thread.sleep(SENSIBILIDAD);
            temp = aleatorios.nextInt(10, 41);
            hum = aleatorios.nextInt(20, 91);
            presen = aleatorios.nextInt(0, 2);
            System.out.println("Lecturas actuales:\n\n   - Temperatura: " + temp + "\n   - Humedad: " + hum + "\n   - Presencia:" + presen);

            System.out.println("Estadísticas\n  - Temperatura: Máximo = " + ", Mínimo = " + ", Promedio = ");

            System.out.println("  - Humedad: Máximo = " + ", Mínimo = " + ", Promedio = ");

            System.out.println("Total de Alarmas Generadas: \n  - Temperatura: " + "\n  - Humedad: " + "\n  - Presencia: ");

            if (presen == 1) {
                contPres++;
            }
                if (contPres > LECTURAS_ANOMALAS) {
                    System.out.println("¡Alarma! Sensor de presencia activado");
                }
            }
        }
    }
