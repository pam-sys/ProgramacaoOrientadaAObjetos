public class Carro extends Veiculo {
    int ano;

    Carro(String n, double p, int a){
        super(n, p);
        this.ano=a;
    }

     @Override
    public String toString() {
        return super.toString() + " | Ano: " + ano;
    }
}

