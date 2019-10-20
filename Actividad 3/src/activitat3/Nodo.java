package activitat3;

/**
 *
 * @author Felix Aguilar Ferrer, Adrian Bennassar Polzin, Alvaro Bueno Lopez.
 */
public class Nodo {
    
    // Atributos de los nodos y puntero al siguiente elemento.
    private int info;
    private Nodo siguiente;
    
    public Nodo(int datos){
        info = datos;
        siguiente = null;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo apuntador){
        siguiente = apuntador;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }     
}
