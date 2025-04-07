public class Conta { 
    private double saldo; 

    public Conta (double saldoInicial) { 
        if (saldoInicial > 0.0) 
        saldo = saldoInicial; 
        else 
        saldo = 0.0; 
    } 

    public double getSaldo() { 
        return saldo; 
    } 

    public void creditar (double quantia) { 
        saldo += quantia; 
    } 
    
    public void debitar(double quantiaDeb){
        if(quantiaDeb>saldo){
            System.out.println("quantidade excedeu ");
        }else{
            saldo = saldo-quantiaDeb;
        }

    }
    } 