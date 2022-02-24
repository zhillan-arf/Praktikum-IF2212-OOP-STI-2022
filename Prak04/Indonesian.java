/**
 * Indonesian.java
 * Memodelkan penduduk indon
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

public class Indonesian extends Citizenship {
    private IndonesianLocalLanguage localLanguage;

    public Indonesian(String surname, String givenName, IndonesianLocalLanguage localLanguage) {
        // Konstruktor
        super(surname, givenName);
        this.localLanguage = localLanguage;
    }
    
    public IndonesianLocalLanguage getLocalLanguage() {
        // Mengembalikan atribut 
        return this.localLanguage;
    }

    public void speakLocalLanguage() {
        // jika localLanguage adalah JAVANESE, mencetak "Nami Kulo Tuan Mal" diakhiri newline
        
        // jika localLanguage adalah SUNDANESE, mencetak "Nepangkeun wasta sim kuring Tuan Mal" diakhiri newline
        
        if (this.getLocalLanguage() == IndonesianLocalLanguage.JAVANESE) {
            System.out.println("Nami Kulo Tuan Mal");
        }
        else {
            System.out.println("Nepangkeun wasta sim kuring Tuan Mal");
        }
    }

    @Override
    public void speak() {
        // Mencetak "Halo, aku Tuan Mal" diakhiri newline
        System.out.println("Halo, aku Tuan Mal");
    }
}
