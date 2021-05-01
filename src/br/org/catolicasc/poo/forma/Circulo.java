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
public class Circulo extends Forma{
    protected double raio = 1;
    
    //construtor 3 parametros
    public Circulo(String cor, boolean preenchido, double raio){
    super(cor,preenchido);
    this.raio=raio;
}
    
    //construtor
    public Circulo(){}
    
    //construtor 1 parametro
    public Circulo(double raio){this.raio = raio;}
    

  
    
    //metodos acessadores
    
    public double getRaio(){return raio;}
    public void setRaio(double raio){this.raio = raio;}
    @Override
    public double getArea(){return (Math.PI*raio*raio); }
    @Override
    public double getPerimetro(){return (2*Math.PI*raio);}
    @Override
    public String toString(){return "Circulo [raio="+raio+", cor="+cor+", preenchido="+preenchido+"]" ;}
    
}
