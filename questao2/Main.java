package questao2;

public class Main {
    public static void main(String[] args) {
        int permanencia = 150; 

        System.out.println("Mesmo tempo (" + permanencia + " min) nos tres perfis:");
        Ticket t1 = new Ticket("AAA-1111", permanencia, new Rotativo());
        Ticket t2 = new Ticket("BBB-2222", permanencia, new Mensalista());
        Ticket t3 = new Ticket("CCC-3333", permanencia, new Conveniado());
        System.out.println("Rotativo   : R$ " + String.format("%.2f", t1.calcularValor()));
        System.out.println("Mensalista : R$ " + String.format("%.2f", t2.calcularValor()));
        System.out.println("Conveniado : R$ " + String.format("%.2f", t3.calcularValor()));

        System.out.println();
        System.out.println("Troca de perfil no mesmo ticket (" + permanencia + " min):");
        Ticket ticket = new Ticket("DDD-4444", permanencia, new Rotativo());
        System.out.println("Rotativo   : R$ " + String.format("%.2f", ticket.calcularValor()));
        ticket.setPerfil(new Mensalista());
        System.out.println("Mensalista : R$ " + String.format("%.2f", ticket.calcularValor()));
        ticket.setPerfil(new Conveniado());
        System.out.println("Conveniado : R$ " + String.format("%.2f", ticket.calcularValor()));
    }
}
