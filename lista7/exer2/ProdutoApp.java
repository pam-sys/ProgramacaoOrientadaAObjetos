package exer2;

public class ProdutoApp {
  public static void main(String[] args) {
    Produto produto1 = new Produto("produto1", 100.0);
    Produto produto2 = new Produto("produto2", 50.0);
    System.out.println((produto1.ehCaro()) ? "caro" : "barato");
    System.out.println((produto2.ehCaro()) ? "caro" : "barato");

    Livro livro1 = new Livro(200, "autorLivro1", 150, "nomeLivro1");
    Livro livro2 = new Livro(100, "autorLivro2", 100, "nomeLivro2");
    System.out.println((livro1.ehExtenso()) ? "extenso" : "curto");
    System.out.println((livro2.ehExtenso()) ? "extenso" : "curto");


    produto1.imprimir();
    produto2.imprimir();

    livro1.imprimir();
    livro2.imprimir();
  }
}