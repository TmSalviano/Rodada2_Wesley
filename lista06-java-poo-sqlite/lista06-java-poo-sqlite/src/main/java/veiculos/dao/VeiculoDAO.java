package veiculos.dao;

import veiculos.modelo.Veiculo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável pelo acesso aos dados dos veículos no banco de dados.
 */
public class VeiculoDAO {
    private static final String URL = "jdbc:sqlite:veiculos.db";

    public VeiculoDAO() {
        criarTabela();
    }

    /**
     * Cria a tabela de veículos no banco de dados.
     */
    private void criarTabela() {
        String sql = """
                    CREATE TABLE IF NOT EXISTS Veiculo (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        marca TEXT,
                        modelo TEXT,
                        numeroChassi TEXT,
                        placa TEXT,
                        cor TEXT
                    );
                """;

        try (Connection conn = DriverManager.getConnection(URL);
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Insere um novo veículo no banco de dados.
     * 
     * @param veiculo veículo a ser inserido.
     */
    public void inserir(Veiculo veiculo) {
        String sql = "INSERT INTO Veiculo (marca, modelo, numeroChassi, placa, cor) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, veiculo.getMarca());
            pstmt.setString(2, veiculo.getModelo());
            pstmt.setString(3, veiculo.getNumeroChassi());
            pstmt.setString(4, veiculo.getPlaca());
            pstmt.setString(5, veiculo.getCor());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retorna a lista de veículos cadastrados.
     * 
     * @return lista de veículos.
     */
    public List<Veiculo> listar() {
        List<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM Veiculo";

        try (Connection conn = DriverManager.getConnection(URL);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setNumeroChassi(rs.getString("numeroChassi"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setCor(rs.getString("cor"));
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return veiculos;
    }

    /**
     * Atualiza as informações de um veículo no banco de dados.
     * 
     * @param placa   placa do veículo a ser atualizado.
     * @param veiculo novo objeto Veiculo com os dados atualizados.
     */
    public void atualizar(String placa, Veiculo veiculo) {
        String sql = "UPDATE Veiculo SET marca = ?, modelo = ?, numeroChassi = ?, cor = ? WHERE placa = ?";

        try (Connection conn = DriverManager.getConnection(URL);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, veiculo.getMarca());
            pstmt.setString(2, veiculo.getModelo());
            pstmt.setString(3, veiculo.getNumeroChassi());
            pstmt.setString(4, veiculo.getCor());
            pstmt.setString(5, placa);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Remove um veículo do banco de dados.
     * 
     * @param placa placa do veículo a ser removido.
     */
    public void excluir(String placa) {
        String sql = "DELETE FROM Veiculo WHERE placa = ?";

        try (Connection conn = DriverManager.getConnection(URL);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, placa);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
