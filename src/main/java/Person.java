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
}
