/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.poo.forma;

/**
 *
 * @author guilh
 */
class Quadrado extends Retangulo {
    //protected double lado = 1;
    
    public Quadrado(){}
    public Quadrado(double lado){super.altura = lado;}
    public Quadrado(double lado, String cor, boolean preenchido){
        super.preenchido = preenchido;
        super.cor = cor;
        super.altura = lado;
    }
    
    
    //acessadorees
    public double getLado(){return super.altura;}
    public void setLado(double lado){super.altura=lado;}
    @Override
    public String toString(){return "Quadrado [Lado="+altura+", cor="+cor+", preenchido = "+preenchido;}
    
    
}
    

