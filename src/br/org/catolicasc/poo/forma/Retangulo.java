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
public class Retangulo extends Forma{
    protected double base = 1;
    protected double altura = 1;
    
    //construtores
    public Retangulo(){}
    
    public Retangulo(double base, double altura){this.altura=altura ; this.base = base;}
    
    public Retangulo(double base, double altura, String cor, boolean preenchido){
        super(cor,preenchido);
        this.base = base;
        this.altura = altura;
    }
    
    //metodos acessadores
    
   public double getBase(){return base;}
   public void setBase(double base){this.base = base;}
   public double getAltura(){return altura;}
   public void setAltura(double altura){this.altura = altura;}
    @Override
   public double getArea(){return base*altura;}
    @Override
   public double getPerimetro(){return (base+altura)*2;}
    @Override
   public String toString(){return "Retangulo [base="+base+", Altura="+altura +", cor="+cor+",  preenchido="+preenchido;}
   
}
