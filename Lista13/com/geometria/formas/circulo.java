package com.geometria.formas;

public class circulo {
    private double raio;
    public circulo(double raio) {
        this.raio=raio;   
    }

    public double AreaCirculo(){
        return 3.14*(raio*raio);
    }
}