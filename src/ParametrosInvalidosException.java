public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Os parâmetros fornecidos são inválidos.");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
