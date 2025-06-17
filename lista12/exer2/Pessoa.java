package exer2;

public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String n, int id){
        nome=n;
        idade=id;
    }

    @Override
    public String toString() {
        return ("nome: "+ nome + ", idade: " + idade);
    }
}
