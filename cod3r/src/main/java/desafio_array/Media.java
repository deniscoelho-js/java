/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_array;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Media {
    public static void main(String[] args) {  
        
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite a quantidade de notas: ");
        int numero = leitor.nextInt();
        
        double[] notas = new double[numero];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota: "+ (i+1));
            notas[i] = leitor.nextDouble();
        }
        
        
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        
        System.out.println("As notas foram:");
        System.out.println(Arrays.toString(notas));
        
//        System.out.println("A média foi: " + (media/notas.length));
        System.out.println("A média foi: " + (new DecimalFormat(".##").format(media/notas.length)));
    }
}
