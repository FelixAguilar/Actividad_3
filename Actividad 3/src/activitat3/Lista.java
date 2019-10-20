package activitat3;

/**
 *
 * @author Felix Aguilar Ferrer, Adrian Bennassar Polzin, Alvaro Bueno Lopez.
 */
public class Lista {
    
    // Nodo al que paunta la lista.
    private Nodo primer;
    
    
    // Constructor de la lista.
    public Lista(){
        primer = null;
    }
    
    /**
     * Elimina un elemento dado por el puntero element.
     * 
     * @param element 
     */
    public void ejercicio2Apartado1(Nodo element) {
        
        // Creamos un puntero auxiliar que apunte al primer nodo.
        Nodo aux;
        aux = primer;
        
        // Si el primer elemento es el que se ha de borrar se saca de la lista.
        if (primer == element) {
            primer = element.getSiguiente();
        }else {
            
            // Si no se realiza una buesqueda del nodo.
            while (aux.getSiguiente() != element) {
                aux = aux.getSiguiente();
            }
            
            // una vez encontrado se saca de la pila.
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
    }
    
    /**
     * Devuelve un puntero del primer elemento que tenga el mismo valor de info
     * que el parametro introducido.
     * 
     * @param info
     * @return 
     */
    public Nodo ejercicio2Apartado2(int info){
        
        // Creamos un puntero auxiliar que apunte al primer elemento.
        Nodo elemento;
        elemento = primer;
        
        // Se realiza un recorrido hasta encontrar el campo info identico.
        while(elemento.getInfo() != info){
            elemento = elemento.getSiguiente();
        }
        
        // Se devuelve el puntero.
        return elemento;
    }
    
    /**
     * Elimina el elemento de la lista en la posicion k.
     * 
     * @param k 
     */
    public void ejercicio3(int k){
        
        // Si la lista esta vacia no realiza nada.
        if (primer != null) {
            
            //Si el siguiente valor es nulo entonces elimina el primer elemento.
            if (primer.getSiguiente() == null) {
                primer = null;
            } else {
                
                // Si no se realiza un recorrido hasta el elemento k-1.
                int n = 0;
                Nodo aux = primer;
                while (n < k - 2) {
                    aux = aux.getSiguiente();
                    n++;
                }
                
                // Se elimina el elemento k.
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
        }
    }
    
    /**
     * Se introduce un elemento en la posición ordenada que pertoque de la lista.
     * 
     * @param nuevo 
     */
    public void Ejercicio5 (Nodo nuevo){
        
        // Se comprueba que no este vacia la lista o que sea mayor que el primer elemento.
        if (primer != null && nuevo.getInfo() > primer.getInfo()){
            
            // Se realiza un recorrido de los elementos de la lista hasta encontrar 
            // un elemento mayor que el que se quiere introducir.
            Nodo A = primer;
            while(A.getSiguiente() != null && nuevo.getInfo() > A.getSiguiente().getInfo()){
                A = A.getSiguiente();
            }
            
            // Se introduce el elemento en su posicion.
            nuevo.setSiguiente(A.getSiguiente());
            A.setSiguiente(nuevo);
        } else {
            
            // Se introduce el elemento en el primer sitio de la lista.
            nuevo.setSiguiente(primer);
            primer = nuevo;
        }
    }
    
    /**
     * Inserta nodo al final de la lista.
     * 
     * @param nuevo 
     */
    public void insertarNodoFinal (Nodo nuevo){
        
        // Si la lista no esta vacia.
        if (primer != null){
            
            // Se recorre hasta llegar al final y se introduce el elemento alli.
            Nodo A = primer;
            while (A.getSiguiente() != null){
                A = A.getSiguiente();
            }
            A.setSiguiente(nuevo);
        } else {
            
            // Si no se introduce en el primer sitio.
            primer = nuevo;
        }
        nuevo.setSiguiente(null);
    }
    
    /**
     * Metodo que devuelve un string con todos los elementos de la lista.
     * 
     * @return 
     */
    public String ToString(){
        String s = "";
        
        // Si no esta vacio la lista.
        if (primer != null){
            int i = 0;
            // Puntero auxiliar que apunta a la primera posicion.
            Nodo A = primer;
            
            // Mientras el puntero no sea nulo se rellena el string.
            while(A != null){
                i++;
                s += "Nodo " + i + ": Info: " + A.getInfo() + "\n";
                A = A.getSiguiente();
            }
        } else {
            s = "Lista vacia.\n";
        }
        return s;
    }
 
}
