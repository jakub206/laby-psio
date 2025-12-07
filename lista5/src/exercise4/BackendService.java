package exercise4;

public class BackendService implements Deployable {

    @Override
    public void deploy(){
        System.out.println("Deploying BackendService...");
    }
}
