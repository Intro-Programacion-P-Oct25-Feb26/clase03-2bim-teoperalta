/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio {

 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nombres = new String[5];
        double[][] produccion = new double[5][12];
        double[] totales = new double[5];
        int m = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del encargado de la estación: ");
            nombres[i] = entrada.nextLine();

            double sumaEstacion = 0;
            for (int l = 0; l < 12; l++) {
                System.out.print("  Ingrese producción mes: ");
                produccion[i][l] = entrada.nextDouble();
                sumaEstacion = sumaEstacion + produccion[i][l];
            }
            totales[i] = sumaEstacion;
            entrada.nextLine();
        }

        double produccionTotal = totales[0];
        int indice = 0;

        for (int i = 0; i < 5; i++) {
            if (totales[i] > produccionTotal) {
                produccionTotal = totales[i];
                indice = i;
            }
        }

        System.out.println("\nAnálisis de Producción");
        System.out.println("Estación");

        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + "Estación "+ m +
                    " - Total Producción: $ " + totales[i]);
            m = m + 1;
        }

        System.out.printf("\nEstación más productiva: %s\nEncargado de la estación:"
                + " %s\nCantidad de la estación más productiva: $ %.2f\n",
                nombres[indice], nombres[indice], produccionTotal);
    }
}