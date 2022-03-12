/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java;

import java.util.Scanner;

public class exercicio_20 {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int ano;
        String nome;
        float valor;
        float valorDesconto;
        float valorPagarComDesconto;
//		float desconto;
        char resposta = 's';

        while (resposta == 's' || resposta == 'S') {
//			System.out.println("Digite o nome do veiculo: ");
//			nome = leitorScanner.next();

            System.out.println("Digite o ano do veiculo: ");
            ano = leitorScanner.nextInt();

            System.out.println("Digite o valor do veiculo: ");
            valor = leitorScanner.nextFloat();

            if (ano <= 2000) {
                valorDesconto = valor * 0.12f;
                valorPagarComDesconto = valor * 0.88f;
                System.out.printf("\nO desconto foi de R$ %.2f", valorDesconto);
                System.out.printf("\nO valor a pagar é R$ %.2f", valorPagarComDesconto);

            } else {
                valorDesconto = valor * 0.07f;
                valorPagarComDesconto = valor * 0.93f;
                System.out.printf("\nO desconto foi de R$ %.2f", valorDesconto);
                System.out.printf("\nO valor a pagar é R$ %.2f", valorPagarComDesconto);
            }

            System.out.println("\nDeseja continuar? S - Sim / N - Não ");
            resposta = leitorScanner.next().charAt(0);
        }

    }

}
