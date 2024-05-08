
package desafio2;


public class NoListaException extends Exception {
    
    // Atributos
    private String nombre;
    private long cantidadTrabajos;
    
    /**
     * Constructor
     * 
     * @param nombre nombre de la lista.
     * @param cantidadTrabajos cantidad de trabajos que va a tener la lista.
     */
    public NoListaException (String nombre, long cantidadTrabajos){
        this.nombre = nombre;
        this.cantidadTrabajos = cantidadTrabajos;
    }
    
    /**
     * 
     * @return mensaje de la excepción.
     */
    @Override
    public String getMessage(){
        return "La cola de Trabajo: " + nombre + " no está disponible. Cantidad de trabajos a procesar: " + cantidadTrabajos;      
    }
}
