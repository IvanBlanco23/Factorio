import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero no negativo: ");
        int n = sc.nextInt();

        Factorial f = new Factorial(n);
        long resultado = f.calcularFactorial();

        System.out.println("El factorial de " + n + " es: " + resultado);
    }
}
