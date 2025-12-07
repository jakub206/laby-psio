import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CzujnikTemperatury {
    int id;
    String lokalizacja;
    double wartoscOstatniegoOdczytu;
    Random random = new Random();

    public CzujnikTemperatury(int id, String lokalizacja, double wartoscPoczatek) {
        this.id = id;
        this.lokalizacja = lokalizacja;
        this.wartoscOstatniegoOdczytu = wartoscPoczatek;
    }

    public void odczyt(){
        wartoscOstatniegoOdczytu = random.nextDouble()*60;
        System.out.println("Czujnik "+id+" "+lokalizacja+": "+wartoscOstatniegoOdczytu+" °C");
    }

    public boolean czyPrzegrzany(){
        return wartoscOstatniegoOdczytu > 50;
    }

    public static void main(String[] args) throws InterruptedException {
        CzujnikTemperatury c1 = new CzujnikTemperatury(1,"Sypialnia",25.0);
        CzujnikTemperatury c2 = new CzujnikTemperatury(2,"Łazienka", 21.0);

        while (!c2.czyPrzegrzany()){
            c2.odczyt();
        }
        System.out.println("Czujnik 2 przegrzany!");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            c1.odczyt();
            TimeUnit.SECONDS.sleep(5);
        }

    }
}
