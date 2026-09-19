public class Candidato implements Comparable<Candidato> {

    private String nome;
    private double nota;

    public Candidato(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Candidato outro) {

        // 1º critério: maior nota primeiro
        int comparacaoNota = Double.compare(outro.nota, this.nota);

        if (comparacaoNota != 0) {
            return comparacaoNota;
        }

        // 2º critério: nome em ordem alfabética
        return this.nome.compareToIgnoreCase(outro.nome);
    }

    @Override
    public String toString() {
        return nome + " - " + String.format("%.1f", nota);
    }
}