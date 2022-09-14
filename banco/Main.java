import funcionario.Funcionario;
import usuario.Usuario;


public class  Main {

    public static void main(String[] args) {
        Usuario kalebe = new Usuario(1, "Kalebe", 1000);
        Funcionario jose = new Funcionario(1, "José", "admin");

        kalebe.consultarSaldo();
        kalebe.deposito(200);
        kalebe.consultarSaldo();
        kalebe.transferencia(100, 2);
        kalebe.consultarSaldo();

        kalebe.receberDinheiro(jose.estorno(1, 200));
        kalebe.consultarSaldo();
    }
}