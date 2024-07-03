package controle;

public class InvalidoException extends Exception {
    public InvalidoException() {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }
}

