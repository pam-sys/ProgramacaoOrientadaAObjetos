public class UsaFatura {
        public static void main(String[] args){
               
           
            Fatura a1  = new Fatura();
            a1.setNumero("1");
            a1.setDescricao("camisa de algodao");
            a1.setQtdItem(2);
            a1.setPreco(50.00);
            a1.getQtdeFatura();

            a1.exibeDados(a1.getQtdeFatura());
    
            Fatura a2  = new Fatura();
            a2.setNumero("1");
            a2.setDescricao("camisa de algodao");
            a2.setQtdItem(2);
            a2.setPreco(50.00);
            a2.getQtdeFatura();
        
        }
    
}
