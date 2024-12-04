package gerenciamento;

/**
 * Classe que representa um tempo no formato de horas, minutos e segundos.
 * Não permite atribuição direta aos atributos e aceita apenas valores válidos.
 */
public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Construtor padrão (sem parâmetros).
     * Define o tempo como 0:0:0.
     */
    public Tempo() {
        this(0, 0, 0);
    }

    /**
     * Construtor com o parâmetro hora.
     * Define o tempo como hora:0:0.
     *
     * @param hora Hora a ser definida (0-23).
     */
    public Tempo(int hora) {
        this(hora, 0, 0);
    }

    /**
     * Construtor com os parâmetros hora e minuto.
     * Define o tempo como hora:minuto:0.
     *
     * @param hora Hora a ser definida (0-23).
     * @param minuto Minuto a ser definido (0-59).
     */
    public Tempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    /**
     * Construtor com os parâmetros hora, minuto e segundo.
     * Define o tempo como hora:minuto:segundo.
     *
     * @param hora Hora a ser definida (0-23).
     * @param minuto Minuto a ser definido (0-59).
     * @param segundo Segundo a ser definido (0-59).
     */
    public Tempo(int hora, int minuto, int segundo) {
        setTime(hora, minuto, segundo);
    }

    /**
     * Define o tempo de uma só vez, aceitando hora, minuto e segundo.
     *
     * @param hora Hora a ser definida (0-23).
     * @param minuto Minuto a ser definido (0-59).
     * @param segundo Segundo a ser definido (0-59).
     * @throws IllegalArgumentException se algum valor for inválido.
     */
    public void setTime(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    /**
     * Define a hora.
     *
     * @param hora Hora a ser definida (0-23).
     * @throws IllegalArgumentException se o valor for inválido.
     */
    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida. Deve estar entre 0 e 23.");
        }
        this.hora = hora;
    }

    /**
     * Retorna a hora.
     *
     * @return Hora atual.
     */
    public int getHora() {
        return hora;
    }

    /**
     * Define o minuto.
     *
     * @param minuto Minuto a ser definido (0-59).
     * @throws IllegalArgumentException se o valor for inválido.
     */
    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido. Deve estar entre 0 e 59.");
        }
        this.minuto = minuto;
    }

    /**
     * Retorna o minuto.
     *
     * @return Minuto atual.
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Define o segundo.
     *
     * @param segundo Segundo a ser definido (0-59).
     * @throws IllegalArgumentException se o valor for inválido.
     */
    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Segundo inválido. Deve estar entre 0 e 59.");
        }
        this.segundo = segundo;
    }

    /**
     * Retorna o segundo.
     *
     * @return Segundo atual.
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Retorna uma representação do tempo no formato "h:m:s".
     *
     * @return String no formato "h:m:s".
     */
    public String getTempoFormatado() {
        return String.format("%d:%d:%d", hora, minuto, segundo);
    }
}
