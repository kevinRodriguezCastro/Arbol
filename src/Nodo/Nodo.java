package Nodo;

import java.util.ArrayList;

public class Nodo {
    private int valor;
    private ArrayList<Nodo> hijos;

    public Nodo(int valor) {
        this.valor = valor;
        hijos = new ArrayList<>();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }
    public Nodo getHijo(int indice) {
        return hijos.get(indice);
    }
    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }
    public void addHijo(Nodo nodo){
        this.hijos.add(nodo);
    }
}
