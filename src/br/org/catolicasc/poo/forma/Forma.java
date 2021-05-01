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
abstract public class Forma {
    protected String cor = "Vermelho";
    protected boolean preenchido = true;
    
    
    //Metodo Construtor
    public Forma(String corC, boolean preenchidoC){
    cor = corC;
    preenchido = preenchidoC;
    }
    
    public Forma(){}
    
    //metodos acessadores
    public String getCor(){return cor;}
    public void setCor(String cor ){this.cor = cor;}
    public boolean isPreenchido(){return preenchido;}
    public void setPreenchido(boolean preenchido ){this.preenchido = preenchido;} 
    public double getArea(){return 0;}
    public double getPerimetro(){return 0;}
    @Override
    public String toString(){return null;} 
    
}
