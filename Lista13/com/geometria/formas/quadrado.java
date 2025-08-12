package com.geometria.formas;

public class quadrado {
    private double lado1, lado2;
    public quadrado(double lado1, double lado2) {
        this.lado1=lado1; 
        this.lado2=lado2;  
    }

    public double AreaQuadrado(){
        return lado1*lado2;
    }
}
