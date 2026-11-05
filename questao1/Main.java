package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);
        Compras compras = new Compras(notebook);
        Vendas vendas = new Vendas(notebook);
        Auditoria auditoria = new Auditoria(notebook);

        System.out.println("Estoque 10 -> 8");
        notebook.setQuantidade(8);
        System.out.println("Estoque 8 -> 4 (abaixo de 5)");
        notebook.setQuantidade(4);
        System.out.println("Estoque 4 -> 4 (sem mudanca, nada acontece)");
        notebook.setQuantidade(4);
        System.out.println("Estoque 4 -> 0 (zerou)");
        notebook.setQuantidade(0);
        System.out.println("Estoque 0 -> 6 (voltou ao estoque)");
        notebook.setQuantidade(6);

        System.out.println("Removendo a area de Compras");
        notebook.detach(compras);
        System.out.println("Estoque 6 -> 2 (Compras nao recebe mais)");
        notebook.setQuantidade(2);

        System.out.println("Registros da Auditoria:");
        for (String registro : auditoria.getRegistros()) {
            System.out.println(registro);
        }
    }
}
