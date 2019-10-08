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
public class Lista {
    
    private Nodo primer;
    
    public Lista(){
        primer = null;
    }
    
    public void ejercicio2Apartado1(Nodo element){
            Nodo aux;
            aux = primer;
            while(aux.getSiguiente() != element){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
    
    public Nodo ejercicio2Apartado2(int info){
        Nodo elemento;
        elemento = primer;
        while(elemento.getInfo() != info){
            elemento = elemento.getSiguiente();
        }
        return elemento;
    }
    
    public void ejercicio3(int k) throws ExcepcionListaVacia {
        int n = 0;
        Nodo aux = primer;
        // si la lista esta vacía
        if (primer == null) {
            throw new ExcepcionListaVacia();
        } else if (primer.getSiguiente() == null) {
            primer = null;
        } else {
            while (n < k - 2) {
                primer = primer.getSiguiente();
                n++;
            }
                primer.setSiguiente(primer.getSiguiente().getSiguiente());
            }

        }
    
    public void Ejercicio5 (Nodo nuevo){
        if (nuevo.getInfo()>primer.getInfo() && primer != null) {
            Nodo A = primer;
            while(nuevo.getInfo()> A.getSiguiente().getInfo()){
                A = A.getSiguiente();
            }
            nuevo.setSiguiente(A.getSiguiente());
            A.setSiguiente(nuevo);
        }
        else{
            nuevo.setSiguiente(primer);
            primer.setSiguiente(nuevo);
        }
    }
    
    
    
    public String ToString(){
        String s = "";
        
        return s;
    }
    
    // Métodos de eliminación, inserción, etc
 
}
