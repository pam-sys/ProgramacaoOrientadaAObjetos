public class Pedido{
    int numero;
    Cliente cliente;
    Veiculo veiculo;

    Pedido(int n, Cliente c, Veiculo v){
        numero=n;
        cliente=c;
        veiculo=v;
    }

    void printDados(){
        System.out.println("Pedido #" + numero + " | Cliente: " + cliente + " | Veículo: " + veiculo);
    }
}