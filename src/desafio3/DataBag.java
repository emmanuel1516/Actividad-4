
package desafio3;

import java.util.ArrayList;
import java.util.List;


public class DataBag {

    // Atributos
    private static final int MAX_DATA_BAG = 10;
    private List<Object> elementos;
    
    // Constructor
    public DataBag(){
        this.elementos = new ArrayList<>();
    }
    
    
    
    // Métodos
    /**
     * Este método agrega un elemento al Data Bag y libera una excepeción si esta lleno.
     * 
     * @param elemento el elemento que se agrega
     * @throws FullDataBagException está lleno
     */
    public void add(Object elemento) throws FullDataBagException{
        if(elementos.size() >= MAX_DATA_BAG){
            throw new FullDataBagException();
        }
        elementos.add(elemento);
    }
    
    
    /**
     * Este método remueve el ultimo elemento agregado al Data Bag y libera una excepeción si esta vacío.
     * 
     * @return el elemento eliminado
     * @throws EmptyDataBagException esta vacío
     */
    public Object remove() throws EmptyDataBagException {
        if(elementos.isEmpty()){
            throw new EmptyDataBagException();
        }
        
        return elementos.remove(elementos.size() - 1);

    }
    
    
    
}
