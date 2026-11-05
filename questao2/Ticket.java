package questao2;


public class Ticket {
    private String placa;
    private int minutos;
    private PerfilCobranca perfil;

    public Ticket(String placa, int minutos, PerfilCobranca perfil) {
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public void setPerfil(PerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public String getPlaca() {
        return placa;
    }

    public double calcularValor() {
        return perfil.calcular(minutos);
    }
}
