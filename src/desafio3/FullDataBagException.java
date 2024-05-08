package desafio3;

public class FullDataBagException extends Exception {
    
    /**
     * 
     * @return mensaje de la excepción.
     */
    @Override
    public String getMessage(){
        return "El Data Bag está lleno.";
    }
}
