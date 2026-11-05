package questao3;


public class CaldaDecorator extends CondimentDecorator {
    public CaldaDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Calda";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 2.5;
    }
}
