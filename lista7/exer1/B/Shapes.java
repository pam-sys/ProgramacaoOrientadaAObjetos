package exer1.B;

public class Shapes {
    public static void main(String[] args) { 
        Retangulo t1 = new Retangulo(); 
        Retangulo t2 = new Retangulo(); 

        t1.largura = 4.0; 
        t1.altura = 4.0; 
        t2.largura = 8.0; 
        t2.altura = 12.0; 

        System.out.println("Info para t1: "); 
        t1.mostraDim(); 
        System.out.println("Area = " + t1.area()); 
        System.out.println("quadrado? " + t1.quadrado()); 
        System.out.println("Info para t2: ");  
        t2.mostraDim(); 
        System.out.println("Area = " + t2.area()); 
         System.out.println("quadrado? " + t2.quadrado()); 

    }
    
}
