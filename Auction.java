import Interface.Developer;
import Interface.ProjectManager;
import Interface.ProjectTeamFactory;
import Interface.Tester;
import WebSite.WebSiteTeamFactory;

public class Auction  {
    public static void main(String[] args){
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writecode();
        tester.testCode();
        projectManager.manageProject();
    }
}
