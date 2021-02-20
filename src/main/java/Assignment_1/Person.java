package Assignment_1;

import java.util.Objects;

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected String personalID;

    /**
     *
     * @param firstName First name of person
     * @param lastName Last name of person
     * @param personalID ID-Number of the person
     */
    public Person(String firstName, String lastName, String personalID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalID = personalID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalID() {
        return personalID;
    }

    public String getFullName(){
        return getLastName() + ", " + getFirstName();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personalID, person.personalID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalID);
    }
}
