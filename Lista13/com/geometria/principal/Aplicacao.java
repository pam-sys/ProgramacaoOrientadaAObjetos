package com.geometria.principal;
import com.geometria.formas.circulo;
public class Aplicacao {

    public static void main(String[] args){
        circulo circulo = new circulo(2.00);

        double area = circulo.AreaCirculo();
        System.out.println("A área do círculo é: " + area);
    } 
}


