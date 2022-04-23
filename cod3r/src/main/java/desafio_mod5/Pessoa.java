/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_mod5;

/**
 *
 * @author user
 */
public class Pessoa {
    private String nome;
    private float peso;
    
    public void comer(Comida comida){
       if(comida != null){
           setPeso(this.peso += comida.getPeso());//comida.getPeso() vale .50, a variavel comida vai pegar o valor lá na classe Comida
       }
    }
    
    public String apresentar(){
        return "Olá eu sou o " + getNome() + " e tenho " + getPeso() + " kilos";
    } 

    public Pessoa(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
 
   public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
