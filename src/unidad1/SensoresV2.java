package unidad1;

import java.util.Random;
import java.util.Scanner;

public class SensoresV2 {
    public static void main(String[] args) throws InterruptedException {
        Random aleatorios = new Random();
        Scanner sc = new Scanner(System.in);

        //1) Mostrar primeras lecturas
        //2) Preguntar siguiente acción


        final int SENSIBILIDAD = 5000, LECTURAS_ANOMALAS = 3, TMIN = 15, TMAX = 30, HMIN = 30, HMAX = 70, AUSENCIA = 0, PRESENCIA = 1;
        int sensorT, sensorH, sensorP, tempMaxReg = Integer.MIN_VALUE, humMaxReg = Integer.MIN_VALUE, tempMinReg = Integer.MAX_VALUE, humMinReg = Integer.MAX_VALUE;
        int tempProm = 0, humProm = 0, contAnomTemp = 0, contAnomHum = 0, contAnomPres = 0;
        int alarmaT = 0, alarmaH = 0, alarmaP = 0, tSuma = 0, hSuma = 0, lecturas = 0;
        int opcion;

        System.out.println("Sistema de monitoreo de sensores y alarmas");
        System.out.println("1.- Nueva Lectura \n0.- Salir del programa");
        opcion = sc.nextInt();

        //bucle dependiente de la opcion
        while (opcion != 0) {
            Thread.sleep(500);

            do {
                lecturas++;
                //Valores aleatorios
                sensorT = aleatorios.nextInt(10, 41);
                sensorH = aleatorios.nextInt(20, 91);
                sensorP = aleatorios.nextInt(0, 2);

                tSuma+=sensorT;
                hSuma+=sensorH;

                //Lecturas actuales

                System.out.println("Lecturas actuales:\n\n   - Temperatura: " + sensorT + "ºC" + "\n   - Humedad: " + sensorH + "%");

                if (sensorP == AUSENCIA) {
                    System.out.println("   - Presencia: NO");
                } else {
                    System.out.println("   - Presencia: SI");
                }
                System.out.println("1.- Nueva Lectura\n2.- Iniciar monitorización\n0.- Salir del programa");
                opcion = sc.nextInt();

                //Recopilación de datos para las lecturas estadísticas de temperatura
                if (sensorT > tempMaxReg) tempMaxReg = sensorT;
                if (sensorT < tempMinReg) tempMinReg = sensorT;
                tempProm = tSuma/lecturas;

                //Recopilación de datos para las lecturas estadísticas de humedad
                if (sensorH > humMaxReg)humMaxReg = sensorH;
                if (sensorH < humMinReg) humMinReg = sensorH;
                humProm = hSuma/lecturas;

            } while (opcion == 1);


            while (opcion == 2) {
                //Lecturas estadísticas
                //Temperatura
                System.out.println("Estadísticas\n  - Temperatura: Máximo = " + tempMaxReg + "ºC" + ", Mínimo = " + tempMinReg + "ºC" + ", Promedio = " + tempProm + "ºC");

                //Humedad
                System.out.println("  - Humedad: Máximo = " + humMaxReg + "%" + ", Mínimo = " + humMinReg + "%" + ", Promedio = " + humProm + "%");

                //Total de alarmas generadas

                if (sensorT < TMIN || sensorT > TMAX) {
                    contAnomTemp++;

                } else {
                    contAnomTemp = 0;
                }
                if (sensorH < HMIN || sensorH > HMAX) {
                    contAnomHum++;

                } else {
                    contAnomHum = 0;
                }
                if (sensorP == PRESENCIA) {
                    contAnomPres++;

                } else {
                    contAnomPres = 0;
                }

                //¡Alarmas!

                if (contAnomTemp == 3) {
                    alarmaT++;
                    contAnomTemp = 0;
                    System.out.println("¡Alarma! Sensor de temperatura activado");
                }
                if (contAnomHum == 3) {
                    alarmaH++;
                    contAnomHum = 0;
                    System.out.println("¡Alarma! Sensor de humedad activado");
                }

                if (contAnomPres == 3) {
                    alarmaP++;
                    contAnomPres = 0;
                    System.out.println("¡Alarma! Sensor de presencia activado");
                }
                System.out.println("Total de Alarmas Generadas: \n  - Temperatura: " + alarmaT + "\n  - Humedad: " + alarmaH + "\n  - Presencia: " + alarmaP);
                System.out.println();
                System.out.println("1.- Nueva Lectura\n2.- Iniciar monitorización\n0.- Salir del programa");
                opcion = sc.nextInt();
            }
        }
    }
}
