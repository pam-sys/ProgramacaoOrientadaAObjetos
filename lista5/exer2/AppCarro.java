package exer2;

public class AppCarro {
    public static void main(String ListaDeagumentos[]){
        Bancos b1 = new Bancos("a");
        Motor m1 = new Motor("3.8L V6");
        Carro c1 = new Carro("Mustang", "conversivel", "ford", m1, b1);
        Bancos b2 = new Bancos("b");
        Motor m2 = new Motor("Zatec Roçam 1.0");
        Carro c2 = new Carro("ka", "Popular", "Ford", m2, b2);
        Bancos b3 = new Bancos("c");
        Motor m3 = new Motor("2.4 Ecotec");
        Carro c3 = new Carro("captiva", "SUV", "chevrolet", m3, b3);

        System.out.println(c1.getFabricante() + " " + c1.getMarca() + " " + c1.GetModelo() + " " + c1.getTipoMotor() + " " + c1.getFabricanteBancos());
        System.out.println(c2.getFabricante() + " " + c2.getMarca() + " " + c2.GetModelo() + " " + c2.getTipoMotor() + " " + c2.getFabricanteBancos());
        System.out.println(c3.getFabricante() + " " + c3.getMarca() + " " + c3.GetModelo() + " " + c3.getTipoMotor() + " " + c3.getFabricanteBancos());
    }
    
}
