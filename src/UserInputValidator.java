public class UserInputValidator {
    public void validarUsuario(String nome, int idade) throws InvalidUserInputException {
        if (idade < 18 || idade > 120) {
            if (nome.length() > 10) {
                throw new InvalidUserInputException("Nome inválido (passou de 10 caracteres): " + nome);
            }

            throw new InvalidUserInputException("Idade inválida: " + idade);
        }
    }


}
