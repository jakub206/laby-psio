public class Exercise3 {
    static int calculateAge(int birthYear) {
        if(birthYear > 2025) {
            throw new IllegalArgumentException("Birth year cannot be greater than 2025!");
        } else {
            return 2025 - birthYear;
        }
    }

    public static void main(String[] args) {

        try {
            System.out.println("2006");
            System.out.println("Age: "+calculateAge(2006));

            System.out.println("1933");
            System.out.println("Age: "+calculateAge(1933));

            System.out.println("2027");
            System.out.println("Age: "+calculateAge(2027));

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
