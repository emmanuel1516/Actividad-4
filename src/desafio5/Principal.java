
package desafio5;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Crear e inicializar círculo
        Circulo circulo = new Circulo(3);
        
        // Sacar área y mostrar
        System.out.println(circulo.area());
        
        // Sacar longitud y mostrar
        System.out.println(circulo.longitud());
      
        /**
         * a) No se puede cambiar el valor de PI.
         * b) No se puede cambiar ya que es un valor constante.
         */
    }
    
}
