package blit;

public class OgrynException extends Exception {

    public static void main(String[] args) {
        try {
            writeMyName();
        } catch (OgrynException e) {
            System.out.println(e.getMessage());
        }
    }

    public OgrynException() {
        super("Gryn's exception");
    }

    public static void writeMyName() throws OgrynException {
        throw new OgrynException();
    }
}
