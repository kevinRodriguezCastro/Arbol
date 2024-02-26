package Nodo;

public class Ejercicio2 {
    public static void main(String[] args) {
        Nodo raiz = new Nodo(1);
        raiz.addHijo(new Nodo(2));
        raiz.addHijo(new Nodo(3));
        raiz.addHijo(new Nodo(4));
        raiz.addHijo(new Nodo(5));

        raiz.getHijo(0).addHijo(new Nodo(6));
        raiz.getHijo(0).addHijo(new Nodo(7));

        raiz.getHijo(0).getHijo(0).addHijo(new Nodo(8));

        raiz.getHijo(1).addHijo(new Nodo(9));
        raiz.getHijo(1).addHijo(new Nodo(10));

        raiz.getHijo(3).addHijo(new Nodo(11));
        raiz.getHijo(3).addHijo(new Nodo(12));
        raiz.getHijo(3).addHijo(new Nodo(13));

        recorrerRecursivoNoBinario(raiz);
    }
    public static void recorrerRecursivoNoBinario(Nodo n){
        if (!n.getHijos().isEmpty())
            for (Nodo tmp : n.getHijos())
                recorrerRecursivoNoBinario(tmp);
        System.out.println(n.getValor()); // preorden
    }
}
