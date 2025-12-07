import java.util.Scanner;

public class KonwerterTemperatur {
    public static void main(String[] args) {
        double t1 = 3.14;
        double t1InF = 37.652;
        double t2 = 100.4;
        double t2InC = 38;

        t1 = naFahrenheita(t1);
        if (t1 == t1InF) {
            System.out.println("Konwersja 1 wykonana poprawnie");
        }

        t2 = naCelsjusza(t2);
        if (t2 == t2InC) {
            System.out.println("Konwersja 2 wykonana poprawnie");
        }

        Scanner console = new Scanner(System.in);
        System.out.print("Podaj wartość temperatury, którą będziemy przeliczać: ");
        double t3 = console.nextDouble();

        double t3InF = naFahrenheita(t3);
        double t3InC = naCelsjusza(t3);

        System.out.println("");
        System.out.println("*******************************************");
        System.out.println("* wpisana * na celsjusza * na fahrenheita *");
        System.out.println("*******************************************");
        System.out.println("* " + t3 + " * " + t3InC + " * " + t3InF + " *");
        System.out.println("*******************************************");

    }

    public static double naFahrenheita(double celsjusz){
        return celsjusz*9/5+32;
    }

    public static double naCelsjusza(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
}
