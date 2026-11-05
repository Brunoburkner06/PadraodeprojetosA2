package questao1;

import java.util.ArrayList;
import java.util.List;


public class Produto {
    private List<Observer> observers = new ArrayList<>();
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

   
    public void setQuantidade(int quantidade) {
        if (this.quantidade != quantidade) {
            this.quantidade = quantidade;
            notifyAllObservers();
        }
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
