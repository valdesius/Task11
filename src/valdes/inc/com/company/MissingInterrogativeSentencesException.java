package valdes.inc.com.company;

public class MissingInterrogativeSentencesException extends Exception {
    public MissingInterrogativeSentencesException() {
        System.err.println("Не найдено ни одного вопросительного предложения!");
        System.out.println("The program is completed.");
    }

    public MissingInterrogativeSentencesException(String message) {
        super(message);
    }

    public MissingInterrogativeSentencesException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingInterrogativeSentencesException(Throwable cause) {
        super(cause);
    }
}
