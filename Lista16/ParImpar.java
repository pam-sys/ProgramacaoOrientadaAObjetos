public class ParImpar {
    public static void main(String args[]) {
        int num;
        try {
            num = Integer.parseInt(args[0]); 
            if ((num % 2) == 0)
                System.out.println("Número par");
            else
                System.out.println("Número ímpar");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: nenhum número foi fornecido como argumento.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: o argumento deve ser um número inteiro.");
        }
    }
}