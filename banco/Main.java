import funcionario.Admin;
import funcionario.Funcionario;
import usuario.Usuario;
import sistema.Sistema;


public class  Main {

    public static void main(String[] args) {
        Usuario kalebe = new Usuario("Kalebe", "44695439813");
        Funcionario jose = new Admin(1, "José", "admin");
        int i = 0;

        kalebe.deposito(100000);
        kalebe.transferencia(200.10, 55);
        System.out.println(Sistema.retorno(55));
    }
}