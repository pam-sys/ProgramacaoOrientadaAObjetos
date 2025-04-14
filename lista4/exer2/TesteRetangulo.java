package exer2;

public class TesteRetangulo {
    public static void main(String[] args){
    Retangulo a1 = new Retangulo();
    Retangulo a2 = new Retangulo(3, 4); 

    System.out.println("Retângulo 1:");
    a1.exibirDimensoes();

    System.out.println("\nRetângulo 2:");
    a2.exibirDimensoes();
    }
}

