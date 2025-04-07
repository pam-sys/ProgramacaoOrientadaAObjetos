package exer2;

public class Turma {
        private String curso;
        private String disciplina;
    
        public Turma(String curso){
            this.curso=curso;
        }
    
        public String getCurso(){
            return curso;
        }
    
        public void setCurso(String curso){
            this.curso=curso;
        }
    
        public String getDisciplina(){
            return disciplina;
        }

        public void setDisciplina(String disciplina){
            this.disciplina=disciplina;
        }

        void exibeDados(){
            System.out.println(this.curso + " " + this.disciplina);
        }
        
    
}
