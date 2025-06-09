import java.util.Random;

import exer4.Veiculo;

public class UsaOficina {
    public static void main(String[] args) {
        Oficina oficina = new Oficina();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            Veiculo veiculo;

            if (random.nextBoolean()) {
                veiculo = new Automovel();
            } else {
                veiculo = new Bicicleta();
            }

            System.out.println("Consertando veículo " + (i + 1) + ":");
            oficina.consertar(veiculo);
            System.out.println();
        }
    }
}
