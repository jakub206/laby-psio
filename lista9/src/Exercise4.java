import java.util.stream.StreamSupport;

public class Exercise4 {
    static void checkAge(int age) throws UnderageException {
        if(age<18){
            throw new UnderageException("Age under 18!");
        }
        System.out.println("Age correct (over 18)");
    }

    public static void main(String[] args) {

        try {
            System.out.println("Age: 18");
            checkAge(18);

            System.out.println("Age: 35");
            checkAge(35);

            System.out.println("Age: 14");
            checkAge(14);

        }catch(UnderageException e){
            System.out.println(e.getMessage());
        }

    }
}
