public class Ponto {
    private String funcionario;
    private String situacao;

    public Ponto(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirPonto() {
        this.situacao = "Aberto";
    }

    public void fecharPonto() {
        this.situacao = "Fechado";
    }
}
