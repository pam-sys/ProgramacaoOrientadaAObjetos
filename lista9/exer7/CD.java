package exer7;

public class CD extends Produto{
    private int numFaixas;

    public CD(String nome, double preco, int numFaixas){
        super(nome, preco);
        this.numFaixas=numFaixas;
    }

    @Override
    public String toString(){
        return "CD [nome = " + nome + "; preco = " +preco+ "; numFaixas = " +numFaixas +"]";
    }
}
