package inteiro.modelo;

/**
 * Classe para manipulação de valores inteiros.
 * Esta classe oferece métodos para multiplicação, potência, divisão, resto e verificação de paridade.
 */
public class Inteiro {

    /**
     * Método para calcular a multiplicação de dois números inteiros usando apenas soma.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O resultado da multiplicação de a por b.
     */
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a; // soma repetida
        }
        return (b < 0) ? -resultado : resultado; // lida com números negativos
    }

    /**
     * Método para calcular a potência de um número utilizando o método de multiplicação.
     *
     * @param a A base da potência.
     * @param b O expoente da potência.
     * @return O resultado de a elevado a b.
     */
    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a); // multiplicação repetida
        }
        return resultado;
    }

    /**
     * Método para calcular a divisão de dois números inteiros usando apenas subtração.
     *
     * @param a O dividendo.
     * @param b O divisor.
     * @return O quociente da divisão de a por b.
     * @throws ArithmeticException Se o divisor for zero.
     */
    public int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        int quociente = 0;
        int soma = Math.abs(b);
        while (Math.abs(a) >= soma) {
            a = (a < 0) ? a + Math.abs(b) : a - Math.abs(b); // subtração repetida
            quociente++;
        }
        return quociente;
    }

    /**
     * Método para calcular o resto da divisão de dois números inteiros usando apenas subtração.
     *
     * @param a O dividendo.
     * @param b O divisor.
     * @return O resto da divisão de a por b.
     * @throws ArithmeticException Se o divisor for zero.
     */
    public int resto(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        while (Math.abs(a) >= Math.abs(b)) {
            a = (a < 0) ? a + Math.abs(b) : a - Math.abs(b); // subtração repetida
        }
        return a;
    }

    /**
     * Método para verificar se um número é par.
     *
     * @param a O número a ser verificado.
     * @return true se o número for par, false caso contrário.
     */
    public boolean par(int a) {
        return resto(a, 2) == 0; // verifica se o resto da divisão por 2 é zero
    }
}
