public class NoStudentByIDException extends Exception {
    public NoStudentByIDException(String message, String id) {
        super(message);
        System.err.println(id);
    }
}
