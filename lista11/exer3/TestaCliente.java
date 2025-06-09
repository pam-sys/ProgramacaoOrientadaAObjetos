package exer3;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[2];
        clientes[0] = new Cliente();
        clientes[1] = new ClienteEspecial();

        double valorCompra = 100.0;

        for (int i = 0; i < clientes.length; i++) {
            double valorComDesconto = clientes[i].calcularDesconto(valorCompra);
            System.out.println("Cliente " + (i + 1) + " pagará: R$ " + valorComDesconto);
        }
    }
}
