public class Veiculo {
    String modelo;
    double preco;

    Veiculo(String n, double p){
        this.modelo=n;
        this.preco=p;
    }

    double getPreco(){
        return preco;
    }

    void printDados(){
        System.out.println(this);
    }

    public String toString() {
        return "Modelo: " + modelo + " | Preço: " + preco;
    }
}
