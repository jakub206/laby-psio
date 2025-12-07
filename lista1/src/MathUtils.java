public class MathUtils {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Silnia z " + n + " = " + silnia(n));

        int a = 25;
        int b = 90;
        System.out.println(a + " + " +  b + " = " + suma(a,b));

        double[] lista = {5, 3.14, 5.6, 20};
        System.out.println("Średnia z tablicy lista wynosi " + srednia(lista));

    }

    public static int silnia(int n) {
        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static double srednia(double[] tab) {
        double suma = 0;

        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }

        double wynik = suma / tab.length;
        return wynik;
    }
}
