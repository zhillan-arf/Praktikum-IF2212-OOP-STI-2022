/**
 * Citizenship.java
 * Kelas abstrak dari kewarganegaraan
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

public abstract class Citizenship {
    private String surname;
    private String givenName;

    public Citizenship(String surname, String givenName) {
        this.surname = surname;
        this.givenName = givenName;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public abstract void speak();
}