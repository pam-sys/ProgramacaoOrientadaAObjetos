package exer2;

public class Funcionario extends Pessoa{
    protected double salario;

    public Funcionario(String n, int id, double s){
        super(n, id);
        salario = s;
    }

    @Override
    public String toString() {
        return (super.toString() + ", salario: " + salario);
    }
}
