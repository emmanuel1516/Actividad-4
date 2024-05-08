package desafio2;

public class SinTrabajoEnColaException extends Exception {
    
    // Atributos
    private String nombre;
    
    // Constructor
    public SinTrabajoEnColaException (String nombre){
        this.nombre = nombre;
    }
    
    /**
     * 
     * @return mensaje de la excepción.
     */
    @Override
    public String getMessage(){
        return "La cola" + nombre + " no tiene trabajos pra procesar. ";
    }
    
}
