package exer1.B;

public class Retangulo extends TwoDShape{


    public boolean quadrado(){
            return (this.largura==this.altura);
    }
    
    public double area() { 
        return (largura * altura); 
    } 
}
