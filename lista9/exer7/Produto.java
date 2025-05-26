package exer7;

public class Produto { 
    protected String nome; 
    protected double preco; 
    public Produto(String nome, double preco) { 
        this.nome = nome; 
        this.preco = preco; 
    } 
    
    @Override 
    public String toString() { 
        return nome + "; R$ " + preco; 
    } 
} 
 

