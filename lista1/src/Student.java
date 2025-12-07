public class Student {
    String imie;
    String nazwisko;
    int numerIndeksu;
    static int liczbaStudentow = 0;

    public void przedstawSie(){
        System.out.println("Imie: "+ imie +", nazwisko: "+ nazwisko + ", numerIndeksu: "+ numerIndeksu);
    }

    public static int liczbaStudentow(){
        return liczbaStudentow;
    }

    public Student(String imie, String nazwisko, int numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        liczbaStudentow++;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Izabela","Nowak",345987);
        s1.przedstawSie();
        Student s2 = new Student("Bartek","Wysocki",679012);
        s2.przedstawSie();
        Student s3 = new Student("Wiktoria","Fiłka",611234);
        s3.przedstawSie();
        Student s4 = new Student("Wojtek","Kowalski",345987);
        s4.przedstawSie();

        System.out.println("Liczba studentów: " + liczbaStudentow());
    }
}
