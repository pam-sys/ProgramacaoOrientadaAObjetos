
import java.util.Scanner;

public class Teste{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[3];
        int totalClientes = 0;
        Pedido[] pedidos = new Pedido[3];
        int totalPedidos = 0;

        System.out.println("Cadastro de Cliente");
        if (totalClientes < clientes.length) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            Cliente cliente = new Cliente(nome, cpf);
            clientes[totalClientes++] = cliente;

            boolean continuar = true;
            int numeroPedido = 1;

         while (continuar && totalPedidos < pedidos.length) {
             System.out.println("\nEscolha o tipo de veículo para pedido:");
             System.out.println("1 - Carro");
             System.out.println("2 - Moto");
             System.out.println("0 - Sair");
             int opcao = sc.nextInt();
             sc.nextLine(); 

                if (opcao == 1) {
                    System.out.print("Modelo do carro: ");
                    String modelo = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    Carro carro = new Carro(modelo, preco, ano);
                    Pedido pedido = new Pedido(numeroPedido++, cliente, carro);
                    pedidos[totalPedidos++] = pedido;
                    System.out.println("Pedido de carro realizado!");
                } else if (opcao == 2) {
                    System.out.print("Modelo da moto: ");
                    String modelo = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.print("KM: ");
                    double km = sc.nextDouble();
                    sc.nextLine();
                    Moto moto = new Moto(modelo, preco, km);
                    Pedido pedido = new Pedido(numeroPedido++, cliente, moto);
                    pedidos[totalPedidos++] = pedido;
                    System.out.println("Pedido de moto realizado!");
                } else if (opcao == 0) {
                    continuar = false;
                } else {
                    System.out.println("Opção inválida!");
                }
         }
          System.out.println("\nDados do Cliente:");
            cliente.printDados();

            System.out.println("\nPedidos realizados:");
            for (int i = 0; i < totalPedidos; i++) {
                pedidos[i].printDados();
            }
        } else {
            System.out.println("Limite de clientes atingido!");
        }

        sc.close();
    
    }   
}
