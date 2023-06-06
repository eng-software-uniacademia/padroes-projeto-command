import java.util.ArrayList;
import java.util.List;

public class FolhaPonto {
    private List<ITarefa> tarefas = new ArrayList<>();

    public void executarTarefa(ITarefa tarefa) {
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaTarefa() {
        if (tarefas.size() != 0) {
            ITarefa tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.cancelar();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }
}
