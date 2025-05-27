public class exer3 {
public static void palavra(String a, String b){
    System.out.println("EQUALS");

    if(a.equals(b))
        System.out.println("Sao iguais!");
    else
        System.out.println("Sao diferentes!");

    System.out.println("EQUALSIGNORECASE");

    if(a.equalsIgnoreCase(b))
        System.out.println("Saoiguais!");
    else
        System.out.println("Sao diferentes!");
    }

    public static void main(String args[]){
            palavra("palavra", "palavras");
    }

}
