package exer2;

public class Gerente extends Pessoa{
     protected double salario;
     protected double bonus;

    public Gerente(String n, int id, double s, double Bonus){
        super(n, id);
        salario = s;
        bonus = Bonus;
    }

    @Override
    public String toString() {
        return (super.toString() + ", salario: " + salario + ", bonus: " + bonus);
    }
}


