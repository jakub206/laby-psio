public class Exercise5 {

    static void methodA() throws UnderageException {
        System.out.println("methodA...");
        methodB();
    }

    static void methodB() throws UnderageException {
        System.out.println("methodB...");
        throw new UnderageException("Exception in methodB");
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        }
    }
}
