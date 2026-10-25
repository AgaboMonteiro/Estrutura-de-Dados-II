
public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int matricula;

    //construtor
    public Aluno (String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getnome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula (int matricula){
        this.matricula = matricula;
    }

    //comparação pela matricula
    @Override 
    public int compareTo(Aluno outro){
        return Integer.compare(this.matricula, outro.matricula);
    }

    //igualdade pela matricula
    @Override 
    public boolean equals (Object obj){
        if(this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Aluno outro = (Aluno) obj;
        return this.matricula == outro.matricula;
    }

    // Representação textual do aluno
    @Override
    public String toString() {
        return "[Matrícula: " + matricula
                + " - Nome: " + nome + "]";
    }





}
