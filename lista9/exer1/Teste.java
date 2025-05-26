package exer1;

public class Teste {
    public static void main(String args[]){
        ContaCorrente conta1 = new ContaCorrente(10.00);
        ContaCliente conta2 = new ContaCliente(10.00);

        conta1.depositar(2.00);
        conta1.sacar(3.00);

        conta2.depositar(2.00);
        conta2.sacar(3.00);
        
        System.err.println(conta1);
        System.err.println(conta2);
        
   
    }
    
}
