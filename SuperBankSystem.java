import Banking.BankingTeamFactory;
import Interface.Developer;
import Interface.ProjectManager;
import Interface.ProjectTeamFactory;
import Interface.Tester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writecode();
        tester.testCode();
        projectManager.manageProject();
    }
}
