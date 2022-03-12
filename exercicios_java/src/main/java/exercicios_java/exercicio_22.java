/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java;

import java.util.Scanner;

public class exercicio_22 {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int num = 2;

        float[] custoProduto = new float[num];
        float[] precoProduto = new float[num];

        float somatorioCusto = 0;
        float somatorioPreco = 0;

        for (int i = 0; i < num; i++) {            
            System.out.printf("Digite o custo do produto: %d ", i + 1);
//            System.out.println("Digite o custo do produto ");
            custoProduto[i] = leitorScanner.nextFloat();

            System.out.printf("Digite o preço do produto: %d ", i + 1);
            precoProduto[i] = leitorScanner.nextFloat();

            somatorioCusto = somatorioCusto + custoProduto[i];
            somatorioPreco = somatorioPreco + precoProduto[i];

        }

        System.out.println(" ");

        for (int i = 0; i < num; i++) {
            System.out.printf("O valor de custo do produto %d foi de R$ %.2f", i + 1, custoProduto[i]);
            System.out.printf("\nO valor da venda produto %d foi de R$ %.2f", i + 1, precoProduto[i]);

            if (custoProduto[i] > precoProduto[i]) {
                System.out.printf("\nO produto %d está dando prejuizo!", i + 1);
            } else if (precoProduto[i] > custoProduto[i]) {
                System.out.printf("\nO produto %d está dando lucro!", i + 1);
            } else {
                System.out.printf("\nO produto %d está no 0 a 0", i + 1);
            }

            System.out.println("\n");
        }

        System.out.printf("\nA média dos custos foi de %.2f", somatorioCusto / num);
        System.out.printf("\nA média dos preços foi de %.2f", somatorioPreco / num);

    }

}
