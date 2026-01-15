import java.util.regex.Pattern;

public class User {
    private String username;
    private String email;
    private int age;

    public User(String username, String email, int age){
        if(username.isEmpty()){
            throw new IllegalArgumentException("Username cannot be empty");
        }
        String emailRegex = "^(.+)@(.+)$";
        if (!Pattern.compile(emailRegex).matcher(email).matches()) {
            throw new IllegalArgumentException("Incorrect email format");
        }
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
