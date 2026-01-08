public class Factorial {

    private int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }

    public long calcularFactorial() {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
