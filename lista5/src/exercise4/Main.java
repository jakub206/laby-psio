package exercise4;

public class Main {
    public static void main(String[] args) {
        BackendService backendService1 = new BackendService();
        DeploymentManager.runDeploymentManager(backendService1);

        System.out.println();

        FrontendApp frontendApp1 = new FrontendApp();
        DeploymentManager.runDeploymentManager(frontendApp1);

        System.out.println();

        FrontendApp frontendApp2 = new FrontendApp();
        DeploymentManager.runDeploymentManager(frontendApp2);
    }
}
