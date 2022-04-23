/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_mod5;

/**
 *
 * @author user
 */
public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("arroz", 0.50f);
        Comida c2 = new Comida("feijão", 0.40f);
        
        
        Pessoa p1 = new Pessoa("Denis", 80.0f);
        
        System.out.println(p1.apresentar());
        p1.comer(c1);
        p1.comer(c1);
        p1.comer(c1);
        System.out.println(p1.apresentar());
    }
}
