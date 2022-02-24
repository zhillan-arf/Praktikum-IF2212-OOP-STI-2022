/**
 * CitizenPrinter.java
 * Mencetak informasi Citizenship dan kelas turunannya 
 * (American, Japanese, Indonesian) dari beberapa warga
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */
import java.util.ArrayList;
import java.util.List;

public class CitizenPrinter {
    private List<Citizenship> citizenshipList = new ArrayList<Citizenship>();

    /**
     * Add Citizen. Menambahkan citizenship ke array
     * 
     * @param citizenship objek Citizenship
     */
    public void addCitizen(Citizenship citizenship) {
        // Tambahkan citizenship ke list, gunakan metode add dari java.util.List
        citizenshipList.add(citizenship);
    }
    
    /**
     * Get Citizenship. Getter dari citizenshipList
     */
    public List<Citizenship> getCitizenshipList() {
        return citizenshipList;
    }

    /**
     * Print Citizenship List. Cetak informasi dan lakukan aksi dari citizenship yang ada.  
     */
    public void printCitizenshipList() {
        for (Citizenship citizenship : this.citizenshipList) {
            // Lengkapi Print Citizenship List, hint: 
            // - gunakan instanceof untuk mengetahui tipe dari objek
            // - gunakan type casting untuk memanggil metode kelas turunan
            if (citizenship instanceof American) {
                American cAM = (American) citizenship;
                // Cetak Kewarganegaraan
                System.out.println("American");
                // Cetak nama
                System.out.println(cAM.getSurname() + " " + cAM.getGivenName());
                // Cetak speak
                cAM.speak();
                // Cetak khusus
                System.out.println(cAM.getState());
            }
            else if (citizenship instanceof Indonesian) {
                Indonesian cID = (Indonesian) citizenship;
                // Cetak Kewarganegaraan
                System.out.println("Indonesian");
                // Cetak nama
                System.out.println(cID.getSurname() + " " + cID.getGivenName());
                // Cetak speak
                cID.speak();
                // Cetak khusus
                cID.speakLocalLanguage();
            }
            else if (citizenship instanceof Japanese) {
                Japanese cJP = (Japanese) citizenship;
                // Cetak Kewarganegaraan
                System.out.println("Japanese");
                // Cetak nama
                System.out.println(cJP.getSurname() + " " + cJP.getGivenName());
                // Cetak speak
                cJP.speak();
                // Cetak khusus
                System.out.println(cJP.getFavouriteAnime());
                
            }
        }
    }
}