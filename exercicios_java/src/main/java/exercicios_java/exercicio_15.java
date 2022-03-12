/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java;

import java.util.Scanner;

public class exercicio_15 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
		
	System.out.println("Digite o numero: ");
	numero = leitor.nextInt();
		
	if((numero >= 100) && (numero <=200)) {
            System.out.println("O número está no intervalo entre 100 e 200");
	} else {
            System.out.println("O número não está no intervalo entre 100 e 200");
	}

    }

}
