/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_mod5;

/**
 *
 * @author user
 */
public class Comida {
    private String nome;
    private float peso;

    public Comida(String nome, float peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    public String getNomeComida() {
        return nome;
    }

    public void setNomeComida(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
