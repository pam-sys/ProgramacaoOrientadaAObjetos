package exer3;

public class ClienteEspecial extends Cliente {
    @Override
    public double calcularDesconto(double valor){
        return valor-valor*0.2;
    }
}
