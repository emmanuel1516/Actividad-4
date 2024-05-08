
package desafio2;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoListaException, SinTrabajoEnColaException {
        
        
        
        // Crear nuevos trabajos
        Trabajo trabajo1 = new Trabajo1();
        Trabajo trabajo2 = new Trabajo2();
        
        // Crear la cola de trabajos
        ColaDeTrabajo colaDeTrabajo = new ColaDeTrabajo("Cola 1");
        
        
        
        // Probar cuando esta vacía
        try{
        System.out.println(colaDeTrabajo.sacar());
        } catch (NoListaException e) {
            System.out.println(e.getMessage());
            // Manejar la excepción cuando la cola no está lista
        } catch (SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
            // Manejar la excepción cuando no hay trabajos en la cola
        }
        
        
        // Agregar Trabajos a la cola.
        colaDeTrabajo.encolarTrabajo(trabajo1);
        colaDeTrabajo.encolarTrabajo(trabajo2);
        
        // Marcar el estado de la cola como lista.
        colaDeTrabajo.marcarLista();
        
        
        // Probar sacar el primero para procesarlo
        try{
        System.out.println(colaDeTrabajo.sacar());
        } catch (NoListaException e) {
            System.out.println(e.getMessage());
            // Manejar la excepción cuando la cola no está lista
        } catch (SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
            // Manejar la excepción cuando no hay trabajos en la cola
        }
        
        // Probar sacar el segundo para procesarlo cuando no esta lista
        try{
            // Mostrar el trabajo a procesar
            System.out.println(colaDeTrabajo.sacar());
        
        } catch (NoListaException e) {
            System.out.println(e.getMessage());
            // Manejar la excepción cuando la cola no está lista
        } catch (SinTrabajoEnColaException e) {
            System.out.println(e.getMessage());
            // Manejar la excepción cuando no hay trabajos en la cola
        }
    }
    
}
