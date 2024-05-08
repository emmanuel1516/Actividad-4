
package desafio1;



public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //a)
        // Realizar direntes pruebas con los valores de a y b
        System.out.println(dividir(4,2));
        System.out.println(dividir(8,2));
        System.out.println(dividir(10,5));
        
        //b)
        // Realizar prueba con b = 0 --> Esto da un error aritmético ya que no se puede dividir por 0.
        // Error => Exception in thread "main" java.lang.ArithmeticException: / by zero
        //System.out.println(dividir(1,0));
        
        
        //c)
        // Modificamos el método dividir a dividirModificado
        System.out.println(dividirModificado(2,0));
        
        //d)
        // Agregamos try-catch
        try{
            System.out.println(dividir(2,0));
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        
    }
    
    
    /**
     * 
     * @param a dividendo
     * @param b divisor
     * @return la división a/b
     */
    public static int dividir (int a, int b){
        return a/b;  
    }
    
    //c)
    /**
     * Este método lo que hace es evitar el error aritmético ya que si b es 0 retornamos directamente 0 y no la división. 
     * 
     * @param a dividendo
     * @param b divisor
     * @return la división de a/b o 0
     */
    public static int dividirModificado (int a, int b){
        if(b == 0){
            return 0;
        }else{
            return a/b;
        }
        
    }    
    
    
    
    
    
}
