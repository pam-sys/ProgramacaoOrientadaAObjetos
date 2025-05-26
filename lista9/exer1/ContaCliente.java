package exer1;

public class ContaCliente extends ContaCorrente{

     public ContaCliente(double Saldo){
        super(Saldo);
    }
    
    @Override
    public double taxa(double Saque){
        return Saque*0.01;
    }
    
}
