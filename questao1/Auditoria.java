package questao1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria extends Observer {
    private List<String> registros = new ArrayList<>();

    
    public Auditoria(Produto produto) {
        this.produto = produto;
        this.produto.attach(this);
    }

    @Override
    public void update() {
        registros.add("Produto " + produto.getNome() + " - nova quantidade: " + produto.getQuantidade());
    }

    public List<String> getRegistros() {
        return registros;
    }
}
