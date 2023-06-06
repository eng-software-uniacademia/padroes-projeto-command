public class FechamentoPontoTarefa implements ITarefa {
    private final Ponto ponto;

    public FechamentoPontoTarefa(Ponto ponto) {
        this.ponto = ponto;
    }

    @Override
    public void executar() {
        this.ponto.fecharPonto();
    }

    @Override
    public void cancelar() {
        this.ponto.abrirPonto();
    }
}
