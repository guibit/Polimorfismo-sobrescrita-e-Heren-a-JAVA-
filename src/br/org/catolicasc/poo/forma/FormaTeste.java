/*
 * Classe pré pronta para testar as formas geométricas
 * do exercício da agenda 6
 */
package br.org.catolicasc.poo.forma;

/**
 *
 * @author rodrigo
 */
public class FormaTeste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(3.0);
        Retangulo r1 = new Retangulo(3.5, 6.7, "Azul", false);
        Retangulo r2 = new Retangulo(1.4, 2.3);
        Quadrado q1 = new Quadrado();
        
        Forma[] formas = new Forma[5];
        
        formas[0] = c1;
        formas[1] = c2;
        formas[2] = r1;
        formas[3] = r2;
        formas[4] = q1;
        
        for (Forma forma : formas) {
            System.out.println(forma);
            System.out.println("Perímetro: " + forma.getPerimetro());
            System.out.println("Área: " + forma.getArea());
        }
    }
}
