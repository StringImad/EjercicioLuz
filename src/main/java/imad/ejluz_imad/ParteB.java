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
public class ParteB {

    public static void main(String[] args) {
        //Declaracion de variables
        double consumoAparato;
        double horasFuncionamiento = 0.0;
        boolean repeticion = true;
        int eleccion;
        do {

            double calculoKWH1;
            double calculoKWH2;
            double calculoKWH3;
            double calculoFinal;
            double horaPunta;
            double horaLlana;
            double horaValle;
            double horaPuntaPrecio;
            double horaLlanaPrecio;
            double horaVallePrecio;
            double sumaTramosHorarios;
            repeticion = true;
            //Declaracion del objeto scanner
            Scanner teclado = new Scanner(System.in);
            do {
                System.out.println("¿Que desea realizar\n 1. Pulse 1 para calcular la luz\n 2. Pulse 2 para salir");
                eleccion = teclado.nextInt();
            } while (eleccion < 1 || eleccion > 2);
            //Utilizamos estructura switch de seleccion para elegir lo que queremos hacer
            switch (eleccion) {
                case 1:
                    //bucle do while para hacer un bucle que cumpla la condcion del while

                    do {
                        System.out.println("Introduce el consumo del aparato");
                        consumoAparato = teclado.nextDouble();
                    } while (consumoAparato < 0 || consumoAparato > 4500);
                    do {
                        System.out.println("Introduce las horas de funcionamiento");
                        horasFuncionamiento = teclado.nextDouble();
                        do {
                            System.out.println("cuantas horas funciona en hora Punta?");
                            horaPunta = teclado.nextDouble();
                            System.out.println("Cuantas horas funciona en hora LLana?");
                            horaLlana = teclado.nextDouble();
                            System.out.println("Cuantas horas funciona en hora Valle?");
                            horaValle = teclado.nextDouble();
                            sumaTramosHorarios = horaPunta + horaLlana + horaValle;
                            if (sumaTramosHorarios == horasFuncionamiento) {
                                repeticion = false;
                            } else {
                                System.out.println("Las horas introducidas no coinciden con las horas de funcionamiento");
                            }
                        } while (sumaTramosHorarios != horasFuncionamiento);
                    } while (horasFuncionamiento < 1 || horasFuncionamiento > 24);
                    do {
                        System.out.println("Introduce el precio del KWH en hora Punta?");
                        horaPuntaPrecio = teclado.nextDouble();
                        System.out.println("Introduce el precio del KWH en hora LLana?");
                        horaLlanaPrecio = teclado.nextDouble();
                        System.out.println("Introduce el precio del KWH Valle?");
                        horaVallePrecio = teclado.nextDouble();
                        if (horaPuntaPrecio > 0.9 && horaPuntaPrecio < 0.46 && horaLlanaPrecio > 0.9 && horaLlanaPrecio < 0.46 && horaVallePrecio > 0.9 && horaVallePrecio < 0.46) {
                            repeticion = false;
                        } else {
                            repeticion = true;
                            System.out.println("El precio sobre pasa el limite (0.10 y 0.45)");
                        }
                    } while (repeticion);

                    //Algoritmo de calculo
                    calculoKWH1 = (consumoAparato * horaPunta * horaLlanaPrecio) / 1000;

                    calculoKWH3 = (consumoAparato * horaLlana * horaLlanaPrecio) / 1000;

                    calculoKWH2 = (consumoAparato * horaValle * horaVallePrecio) / 1000;

                    calculoFinal = calculoKWH1 + calculoKWH2 + calculoKWH3;
                    System.out.printf("El precio final es: %.2f€ %n", calculoFinal);
                    repeticion = true;
                    break;
                case 2:
                    repeticion = false;
                    break;
            }

        } while (repeticion);
    }
}
