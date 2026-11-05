package questao1;

public class Compras extends Observer {
    private static final int LIMITE_ESTOQUE = 5;

    
    public Compras(Produto produto) {
        this.produto = produto;
        this.produto.attach(this);
    }

    @Override
    public void update() {
        if (produto.getQuantidade() < LIMITE_ESTOQUE) {
            System.out.println("[Compras] ALERTA: " + produto.getNome()
                    + " com estoque baixo: " + produto.getQuantidade());
        }
    }
}
