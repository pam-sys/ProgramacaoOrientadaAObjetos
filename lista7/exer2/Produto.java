package exer2;

public class Produto {
  protected String nome;
  protected double preco;

  public Produto(String nome){
    this.nome = nome;
    this.preco = 1.0;
  }

  public Produto(double preco){
    this.nome = "nào tem nome";
    this.preco = preco;
  }

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public boolean ehCaro() {
    if(preco > 50.0)
        return true;
    else 
        return false;
  }

  public void imprimir() {
    System.out.println("Nome = " + nome + ", preco = " + preco);
  }

}