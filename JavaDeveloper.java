package Banking;

import Interface.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writecode() {
        System.out.println("Java developer writes bank code...");
    }
}
