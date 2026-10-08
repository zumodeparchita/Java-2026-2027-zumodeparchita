package unidad1;

import java.util.Random;

public class Sensores {
    public static void main(String[] args) throws InterruptedException {
        Random aleatorios = new Random();

        final int SENSIBILIDAD = 500, LECTURAS_ANOMALAS = 3, TMIN = 15, TMAX = 30, HMIN = 30, HMAX = 70, AUSENCIA = 0, PRESENCIA = 1;
        int sensorT, sensorH, sensorP, tempMaxReg = Integer.MIN_VALUE, humMaxReg = Integer.MIN_VALUE, tempMinReg = Integer.MAX_VALUE, humMinReg = Integer.MAX_VALUE;
        int tempProm = 0, humProm = 0, contAnomTemp = 0, contAnomHum = 0, contAnomPres = 0;
        int alarmaT = 0, alarmaH = 0, alarmaP = 0;
        System.out.println("Sistema de monitoreo de sensores y alarmas");

        //bucle infinito con descansos
        while (true) {
            Thread.sleep(SENSIBILIDAD);

            //Valores aleatorios
            sensorT = aleatorios.nextInt(10, 41);
            sensorH = aleatorios.nextInt(20, 91);
            sensorP = aleatorios.nextInt(0, 2);

            //Lecturas actuales
            System.out.println("Lecturas actuales:\n\n   - Temperatura: " + sensorT + "ºC" + "\n   - Humedad: " + sensorH + "%");
            if (sensorP == 0) {
                System.out.println("   - Presencia: NO");
            } else {
                System.out.println("   - Presencia: SI");
            }

            //Lecturas estadísticas

            //Lecturas estadísticas temperatura
            if (sensorT > tempMaxReg) {
                tempMaxReg = sensorT;
            }
            if (sensorT < tempMinReg) {
                tempMinReg = sensorT;
            }
            tempProm = (tempMaxReg + tempMinReg) / 2;

            System.out.println("Estadísticas\n  - Temperatura: Máximo = " + tempMaxReg + "ºC" + ", Mínimo = " + tempMinReg + "ºC" + ", Promedio = " + tempProm + "ºC");

            //Lecturas Estadísticas Humedad
            if (sensorH > humMaxReg) {
                humMaxReg = sensorH;
            }
            if (sensorH < humMinReg) {
                humMinReg = sensorH;
            }
            humProm = (humMaxReg + humMinReg) / 2;
            System.out.println("  - Humedad: Máximo = " + humMaxReg + "%" + ", Mínimo = " + humMinReg + "%" + ", Promedio = " + humProm + "%");

            //Total de alarmas generadas

            if(sensorT < TMIN || sensorT > TMAX) {
                contAnomTemp++;

            } else {
                contAnomTemp = 0;
            }
            if(sensorH < HMIN || sensorH > HMAX) {
                contAnomHum++;

            } else {
                contAnomHum = 0;
            }
            if(sensorP == 1) {
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
            }
        }
    }
