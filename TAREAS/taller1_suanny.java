public class taller1_suanny {

    public static void main(String[] args) {
        int[] arreglo = {3, 4, 7, 10, 2, 5, 8, 12};
        int inicio = 0;
        int mitad = 3;
        int fin = 7;

        System.out.println("Método de fusión");

        System.out.println("Arreglo original:");
        imprimir(arreglo);

        fusionar(arreglo, inicio, mitad, fin);

        System.out.println("Arreglo luego de fusionar:");
        imprimir(arreglo);
    }

    public static void fusionar(int[] datos, int ini, int med, int fin) {
        int tamIzq = med - ini + 1;
        int tamDer = fin - med;

        int[] izq = new int[tamIzq];
        int[] der = new int[tamDer];

        for (int i = 0; i < tamIzq; i++)
            izq[i] = datos[ini + i];

        for (int j = 0; j < tamDer; j++)
            der[j] = datos[med + 1 + j];

        int i = 0, j = 0, k = ini;

        while (i < tamIzq && j < tamDer) {
            if (izq[i] <= der[j]) {
                datos[k++] = izq[i++];
            } else {
                datos[k++] = der[j++];
            }
        }

        while (i < tamIzq) {
            datos[k++] = izq[i++];
        }

        while (j < tamDer) {
            datos[k++] = der[j++];
        }
    }

    public static void imprimir(int[] arr) {
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
