package funcionario;

public class Funcionario {
    int id;
    String nome;
    String role;

    public Funcionario(int id, String nome, String role) {
        this.id = id;
        this.nome = nome;
        this.role = role;
    }

    public double estorno(int id, double valor) {
        System.out.printf(String.format("Estorno de %.2f efetuado para %d%nPelo funcionario %s%n%n", valor, id, this.nome));
        return valor;
    }
}