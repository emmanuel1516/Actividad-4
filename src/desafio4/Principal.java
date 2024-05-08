
package desafio4;

import java.util.Arrays;
import java.util.List;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * a) La ejecución de este stream retorna los valores que contengan 
         *    la letra c y que estén ordenados y en mayúsculas.
         */
        List<String> myList = Arrays.asList("a1", "b1", "c2", "c1");
        myList.stream()
        .filter(s -> s.startsWith("c"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);

        /**
         *  b) Los streams en Java son secuencias de elementos que permiten 
         *     realizar operaciones secuenciales o paralelas en colecciones de datos. 
         *     Proporcionan una forma más elegante y funcional de trabajar con conjuntos de datos, 
         *     permitiendo operaciones como filtrado, mapeo, reducción, ordenación, entre otros. 
         *     Los streams facilitan la escritura de código más legible, conciso y eficiente.
         * 
         */
        
        /**
         * c) Suma los cuadrados de lo los números pares.
         */
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumaCuadradoPares = numeros.stream()
                                     .filter(num -> num % 2 == 0) // Filtra los pares.
                                     .mapToInt(num -> num * num)  // Ordena los cuadrados en Int.
                                     .sum();                      // Suma los cuadrados de los pares.
        
        // Mostrar el resultado de la suma
        System.out.println(sumaCuadradoPares);
        
    }

}
