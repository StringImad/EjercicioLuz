/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.ejluz_imad;

import java.util.Scanner;

/**
 *
 * @author IMAD
 */
public class ParteA {

    public static void main(String[] args) {
        //Declaracion de variables
        double consumoAparato;
        double horasFuncionamiento = 0.0;
        double precioKWH;
        double precioFinal;
        double calculoKWH;
        //Declaracion del objeto scanner
        Scanner teclado = new Scanner(System.in);
        //bucle do while para hacer un bucle que cumpla la condcion del while
        do {
            System.out.println("Introduce el consumo del aparato");
            consumoAparato = teclado.nextDouble();
        } while (consumoAparato < 0 || consumoAparato > 4500);
        do {
            System.out.println("Introduce las horas de funcionamiento");
            horasFuncionamiento = teclado.nextDouble();
        } while (horasFuncionamiento < 1 || horasFuncionamiento > 24);
        do {
            System.out.println("Introduce el precio del KWH");
            precioKWH = teclado.nextDouble();
        } while (precioKWH < 0.1 || precioKWH > 0.45);

        //Algoritmo de calculo
        calculoKWH = (consumoAparato * horasFuncionamiento) / 1000;
        precioFinal = calculoKWH * precioKWH;
        System.out.printf("El precio final es: %.2f€ %n", + precioFinal);

    }
}
