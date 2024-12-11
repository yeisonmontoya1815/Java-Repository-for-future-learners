import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        header();
    }

    public static void header() {
        System.out.println("hello, welcome to my party!\n");
        Scanner input = new Scanner(System.in);
        int c = -1; // Inicializar c con un valor no válido.

        System.out.print(
                "escoja '0' para multiplicar numeros, '1' para mostrar numeros, or '2' para cerrar el programa: \n");

        // Manejar excepciones para entradas no válidas
        try {
            c = input.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada no válida. Por favor, introduzca un número.");
            System.out.println("****************************************\n");
            header();
        }

        // Comprobar el valor de c y llamar a las funciones correspondientes
        if (c == 0) {
            TheNumbers();
        } else if (c == 1) {
            Otro();
        } else if (c == 2) {
            System.out.println("\nCerrando el programa. ¡Adiós! ...");
            return; // Termina el programa
        } else {
            System.out.println("Número no válido. Por favor, elija '0', '1' o '2'.");
            System.out.println("****************************************\n");
            header();
        }
    }

    public static void TheNumbers() {
        Scanner input = new Scanner(System.in);
        float a;
        int b;

        System.out.print("num 1: ");
        a = input.nextFloat();

        System.out.print("num 2: ");
        b = input.nextInt();

        float TheMultip = a * b;
        System.out.println("result: " + TheMultip);
        System.out.println("****************************************\n");
        header();
    }

    public static void Otro() {
        int a = 4;
        float b = 8.7f;
        int c = 7;

        float sum = (float) (a + b);
        System.out.println("result: " + sum);

        float multipliying = (float) (a * c);

        System.out.println("****************************************\n");
        System.out.println("result: " + multipliying);
        System.out.println("****************************************\n");

        header();
    }
}
