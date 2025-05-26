package exer7;

public class Livro extends Produto{
    protected String autor;

    public Livro(String nome, double preco, String autor){
        super(nome, preco);
        this.autor=autor;
    }

    @Override
     public String toString(){
        return "Livro [nome = " + nome + "; preco = " +preco+ "; autor = " +autor +"]";
    }
    
    
}
