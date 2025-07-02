package flyweightPattern.ChildPackage;

import java.time.LocalDate;
import java.util.HashSet;

public class Factory {
    private final HashSet<String> forenameSet = new HashSet<>();
    private final HashSet<String> surnameSet = new HashSet<>();
    private final HashSet<LocalDate> dobSet = new HashSet<>();
    Child getChild(String forename, String surname, LocalDate dob){
        forenameSet.add(forename);
        surnameSet.add(surname);
        dobSet.add(dob);
        return new Child(forename, surname, dob);
    }
    public void evaluate() {
        System.out.println("Forenames: " + forenameSet);
        System.out.println("Surnames: " + surnameSet);
        System.out.println("Dates of Birth: " + dobSet);
    }
}
