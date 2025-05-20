package exer1.D;

public class Retangulo extends TwoDShape{


    public boolean quadrado(){
            return (getAltura()==getLargura());
    }
    
    public double area() { 
        return (getLargura() * getAltura()); 
    } 
}