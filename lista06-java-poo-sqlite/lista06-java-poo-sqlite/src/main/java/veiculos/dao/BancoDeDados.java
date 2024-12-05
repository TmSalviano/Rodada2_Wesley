package veiculos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {

    private static final String URL = "jdbc:sqlite:veiculos.db";

    /**
     * Inicializa o banco de dados e cria a tabela "veiculos" se ela não existir.
     */
    public static void inicializarBanco() {
        String sql = """
                    CREATE TABLE IF NOT EXISTS veiculos (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        marca TEXT NOT NULL,
                        modelo TEXT NOT NULL,
                        numero_chassi TEXT UNIQUE NOT NULL,
                        placa TEXT UNIQUE NOT NULL,
                        cor TEXT NOT NULL
                    );
                """;

        try (Connection conn = DriverManager.getConnection(URL);
                Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("Banco de dados e tabela 'veiculos' inicializados com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao inicializar o banco de dados: " + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}