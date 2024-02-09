import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "Ingrese una palabra para comprobar si es palindromo o no:");
        String palabra = s.nextLine();
        esPalindromo(palabra);
        s.close();
    }

    public static void esPalindromo(String str) {
        String palabraInvertida = invertirString(str.toLowerCase());

        if (str.equalsIgnoreCase(palabraInvertida)) {
            System.out.println(str + " si es un palindromo.");
        } else {
            System.out.println(str + " no es un palindromo.");
        }
    }

    public static String invertirString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}