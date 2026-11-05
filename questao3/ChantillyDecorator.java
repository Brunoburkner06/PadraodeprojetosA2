package questao3;


public class ChantillyDecorator extends CondimentDecorator {
    public ChantillyDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Chantilly";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 3.5;
    }
}
