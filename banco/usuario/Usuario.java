package usuario;

public class Usuario {
    private String nome;
    private double saldo;
    //private int id;

    public Usuario(int id, String nome, double saldo) {
        //this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        this.saldo = this.saldo + valor;
        System.out.printf(String.format("deposito de: %.2f, realizado com sucesso%n%n", valor));
    }

    public void transferencia(double valor, int id) {
        if (saldo > valor) {
            System.out.printf(String.format("Cliente: %s%nTransferiu: %.2f%nPara: %d%n%n", this.nome, valor, id));
            this.saldo = this.saldo - valor;
        }
        if (saldo < valor) {
            System.out.println("Saldo insuficiente\n");
        }
    }

    public void receberDinheiro(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println(String.format("Você recebeu %.0f%n%n", valor));
    }

    public void consultarSaldo() {
        System.out.printf(String.format("Seu saldo é de: %.2f%n%n", this.saldo));
    }
}