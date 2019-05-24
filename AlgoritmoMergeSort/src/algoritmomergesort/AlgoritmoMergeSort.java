package algoritmomergesort;

/**
 * @author Diego Miranda 
 * @version 1.0
 */

public class AlgoritmoMergeSort {

      /**
     * @author Diego Miranda
     * @version 1.0
     * Método main para testear el algoritmo MergeSort.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int []  A = { 4 , 3 , 2, 1 };
           MergeSort ordenamiento = new MergeSort(A);
           ordenamiento.mergeSort(A,0,3);
           ordenamiento.imprimirOrdenamiento();
    }
    
}
