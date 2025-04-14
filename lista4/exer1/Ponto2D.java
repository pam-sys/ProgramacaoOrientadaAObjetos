package exer1;
public class Ponto2D { 
    private double x, y; 
    private static int cont=0;

    public Ponto2D(){
        this.x=0;
        this.y=0;
    }

    public Ponto2D(double x, double y){
        this.x=x;
        this.y=y;

        ++cont;
    }

    public double getX() { 
        return x; 
    } 
    public double getY() { 
        return y; 
    } 
    public static int getCont(){
        return cont; 
    } 
} 