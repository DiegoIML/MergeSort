package algoritmomergesort;

/**
 * @author Diego Miranda 
 * @version 1.1
 */

public class AlgoritmoMergeSort {

      /**
     * @author Diego Miranda
     * @version 1.1
     * Método main para testear el algoritmo MergeSort.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int []  A = { 4 , 3 , 2, 1 };
           long tiempoInicio = 0, tiempoFinal = 0;
           MergeSort ordenamiento = new MergeSort(A);
           tiempoInicio = System.currentTimeMillis();
           ordenamiento.mergeSort(A,0,3);
           tiempoFinal = System.currentTimeMillis();
           ordenamiento.imprimirOrdenamiento();
           ordenamiento.setTiempoEjecucion(tiempoFinal - tiempoInicio); 
           ordenamiento.imprimirInformacion();
    }
    
}
