package questao1;

public class Vendas extends Observer {
    private boolean zerou = false;

    
    public Vendas(Produto produto) {
        this.produto = produto;
        this.produto.attach(this);
    }

    @Override
    public void update() {
        if (produto.getQuantidade() == 0) {
            zerou = true;
        } else if (zerou) {
            System.out.println("[Vendas] ALERTA: " + produto.getNome()
                    + " voltou ao estoque: " + produto.getQuantidade());
            zerou = false;
        }
    }
}
