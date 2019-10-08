/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat3;

/**
 *
 * @author Adrián
 */
public class Nodo {
    
    private int info;
    private Nodo siguiente;
    
    public Nodo(int datos){
        info = datos;
        siguiente = null;
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

    public Nodo getSiguiente() {
        return siguiente;
    }
    
    
    
}
