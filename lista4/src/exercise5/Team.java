package exercise5;
import exercise1.Server;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Developer> devs;
    private List<Project> projects;

    public Team(String teamName) {
        this.teamName = teamName;
        this.devs = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public void addDeveloper(String name, String specialization, String level){
        Developer newDeveloper = new Developer(name, specialization, level);
        this.devs.add(newDeveloper);
    }

    public void addProject(String name, String technology, String deadline){
        Project newProject = new Project(name, technology, deadline);
        this.projects.add(newProject);
    }

    public void showTeamInfo(){
        System.out.println();
        System.out.println("Team Name: " + teamName);
        System.out.println("Developers ("+devs.size()+"):");
        if (devs.isEmpty()){
            System.out.println("No developers found");
        } else {
            for (Developer dev : devs){
                System.out.println("* "+dev);
            }
        }
        System.out.println("Projects ("+projects.size()+"):");
        if (projects.isEmpty()){
            System.out.println("No projects found");
        } else {
            for (Project project : projects){
                System.out.println("* "+project);
            }
        }
    }

    public static void main(String[] args) {
        Team t1 = new Team("Team 1");
        Team t2 = new Team("Team 2");

        t1.addDeveloper("Jakub", "Python", "senior");
        t1.addDeveloper("Wojtek", "Java", "junior");
        t1.addProject("TungGame", "Pygame", "12.2025");

        t2.addDeveloper("Bartek", "C#", "senior");
        t2.addProject("pocketGame", "C#", "02.2026");
        t2.addProject("filmWeb", "Java", "05.2026");

        t1.showTeamInfo();
        t2.showTeamInfo();
    }
}
