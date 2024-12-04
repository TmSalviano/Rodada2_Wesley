public class Divisao {
    // Método estático para realizar a divisão
    public static int dividir(int dividendo, int divisor) throws ArithmeticException {
        // Verifica se o divisor é zero
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        // Verifica se o dividendo é negativo
        if (dividendo < 0) {
            throw new ArithmeticException("O dividendo não pode ser negativo!");
        }
        // Retorna o resultado da divisão
        return dividendo / divisor;
    }
}
