package exercise7;
import java.util.List;
import java.util.ArrayList;

public class WebApplication {
    private String name;
    private String version;
    private String status;
    private List<Module> modules;

    public WebApplication(String name, String version, String status) {
        this.name = name;
        this.version = version;
        this.status = status;
        this.modules = new ArrayList<>();
    }

    public void addModule(Module m) {
        modules.add(m);
    }

    public void assignDeveloperToModule(Module m, Developer d) {
        m.setDeveloper(d);
    }

    public void showModules(){
        System.out.println();
        System.out.println("Modules:");
        if (modules.isEmpty()) {
            System.out.println("No modules found");
        } else {
            for (Module m : modules) {
                System.out.println("* " + m);
                System.out.println("    - " + m.getDeveloper());
            }
        }
    }

    public static void main(String[] args) {
        WebApplication wa = new WebApplication("Web Application", "1.0.0", "Web Application");

        Module m1 = new Module("Payment","Paying with credit card", "2.0");
        Module m2 = new Module("Login","Login to the system", "1.5");
        Module m3 = new Module("Registration","Creating new account", "1.0");
        wa.addModule(m1);
        wa.addModule(m2);
        wa.addModule(m3);

        Developer d1 = new Developer("Jakub", "Backend Dev","OnlineStore");
        Developer d2 = new Developer("Wojtek", "Frontend Dev","OnlineStore");
        Developer d3 = new Developer("Bartek", "Backend Dev","OnlineStore");

        wa.assignDeveloperToModule(m1,d1);
        wa.assignDeveloperToModule(m2,d2);
        wa.assignDeveloperToModule(m3,d3);

        wa.showModules();
    }
}
