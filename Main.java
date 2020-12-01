import java.sql.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Conectando ao banco de dados... MySQL");

        String SQL_SELECT = "SELECT * FROM PESSOA";

        String NOME_BANCO = "PESSOADATABASE";
        String USUARIO = "root";
        String SENHA = "root";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/"+NOME_BANCO, USUARIO, SENHA);
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

            System.out.println("Executando a consulta...");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                long id = resultSet.getInt("ID");
                String nome = resultSet.getString("NOME");
                int idade = resultSet.getInt("IDADE");
                System.out.println("\tID: " + id + ", NOME: " + nome + ", IDADE: " + idade);
            }

        } catch (SQLException e) {
            System.err.format("Não foi possível conectar ao banco de dados: SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            System.err.format("Ocorreu um erro:\n%s", e.getMessage());
            e.printStackTrace();
        }
    }

}
