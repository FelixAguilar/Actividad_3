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
