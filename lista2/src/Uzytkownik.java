class AdresIP{
    String adres;
    String maska;

    public AdresIP(String adres, String maska){
        this.adres=adres;
        this.maska=maska;
    }

    public String toString() {
        return adres+" / "+maska;
    }
}

public class Uzytkownik {
    String login;
    String haslo;
    Rola rola;
    AdresIP adresIP;

    public enum Rola {
        ADMIN, OPERATOR, GUEST
    }

    public Uzytkownik(String login, String haslo, Rola rola,  AdresIP adresIP) {
        this.login = login;
        this.haslo = haslo;
        this.rola = rola;
        this.adresIP = adresIP;
    }

    public void wyswietlDane(){
        System.out.println("Login: "+login+", rola: "+rola+", adresIP: "+adresIP);
    }

    public void zmienHaslo(String nowe_haslo){
        haslo = nowe_haslo;
        System.out.println("Hasło użytkownika "+login+" zostało zmienione");
    }

    public static void main(String[] args) {
        Uzytkownik u1 = new Uzytkownik("jakub433", "1234", Rola.ADMIN, new AdresIP("192.168.0.1", "255.255.255.0"));
        Uzytkownik u2 = new Uzytkownik("izka67", "9876", Rola.OPERATOR, new AdresIP("192.168.0.2", "255.255.255.0"));
        Uzytkownik u3 = new Uzytkownik("wojtek211", "9090", Rola.GUEST, new AdresIP("192.168.0.3", "255.255.255.0"));

        u2.zmienHaslo("4141");
        u1.wyswietlDane();
        u2.wyswietlDane();
        u3.wyswietlDane();

    }
}
