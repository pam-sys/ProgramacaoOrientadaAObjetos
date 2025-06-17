package exer1;
public class Produto{
    protected String nome;
    protected double valor;

    public Produto(String n, double v){
        nome=n;
        valor=v;
    }

    @Override
    public String toString() {
        return ("nome: "+ nome + ", valor: " + valor);
    }
}