package exer3;

public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;

    Carro(String marca, String modelo, String fabricante, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        
    }
    
    @Override
    public String toString(){
        return "Carro [marca = " + marca + ", modelo = " + modelo + ", fabricante = " + fabricante + ", motor = " + motor +"]";
    }

}
