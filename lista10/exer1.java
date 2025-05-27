public class exer1{

     public static void contCaracteres(String texto) {
        System.out.println("numero de caracteres = " + texto.length());
        int totalVogais = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                totalVogais++;
            }
        }

        System.out.println("numero de vogais = " + totalVogais);
    }

    public static void main(String args[]){
        contCaracteres("palavra");
    }
}

