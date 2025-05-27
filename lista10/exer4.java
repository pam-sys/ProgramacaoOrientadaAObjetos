public class exer4 {
    public static String processar(String s){
        if(s==null)
            return null;
        else
            return s.toUpperCase();  
    }

     public static void main(String args[]){
            System.out.print(processar("palavra"));
    }
}
