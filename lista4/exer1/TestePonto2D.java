package exer1;
public class TestePonto2D {

    public static void main(String[] args){
        Ponto2D a1 = new Ponto2D(1,2);
        System.out.printf("coordenada x: %.2f\n", a1.getX());
        System.out.printf("coordenada y: %.2f\n", a1.getY());
        System.out.printf("contador: %d\n", Ponto2D.getCont());
        Ponto2D a2 = new Ponto2D(2,3);
        System.out.printf("coordenada x: %.2f\n", a2.getX());
        System.out.printf("coordenada y: %.2f\n", a2.getY());
        System.out.printf("contador: %d", Ponto2D.getCont());
    }
}
