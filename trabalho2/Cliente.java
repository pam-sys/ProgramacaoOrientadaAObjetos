public class Cliente {
    String nome;
    String cpf;

    Cliente(String n, String c){
        nome=n;
        cpf=c;
    }

    void printDados(){
        System.out.println(this);
    }

    public String toString() {
        return "Nome: " + nome + " | CPF: " + cpf;
    }
}
