package WebSite;

import Interface.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writecode() {
        System.out.println("Php developer writes php code...");
    }
}
