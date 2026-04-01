package usuario;

public class Usuario {
    private String nome;
    private String plano;

    public Usuario(String nome, String plano) {
        this.nome = nome;
        this.plano = plano;
    }

    public String getNome() {
        return this.nome;
    }

    public String getPlano() {
        return this.plano;
    }
}
