package exer1;

public class ContaCorrente{
    private double saldo;

    // public ContaCorrente(double Deposito, double Saque, double Saldo){
    public ContaCorrente(double Saldo){
        this.saldo=Saldo;
    }

    public void depositar(double Deposito){
        saldo=Deposito+saldo;
    }

    public double sacar(double saque){
        saldo=saldo-saque;
        saldo = saldo - taxa(saque);
        return saldo;
    }
    
    public double taxa(double Saque){
        return Saque*0.05;
    }

    @Override
    public String toString() {

        return "saldo: "+saldo;
    }

}