package exer1.A;

public class Triangulo extends TwoDShape { 
    protected String estilo; // corrigido

    public double area() { 
    return (largura * altura) / 2; 
    } 

    public void mostraEstilo() { 
    System.out.println("Triangulo = " + estilo); 
    } 
} 

