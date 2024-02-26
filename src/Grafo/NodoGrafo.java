package Grafo;

import java.util.ArrayList;

public class NodoGrafo {
    int valor;
    private ArrayList<NodoGrafo> vecinos;

    public NodoGrafo(int valor) {
        this.valor = valor;
        this.vecinos = new ArrayList<>();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArrayList<NodoGrafo> getVecinos() {
        return vecinos;
    }

    public void setVecinos(ArrayList<NodoGrafo> vecinos) {
        this.vecinos = vecinos;
    }
    public void addVecino(NodoGrafo nodo){
        this.vecinos.add(nodo);
    }
    public NodoGrafo getVecino(int indice){
        return this.vecinos.get(indice);
    }
}
