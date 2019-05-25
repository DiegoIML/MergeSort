
package algoritmomergesort;

/**
 * @author Diego Miranda
 * @version 1.1
 * clase MergeSort basada en CRLS que ejecuta el algoritmo MergeSort
 * está conformado por los métodos merge y mergeSort.
 */

public class MergeSort {
      
    private int[] A;
    private int[] B;
    int numeroRotaciones;
    int numeroComparaciones;
    long tiempoEjecucion;
           
    ////////////////////////////////////////MÉTODO SET TIEMPO EJECUCIÓN////////////////////////////////////
    /**@author Diego Miranda.
     * @version 1.1
     * método set para entregar el tiempo en milisegundos que tardo mergesort en ejecutarse.
     * @param tiempoEjecucion : tiempo en milisegundos  
     */
    public void setTiempoEjecucion(long tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }
    
   //////////////////////////////////////////////CONSTRUCTOR///////////////////////////////////////////////////// 
    /**
     * @author Diego Miranda
     * @version 1.1
     * Constructor para la clase MergeSort.
     * asignamos a los atributos privados A y B el valor del array A
     * e inicializamos los demas atributos por defecto.
     * @param A  : array unidimensional de números enteros.
     */  
    public MergeSort( int[] A) {
         this.A = A;
         this.B =A;
         numeroRotaciones = 0;
         numeroComparaciones = 0;
         tiempoEjecucion = 0;
    }
 
    /////////////////////////////////////////////MÉTODO MERGE/////////////////////////////////////////////////////
    /**
     * @author Diego Miranda
     * @version 1.1
     * Método merge para realizar la unión entre los elementos del array.
     * @param B array del tipo especifico
     * @param p indice inicial
     * @param q indice particion
     * @param r indice final
     */
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public void merge (int[] B  , int p , int q , int r) {
         int n1 = q - p + 1;
         int n2 = r - q;
         int[] R = new int[n2 + 1];
         int[] L = new int[n1 + 1];
         for (int i = 0 ; i < n1 ; i++) {
            L[i] = B[p + i];
         }
         for (int j = 0 ; j < n2 ; j++) {
            R[j] = B[q + j + 1]; 
         }
         L[n1] = Integer.MAX_VALUE;
         R[n2] = Integer.MAX_VALUE;
         int i = 0;
         int j = 0;
         for ( int k = p ; k <= r  ; k ++) {
                 numeroComparaciones++;
                 if (L[i] <= R[j]) {
                     B[k] = L[i];
                     i++;
                 }
                 else {
                     B[k] = R[j];
                     j++;
                 }
                numeroRotaciones++;
         }
    }
   
    //////////////////////////////////////MÉTODO MERGESORT////////////////////////////////////////////////
    /**
     * @author Diego Miranda
     *  @version 1.1
     * Método para realizar la división del array en 2 mitades de manera recursiva y posterioremente su unión.
     * @param B: array unidimensional de números enteros.
     * @param p: indice inicial del array o sub-array.
     * @param r: indice final del array o sub-array.
     */
    public void mergeSort(int[] B  , int p , int r) {
        if ( p < r) {
           int q  = (int)( (p+r)/2 ); 
           mergeSort(B , p , q);
           mergeSort(B , q+1 , r);
           merge(B , p , q , r );
        }
    }
    ////////////////////////////////////////MÉTODO IMPRIMIR ORDENAMIENTO ////////////////////////////
    /**
     * @author Diego Miranda
     * @version 1.1
     *  Imprimir los elementos del array A y B.  
     */
    public void imprimirOrdenamiento () {
        System.out.println("\nArray Inicial : ");
        for (int i = 0 ; i < A.length ; i++) {
             System.out.print(" " + A[i] + " ");
        }
        System.out.println("\nArray Ordenado : ");
        for (int i = 0 ; i < B.length ; i++ ) {
              System.out.print(" " + B[i] + " " );
        }
    }
    ////////////////////////////////////////MÉTODO IMPRIMIR INFORMACIÓN/////////////////////////////////
    /**
     *  @author Diego Miranda
     *  @version 1.1
     *  Imprimir la información acerca de la ejecución del algoritmo.
     *  para que el tiempo de ejecución sea diferente de 0 debe llamarse primero
     *  al método setTiempoEjecución.
     */
    public void imprimirInformacion () {
       System.out.println("Información de la ejecución actual del algoritmo : ");
       System.out.println("Número de rotaciones : " + numeroRotaciones);
       System.out.println("Número de comparaciones : " + numeroComparaciones);
       System.out.println("Tiempo de ejecucion en milisegundo : " + tiempoEjecucion );
       System.out.println("Tiempo de ejecucion en segundos : " + tiempoEjecucion/1000);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
}


