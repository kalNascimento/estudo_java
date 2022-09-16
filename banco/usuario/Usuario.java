package usuario;

import sistema.Sistema;

public class Usuario {
    private String nome;
    private String cpf;
    private double saldo;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    private void setSaldo(double saldo) {
        if ( saldo > 0) {
            this.saldo = saldo;
        }
        if ( saldo <= 0 ) {
            this.saldo = this.saldo + 0;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposito(double valor) {
        setSaldo(valor);
    }

    public String transferencia(double valor, int id) {
        if (saldo > valor) {
            saldo = getSaldo();
            saldo = saldo - valor;
            setSaldo(saldo);
            Sistema.storage(id, valor);
            
            return String.format("Cliente: %s%nTransferiu: %.2f%nPara: %d%n%n", this.nome, valor, id);
        }

        return "Saldo insuficiente\n";
    }

    public String receberDinheiro(double valor) {
        saldo = getSaldo() + valor;
        setSaldo(saldo);
        return String.format("Você recebeu %.0f%n%n", valor);
    }
}