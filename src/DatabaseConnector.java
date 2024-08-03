public class DatabaseConnector {
    public void conectar(String Conexao) {
        if (Conexao == null || Conexao.isEmpty()) {
            throw new DatabaseConnectionException("String de conexao inválida.");
        }
    }
}
