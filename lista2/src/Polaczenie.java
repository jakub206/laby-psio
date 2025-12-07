public class Polaczenie {
    String nazwaBazy;
    String adresSerwera;
    int port;
    String uzytkownik;
    boolean polaczenieAktywne;

    public Polaczenie(){
        nazwaBazy = "default";
        adresSerwera = "localhost";
        port = 3306;
        uzytkownik = "root";
        polaczenieAktywne = true;
    }

    public Polaczenie(String nazwaBazy){
        this.nazwaBazy = nazwaBazy;
        adresSerwera = "localhost";
        port = 3306;
        uzytkownik = "root";
        polaczenieAktywne = true;
    }

    public Polaczenie(String nazwaBazy, String adresSerwera, int port, String uzytkownik, boolean polaczenieAktywne){
        this.nazwaBazy = nazwaBazy;
        this.adresSerwera = adresSerwera;
        this.port = port;
        this.uzytkownik = uzytkownik;
        this.polaczenieAktywne = polaczenieAktywne;
    }

    public void polacz() {
        System.out.println("Nawiązano połączenie z bazą "+nazwaBazy+" na serwerze "+adresSerwera+": "+port);
        polaczenieAktywne = true;
    }

    public void rozlacz(){
        polaczenieAktywne = false;
    }

    public static void main(String[] args){
        Polaczenie p1 = new Polaczenie();
        Polaczenie p2 = new Polaczenie("baza_uzytkownikow");
        Polaczenie p3 = new Polaczenie("baza_hasel", "192.186.4.4", 8800, "admin", true);

        p1.polacz();
        p2.polacz();
        p3.polacz();

        p1.rozlacz();
        p2.rozlacz();
        p3.rozlacz();
    }

}
