public class App {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; //Seleciona el elemento a insertar en su posicion correcta
            int j = i - 1;
            
            //Movemos los elementos mayores que la variable "key" a una posicion adelante de su posicion actual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            //insertamos la variable key en su posicion correcta
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Metodo de ordenamiento por insercion");

        int[] arr = {12, 47, 1, 50, 80, 63};

        System.out.println("arrelo original:");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        System.out.println("-----------------------------------");
        insertionSort(arr);//llamada al motodo de ordenamiento por insercion

        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
