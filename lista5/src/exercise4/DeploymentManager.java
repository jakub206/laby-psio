package exercise4;

public class DeploymentManager {
    public static void runDeploymentManager(Deployable d) {
        System.out.println("Starting Deployment Manager");
        d.deploy();
        System.out.println("Finished Deployment Manager");
    }
}
