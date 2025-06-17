public class Moto extends Veiculo{
    double km;

    Moto(String n, double p, double k){
        super(n, p);
        this.km=k;
    }

    @Override
    public String toString() {
        return super.toString() + " | KM: " + km;
    }

}
