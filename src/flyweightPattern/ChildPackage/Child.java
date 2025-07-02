package flyweightPattern.ChildPackage;

import java.time.LocalDate;

public class Child {
    private final long id;
    private final String forename;
    private final String surname;
    private final LocalDate dob;

    public Child(String forename, String surname, LocalDate dob) {
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        id = (long) ((Long.MAX_VALUE * Math.random()) * (forename.hashCode() + surname.hashCode()) + dob.hashCode());
    }
}
