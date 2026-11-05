package questao3;


public class LeiteDecorator extends CondimentDecorator {
    public LeiteDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Leite";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 2.0;
    }
}
