import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Kalkulator k =  new Kalkulator();
        System.out.println("25 + 90.3 = " + k.dodaj(25,90.3));
        System.out.println("103.18 - 3.14 = " + k.odejmij(103.18,3.14));
        System.out.println("3.14 * 7 = " + k.pomnoz(3.14,7));
        System.out.println("4.44 / 4 = " + k.podziel(4.44,4));
        System.out.println("");
        opis();
    }

    public  double dodaj(double a, double b){
        return a+b;
    }

    public double odejmij(double a, double b){
        return a-b;
    }

    public double pomnoz(double a, double b){
        return a*b;
    }

    public double podziel(double a, double b){
        return a/b;
    }

    public static void opis(){
        System.out.println("======== Kalkulator ========");
        System.out.println("==== Autor: Jakub Dłużak ====");
    }
}
