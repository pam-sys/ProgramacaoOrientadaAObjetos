public class Exercicio1 { 
    public static void main(String[] args) { 
        int[] vetor = new int[] { 2, 4, 6, 8, 10, 12 }; 
        for (int i = 0; i < 12; i++) 
        System.out.println(vetor[i]); 
        

        try{
            for (int i = 0; i < 12; i++) 
            System.out.println(vetor[i]);  
        }

        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("fim do vetor!");
        }

    }
}