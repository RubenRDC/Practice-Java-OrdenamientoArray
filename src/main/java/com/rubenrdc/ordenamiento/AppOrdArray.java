package com.rubenrdc.ordenamiento;
import java.util.Random;

/**
 *
 * @author Ruben
 */
public class AppOrdArray {

    public static void main(String[] args) {
        int array[] = new int[10];
        int numeroRandom;
        int numeroMenor;
        int numeroMayor;
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            numeroRandom = r.nextInt(100);//numero randoms del 0 al 99
            array[i] = numeroRandom;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("-" + array[i] + "-");
        }

        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    numeroMenor = array[i];
                    numeroMayor = array[j];
                    array[j] = numeroMenor;
                    array[i] = numeroMayor;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("-" + array[i] + "-");
        }
    }
}
