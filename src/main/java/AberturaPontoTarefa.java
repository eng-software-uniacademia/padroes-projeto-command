public class AberturaPontoTarefa implements ITarefa {
    private final Ponto ponto;

    public AberturaPontoTarefa(Ponto ponto) {
        this.ponto = ponto;
    }

    @Override
    public void executar() {
        this.ponto.abrirPonto();
    }

    @Override
    public void cancelar() {
        this.ponto.fecharPonto();
    }
}
