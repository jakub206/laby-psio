package exercise2;
import java.util.List;
import java.util.ArrayList;

public class AdminPanel {
    private List<UserAccount> usersList;

    public AdminPanel() {
        usersList = new ArrayList<>();
    }

    public void addUser(String login, String password) {
        for(UserAccount user : usersList){
            if(user.getLogin().equals(login)){
                System.out.println("User already exists");
                return;
            }
        }
        UserAccount user = new UserAccount(login, password);
        usersList.add(user);
    }

    public void blockUser(String login) {
        for  (UserAccount user : usersList) {
            if (user.getLogin().equals(login)) {
                user.setActivityStatus(false);
                System.out.println("User "+user.getLogin()+" blocked");
                return;
            }
        }
        System.out.println("User "+login+" not found!");
    }

    public void showUsers() {
        if (usersList.isEmpty()) {
            System.out.println("No users found!");
            return;
        }
        System.out.println();
        System.out.println("Users list:");
        for(UserAccount user : usersList) {
            System.out.println(user);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AdminPanel adminPanel = new AdminPanel();

        adminPanel.showUsers();

        adminPanel.addUser("jakub731", "Kubus123@");
        adminPanel.addUser("wojtek65", "Wojt4321");
        adminPanel.addUser("wojtek65", "Kot3456");
        adminPanel.addUser("bartus909", "beep333_");

        adminPanel.showUsers();

        adminPanel.blockUser("wojtek65");
        adminPanel.showUsers();
    }
}
