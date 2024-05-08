
package desafio3;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear data bag y elementos nuevos
        DataBag dataBag = new DataBag();
        Elemento1 elemento1 = new Elemento1();
        Elemento1 elemento2 = new Elemento1();
        /*
        // Remover elemento en bolsa vacia
       try{
            System.out.println(dataBag.remove());
        }catch(EmptyDataBagException e){
            System.out.println(e.getMessage());
        }
       */
        
        // Agregar elementos al data bag
        try{
            dataBag.add(elemento1);
            dataBag.add(elemento2);
            dataBag.add(3.14);
            dataBag.add(true);
            dataBag.add(5);
            dataBag.add(6);
            dataBag.add(7);
            dataBag.add(8);
        }catch(FullDataBagException e){
            System.out.println(e.getMessage());
        }
        
        
        
         // Agregar mas elementos al data bag
        try{
            
            dataBag.add(9);
            dataBag.add(10);
            dataBag.add(11);
           
        }catch(FullDataBagException e){
            System.out.println(e.getMessage());
        }
        
        
        // Remover elemento en data bag con elementos
        try{
            System.out.println(dataBag.remove());
            System.out.println(dataBag.remove());
            System.out.println(dataBag.remove());
            System.out.println(dataBag.remove());
        }catch(EmptyDataBagException e){
            e.getMessage();
        }
      
    }
    
}
