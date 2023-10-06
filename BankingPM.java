package Banking;

import Interface.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Bank PM manages bank project");
    }
}
