package funcionario;

import java.util.Objects;

public abstract class Funcionario {
    protected int id;
    protected String nome;
    protected String role;

    protected Funcionario(int id, String nome, String role) {
        setId(id);
        setNome(nome);
        setRole(role);
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }

    private void setRole(String role) {
        String[] roles = {"admin", "user"};
        for (int i = 0; i < roles.length; i++) {
            if (Objects.equals(roles[i], role)){
                this.role = role;
            }
        }
    }

    public abstract  String getRole();

    public abstract boolean login(String nome);

}