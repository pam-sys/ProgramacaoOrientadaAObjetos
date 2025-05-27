public class exer2{
    public static void palavra(String texto){
        if(texto.length()<8)
            System.out.println("erro! digite no minimo 8 caracteres");
        else{
            String text = ""+texto.charAt(0)+texto.charAt(1)+texto.charAt(texto.length()-1)+texto.charAt(texto.length()-2);

            System.out.print(text);
        }
    }
    public static void main(String args[]){
        palavra("palavras");
    }
}