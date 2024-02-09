public class ejercicio1 {
    public static void main(String[] args) {
        imprimirPrimos(10);
    }

    public static void imprimirPrimos(int cantidad) {
        int contador = 0;
        int numero = 2;

        while (contador < cantidad) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
