//NAMA  :Aldi Lesmana 
//NIM   :10117108    
//KELAS :IF-3

/**
 *
 * @author Aldi Lesmana
 */
public class Emas {
    public int hargaGram;
   public double beratEmas;

    public int getHargaGram() {
        return hargaGram;
    }

    public void setHargaGram(int hargaGram) {
        this.hargaGram = hargaGram;
    }

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }
   
   public double perhitungan(int hargaGram, double beratEmas) {
       
       return hargaGram * beratEmas ;
       
   }
    
}