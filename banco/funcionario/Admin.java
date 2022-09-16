package funcionario;

import java.util.Objects;

public class Admin extends Funcionario {
    
    public Admin(int id, String nome, String role) {
        super(id, nome, role);
    }

    public String getRole() {
        return this.role;
    }

    private String getNome() {
        return this.nome;
    }

    public boolean login(String nome) {
        String testingName = nome.toLowerCase();
        System.out.println(testingName);

        if (Objects.equals(testingName, getNome())){
            return true;
        }
        return false;
    }
}