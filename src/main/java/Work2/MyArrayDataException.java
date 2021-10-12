package Work2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super("Проблема в элементе ["+i+"]["+j+"]");
    }
}
