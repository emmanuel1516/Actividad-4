
package desafio2;

import java.util.ArrayList;
import java.util.List;

public class ColaDeTrabajo {
    
    // Atributos
    private String nombre;
    private boolean estadoCola;
    private List<Trabajo> colaTrabajos;
    
    // Constructor
    // Inicializacion por defecto en el constructor dcscc
    /**
     * 
     * @param nombre único parametro que debemos ingrear
     */
    public ColaDeTrabajo(String nombre){
        this.nombre = nombre;
        this.estadoCola = false;
        this.colaTrabajos = new ArrayList<Trabajo>();
    }
    
    // Métodos
    /**
     * 
     * @param trabajo es el trabajo que agregamos
     */
    public void encolarTrabajo(Trabajo trabajo){
        colaTrabajos.add(trabajo);
    }
    
    /**
     * 
     * @return el proximotrabajo a procesar
     * @throws NoListaException si la cola no está lista para retornar trabajos
     * @throws SinTrabajoEnColaException si no hay trabajos en la cola
     */
    public Trabajo sacar() throws NoListaException, SinTrabajoEnColaException {
        
        // Verificar si la cola está lista
        if(!estadoCola){
            throw new NoListaException(nombre, colaTrabajos.size());
        }
        
        // Verificar que la cola no esté vacía
        if(colaTrabajos.isEmpty()){
            throw new SinTrabajoEnColaException(nombre);
        }
        
        // Volvemos a marcar como no lista la cola
        estadoCola = false;
        
        // Retornamos el primer trabajo a procesar y lo removemos
        return colaTrabajos.remove(0);
        
    }
    
    
    // Método para marcar la cola como lista para retornar trabajos
    public void marcarLista() {
        this.estadoCola = true;
    }
    
}
