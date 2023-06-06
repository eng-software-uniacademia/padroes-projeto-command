import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FolhaPontoTest {
    FolhaPonto folhaPonto;
    Ponto ponto;

    @BeforeEach
    void setUp() {
        folhaPonto = new FolhaPonto();
        ponto = new Ponto("Zé");
    }

    @Test
    void deveAbrirPonto() {
        ITarefa aberturaPonto = new AberturaPontoTarefa(ponto);
        folhaPonto.executarTarefa(aberturaPonto);

        assertEquals("Aberto", ponto.getSituacao());
    }

    @Test
    void deveFecharPonto() {
        ITarefa fechamentoPonto = new FechamentoPontoTarefa(ponto);
        folhaPonto.executarTarefa(fechamentoPonto);

        assertEquals("Fechado", ponto.getSituacao());
    }

    @Test
    void deveCancelarFechamentoPonto() {
        ITarefa aberturaPonto = new AberturaPontoTarefa(ponto);
        ITarefa fechamentoPonto = new FechamentoPontoTarefa(ponto);

        folhaPonto.executarTarefa(aberturaPonto);
        folhaPonto.executarTarefa(fechamentoPonto);

        folhaPonto.cancelarUltimaTarefa();

        assertEquals("Aberto", ponto.getSituacao());
    }

}
