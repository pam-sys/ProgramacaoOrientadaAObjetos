package exer3;

public class AppCarro {
    public static void main(String ListaDeagumentos[]){
        Motor m1 = new Motor("3.8L V6");
        Carro c1 = new Carro("Mustang", "conversivel", "ford", m1);
        Motor m2 = new Motor("Zatec Roçam 1.0");
        Carro c2 = new Carro("ka", "Popular", "Ford", m2);
        Motor m3 = new Motor("2.4 Ecotec");
        Carro c3 = new Carro("captiva", "SUV", "chevrolet", m3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    
}
