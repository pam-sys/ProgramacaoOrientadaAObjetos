package exer1.D;

public class Triangulo extends TwoDShape{ 
    protected String estilo; // corrigido

    public double area() { 
        return (getAltura() * getLargura()) / 2; 
    } 

    public void mostraEstilo() { 
        System.out.println("Triangulo = " + estilo); 
    } 
} 
