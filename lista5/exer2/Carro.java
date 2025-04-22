package exer2;

public class Carro {
    
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Bancos bancos;

    Carro(String marca, String modelo, String fabricante, Motor motor, Bancos bancos){
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.bancos = bancos;
    }

    public String getMarca(){
        return marca;
    }
    
    public String GetModelo(){
        return modelo;
    }
 
    public String getFabricante(){
        return fabricante;
    }
    
    public String getTipoMotor(){
        return motor.getTipo();
    }

    public String getFabricanteBancos(){
        return bancos.getFabricante();
    }
}
