/**
 * American.java
 * Memodelkan kewarganegaraan amerika
 * @author [NIM] [Nama]
 */

public class American extends Citizenship {
    private String state;

    public American(String surname, String givenName, String state) {
        super(surname, givenName);
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    @Override
    public void speak() {
        // Mencetak "Hello buddy!" diakhiri newline
        System.out.println("Hello buddy!");
    }
}