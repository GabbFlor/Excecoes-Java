public class Application {
    public static void main(String[] args) {
        UserInputValidator userInputValidator = new UserInputValidator();
        try {
            userInputValidator.validarUsuario("Gabriel", 18);

            System.out.println("Usuário válido!");

        } catch (InvalidUserInputException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        DatabaseConnector databaseConnector = new DatabaseConnector();
        try {
            databaseConnector.conectar(null); // bgl invalido

            System.out.println("Logica topi de conexao");
        } catch (DatabaseConnectionException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
