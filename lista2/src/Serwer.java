import java.util.Random;
public class Serwer {

    String adresIP;
    String nazwa;
    Status status;
    int obciazenieCPU;
    double temperatura;
    Random random = new Random();

    public enum Status {
        ZATRZYMANY, WSTRZYMANY, DZIALA, AWARIA
    }

    public Serwer(String adresIP, String nazwa, Status status, int obciazenieCPU, double temperatura){
        this.adresIP = adresIP;
        this.nazwa = nazwa;
        this.status = status;
        this.obciazenieCPU = obciazenieCPU;
        this.temperatura = temperatura;
    }

    public void wyswietlStatus(){
        System.out.println("Status serwera "+nazwa+": "+status);
    }

    public void zwiekszObciazenie(int procent){
        if (status == Status.AWARIA){
            System.out.println("Nie można zwiększyć obciążenia serwera w stanie awarii!");
            return;
        }
        obciazenieCPU += procent;

        if  (obciazenieCPU > 100){
            obciazenieCPU = 100;
        }
        temperatura = temperatura + (double)procent/10*0.5;

        int losowa = random.nextInt(10);
        if (losowa == 5){
            status = Status.AWARIA;
        }
    }


    public static void main(String[] args) {
        Serwer s1 =  new Serwer("192.168.2.3", "sebus123", Status.DZIALA, 20,10.3);
        Serwer s2 =  new Serwer("192.168.4.4", "makinator55", Status.DZIALA, 45,36.6);

        s1.zwiekszObciazenie(30);
        s1.wyswietlStatus();
        System.out.println(s1.obciazenieCPU);
        s2.zwiekszObciazenie(10);
        s2.wyswietlStatus();
        System.out.println(s2.obciazenieCPU);

    }
}
