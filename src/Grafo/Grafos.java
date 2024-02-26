package Grafo;

import java.util.ArrayList;
import java.util.Arrays;

public class Grafos{
    static ArrayList<NodoGrafo> visitados = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<NodoGrafo> grafo = new ArrayList<>();


        grafo.add(new NodoGrafo(1));
        grafo.add(new NodoGrafo(2));
        grafo.add(new NodoGrafo(3));
        grafo.add(new NodoGrafo(4));
        grafo.add(new NodoGrafo(5));
        grafo.add(new NodoGrafo(6));
        grafo.add(new NodoGrafo(7));

        grafo.get(0).addVecino(grafo.get(1));
        grafo.get(0).addVecino(grafo.get(5));

        grafo.get(1).addVecino(grafo.get(0));
        grafo.get(1).addVecino(grafo.get(4));
        grafo.get(1).addVecino(grafo.get(2));

        grafo.get(2).addVecino(grafo.get(1));
        grafo.get(2).addVecino(grafo.get(5));
        grafo.get(2).addVecino(grafo.get(6));
        grafo.get(2).addVecino(grafo.get(3));

        grafo.get(3).addVecino(grafo.get(2));
        grafo.get(3).addVecino(grafo.get(6));
        grafo.get(3).addVecino(grafo.get(4));

        grafo.get(4).addVecino(grafo.get(1));
        grafo.get(4).addVecino(grafo.get(3));

        grafo.get(5).addVecino(grafo.get(0));
        grafo.get(5).addVecino(grafo.get(6));
        grafo.get(5).addVecino(grafo.get(2));

        grafo.get(6).addVecino(grafo.get(5));
        grafo.get(6).addVecino(grafo.get(2));
        grafo.get(6).addVecino(grafo.get(3));

        recorrer(grafo.get(0));
    }
    public static void recorrer(NodoGrafo n){
        if (!visitados.contains(n)) {
            visitados.add(n);
            for (NodoGrafo tmp : n.getVecinos()) {
                recorrer(tmp);
            }
            System.out.println(n.getValor());
        }
    }
}
