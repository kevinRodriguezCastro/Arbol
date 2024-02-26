package Ejercicio2;

import Grafo.NodoGrafo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NodoGrafo nodo0 = new NodoGrafo(0);
        NodoGrafo nodo1 = new NodoGrafo(1);
        NodoGrafo nodo2 = new NodoGrafo(2);
        NodoGrafo nodo3 = new NodoGrafo(3);
        NodoGrafo nodo4 = new NodoGrafo(4);
        NodoGrafo nodo5 = new NodoGrafo(5);
        NodoGrafo nodo6 = new NodoGrafo(6);
        NodoGrafo nodo7 = new NodoGrafo(7);

        //Con las flechas de direccion
        nodo0.addVecino(nodo1);
        nodo0.addVecino(nodo5);

        nodo1.addVecino(nodo5);

        nodo2.addVecino(nodo0);
        nodo2.addVecino(nodo4);
        nodo2.addVecino(nodo3);

        nodo3.addVecino(nodo7);
        nodo3.addVecino(nodo4);

        nodo4.addVecino(nodo6);

        nodo5.addVecino(nodo2);
        nodo5.addVecino(nodo4);

        nodo6.addVecino(nodo3);
        nodo6.addVecino(nodo7);



        encontrarCaminoGrafo(nodo0,nodo7);
        System.out.println("\n\n\n\n");
        encontrarCaminoGrafo2(nodo0,nodo7);
    }

    public static void encontrarCaminoGrafo(NodoGrafo actual,NodoGrafo meta){
        System.out.println(actual.getValor());
        for (NodoGrafo tmp : actual.getVecinos()){
            if (tmp == meta){
                System.out.println(tmp.getValor());
                return;
            }
        }
        int n = (int)(actual.getVecinos().size()*Math.random());
        encontrarCaminoGrafo(actual.getVecino(n),meta);
    }

    static ArrayList<NodoGrafo> nodosVisitados = new ArrayList<>();
    public static void encontrarCaminoGrafo2(NodoGrafo actual,NodoGrafo meta){
        System.out.println(actual.getValor());
        nodosVisitados.add(actual);
        if (actual != meta){
            for (NodoGrafo tmp : actual.getVecinos()){
                if (!nodosVisitados.contains(tmp)) {
                    encontrarCaminoGrafo2(tmp, meta);
                }
            }
        }
    }

}
