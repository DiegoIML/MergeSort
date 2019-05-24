
package algoritmomergesort;

/**
 * @author Diego Miranda
 * @version 1.0
 * clase MergeSort basada en CRLS que ejecuta el algoritmo MergeSort
 * está conformado por los métodos merge y mergeSort.
 */

public class MergeSort {
      
    private int[] A;
     
   //////////////////////////////////////////////CONSTRUCTOR///////////////////////////////////////////////////// 
    /**
     * @author Diego Miranda
     * @version 1.0
     * Constructor para la clase MergeSort.
     * @param A  : array unidimensional de números enteros
     */  
    public MergeSort( int[] A) {
         this.A = A;
         
    }
 
    /////////////////////////////////////////////MÉTODO MERGE/////////////////////////////////////////////////////
    
    /**
     * @author Diego Miranda
     * @version 1.0
     * Método merge para realizar la unión entre los elementos del array.
     * @param A array del tipo especifico
     * @param p indice inicial
     * @param q indice particion
     * @param r indice final
     */
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public void merge (int[] A  , int p , int q , int r) {
         int n1 = q - p + 1;
         int n2 = r - q;
         int[] R = new int[n2 + 1];
         int[] L = new int[n1 + 1];
         for (int i = 0 ; i < n1 ; i++) {
            L[i] = A[p + i];
         }
         for (int j = 0 ; j < n2 ; j++) {
            R[j] = A[q + j + 1]; 
         }
         L[n1] = Integer.MAX_VALUE;
         R[n2] = Integer.MAX_VALUE;
         int i = 0;
         int j = 0;
         for ( int k = p ; k <= r  ; k ++) {
                 if (L[i] <= R[j]) {
                     A[k] = L[i];
                     i++;
                 }
                 else {
                     A[k] = R[j];
                     j++;
                 }
         }
    }
   
    //////////////////////////////////////MÉTODO MERGESORT////////////////////////////////////////////////
    /**
     * @author Diego Miranda
     *  @version 1.0
     * Método para realizar la división del array en 2 mitades de manera recursiva y posterioremente su unión.
     * @param A: array unidimensional de números enteros.
     * @param p: indice inicial del array o sub-array.
     * @param r: indice final del array o sub-array.
     */
    public void mergeSort(int[] A  , int p , int r) {
        if ( p < r) {
           int q  = (int)( (p+r)/2 ); 
           mergeSort(A , p , q);
           mergeSort(A , q+1 , r);
           merge(A , p , q , r );
        
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * @author Diego Miranda
     * @version 1.0
     *  Imprimir los elementos del array A.  
     */
    public void imprimirOrdenamiento () {
        for (int i = 0 ; i < A.length ; i++ ) {
              System.out.print(" " + A[i] + " " );
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}


