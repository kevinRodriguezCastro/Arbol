package Ejercicio1;

import Nodo.Nodo;
import NodoBinario.NodoBinario;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class Main {
    public static void main(String[] args) {
        NodoBinario raiz  = new NodoBinario(1);
        raiz.setIzq(new NodoBinario(2));
        raiz.setDer(new NodoBinario(3));
        raiz.getIzq().setIzq(new NodoBinario(4));
        raiz.getIzq().setDer(new NodoBinario(5));


        recorrer(raiz);
        copiaEspejo(raiz,0);

        System.out.println("\nCopia");
        recorrer(raizCopiado);




        // 1 es hijo izq
        // 2 es hijo derecho
        // 0 es raiz
    }
    static NodoBinario raizCopiado;
    static NodoBinario puntero;
    static void copiaEspejo(NodoBinario nodo,int hijo){
        if (nodo != null){

            if (hijo == 0){
                raizCopiado = new NodoBinario(nodo.getValor());
                puntero = raizCopiado;
            }
            if (hijo == 1){
                puntero.setIzq(new NodoBinario(nodo.getValor()));
                puntero = puntero.getIzq();
            }
            if (hijo == 2){
                puntero.setDer(new NodoBinario(nodo.getValor()));
                puntero = puntero.getDer();

            }
            copiaEspejo(nodo.getDer(),1);
            copiaEspejo(nodo.getIzq(),2);

        }
    }
    static void recorrer(NodoBinario nodo){
        if (nodo != null){
            System.out.println(nodo.getValor());
            recorrer(nodo.getIzq());
            recorrer(nodo.getDer());
        }
    }

}
