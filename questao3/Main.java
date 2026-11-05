package questao3;


public class Main {
    public static void main(String[] args) {
        
        iBebida pedido1 = new Espresso();
        pedido1 = new LeiteDecorator(pedido1);

        
        iBebida pedido2 = new Cha();
        pedido2 = new CaldaDecorator(pedido2);
        pedido2 = new ChantillyDecorator(pedido2);

        
        iBebida pedido3 = new Espresso();
        pedido3 = new LeiteDecorator(pedido3);
        pedido3 = new LeiteDecorator(pedido3);
        pedido3 = new ChantillyDecorator(pedido3);

        System.out.println("Pedido 1: " + pedido1.Descricao());
        System.out.println("Total   : R$ " + String.format("%.2f", pedido1.Preco()));
        System.out.println("Pedido 2: " + pedido2.Descricao());
        System.out.println("Total   : R$ " + String.format("%.2f", pedido2.Preco()));
        System.out.println("Pedido 3: " + pedido3.Descricao());
        System.out.println("Total   : R$ " + String.format("%.2f", pedido3.Preco()));
    }
}
