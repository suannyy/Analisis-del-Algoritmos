public class Suanny_RecursividadFibonacci {
    public static void main(String[] args) {
        int limite = 10;
        System.out.println("Sucesión de Fibonacci por recursividad:");
        System.out.println("Términos desde F(0) hasta F(" + limite + "):");

        for (int i = 0; i <= limite; i++) {
            System.out.println("F(" + i + ") = " + obtenerFibo(i));
        }
    }

    public static int obtenerFibo(int valor) {
        if (valor <= 1) return valor;
        return obtenerFibo(valor - 1) + obtenerFibo(valor - 2);
    }
}
