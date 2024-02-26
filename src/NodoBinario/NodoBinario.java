package NodoBinario;

public class NodoBinario {
    int valor;
    NodoBinario der;
    NodoBinario izq;

    public NodoBinario(int valor) {
        this.valor = valor;
    }

    public NodoBinario(NodoBinario nodo) {
        this.valor = nodo.getValor();
        this.der = new NodoBinario(nodo.getDer());
        this.izq = new NodoBinario(nodo.getIzq());
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoBinario getDer() {
        return der;
    }

    public void setDer(NodoBinario der) {
        this.der = der;
    }

    public NodoBinario getIzq() {
        return izq;
    }

    public void setIzq(NodoBinario izq) {
        this.izq = izq;
    }


}