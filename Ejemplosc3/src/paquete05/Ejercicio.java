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

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del encargado de la estación ");
            nombres[i] = entrada.nextLine();
            i = i + 1;

            double sumaEstacion = 0;
            for (int l = 0; l < 12; l++) {
                System.out.print("  Ingrese producción mes:");
                produccion[i][l] = entrada.nextDouble();
                sumaEstacion = sumaEstacion + produccion[i][l];
                l = l + 1;
            }
            totales[i] = sumaEstacion;
            entrada.nextLine();
        }

        double produccionMayor = totales[0];
        int indiceMax = 0;

        for (int i = 1; i < 5; i++) {
            if (totales[i] > produccionMayor) {
                produccionMayor = totales[i];
                indiceMax = i;
            }
        }

     
