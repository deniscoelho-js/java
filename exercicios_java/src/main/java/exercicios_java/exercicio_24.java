/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java;

import java.util.Scanner;

public class exercicio_24 {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        char continua = 's';

        while (continua == 's' || continua == 'S') {
            System.out.println("Digite o número: ");
            int numero = leitorScanner.nextInt();

            if (numero == 0) {
                System.out.println("O número é zero");
            } else {
                if (numero > 0) {
                    System.out.println("O número é maior que zero");
                } else {
                    System.out.println("O número é menor que zero");
                }
            }

            System.out.println("\nDeseja continuar?");
            continua = leitorScanner.next().charAt(0);
        }

    }

}
