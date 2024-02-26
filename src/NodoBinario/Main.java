package NodoBinario;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Integer> preOrden = new ArrayList<>();
    static ArrayList<Integer> inOrden = new ArrayList<>();
    static ArrayList<Integer> postOrden = new ArrayList<>();

    public static void main(String[] args) {

        NodoBinario puntero;

        NodoBinario raiz = new NodoBinario(1);
        raiz.setIzq(new NodoBinario(2));
        raiz.setDer(new NodoBinario(5));
        puntero = raiz.getIzq();
        puntero.setDer(new NodoBinario(3));
        puntero.getDer().setIzq(new NodoBinario(4));

        puntero = raiz.getDer();
        puntero.setIzq(new NodoBinario(6));
        puntero.setDer(new NodoBinario(7));

        recorrerRecursivo(raiz);

    }


    public  static void recorrerBucle(NodoBinario raiz){
        ArrayList<NodoBinario> nodosPendientes = new ArrayList<>();
        nodosPendientes.add(raiz);

        while (!nodosPendientes.isEmpty()){
            NodoBinario n =  nodosPendientes.get(0);
            System.out.println(n.getValor());
            nodosPendientes.remove(0);

            if (n.getIzq() != null)nodosPendientes.add(n.getIzq());

            if (n.getDer() != null) nodosPendientes.add(n.getDer());
        }
    }
    /*
    public static void recorrerRecursivo(Nodo.Nodo n){
       // System.out.println(n.getValor()); // preorden
        if (n.getIzq() != null)recorrerRecursivo(n.getIzq());
        //System.out.println(n.getValor()); // inorden
        if (n.getDer() != null) recorrerRecursivo(n.getDer());
       // System.out.println(n.getValor()); //postorden
    }*/
    public static void recorrerRecursivo(NodoBinario n){
        if (n != null){
            preOrden.add(n.getValor());
            // System.out.println(n.getValor()); // preorden
            recorrerRecursivo(n.getIzq());
            inOrden.add(n.getValor());
            //System.out.println(n.getValor()); // inorden
            recorrerRecursivo(n.getDer());
            postOrden.add(n.getValor());
            // System.out.println(n.getValor()); //postorden
        }
    }
}