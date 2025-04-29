/**
 * Class representing a person with variables for name, birthday, ssn, and siblings.<br><br>
 * 
 * A person's siblings is represented in an array of Persons.
 * @author Richard Gao
 * @version 1.0.0
 */
public class Person {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    /**
     * Creates a Person instance with the specified name, birthday, and ssn.<br><br>
     * 
     * Number of siblings is initialized to 0 and siblings is initialized to an empty array.
     * @param firstName a String representing the first name of the person
     * @param lastName a String representing the last name of the person
     * @param birthDay an int representing the day of the birthday
     * @param birthMonth an int representing the month of the birthday
     * @param birthYear an int representing the  year of the birthday
     * @param ssn a String representing the person's ssn
     */
    public Person(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
    }

    /**
     * Gets the first name of the person.
     * @return a String representing the first name of the person
     */
    public String getFirstname() {
        return this.firstName;
    }

    /**
     * Gets the last name of the person.
     * @return a String representing the last name of the person
     */
    public String getLastname() {
        return this.lastName;
    }

    /**
     * Replaces the first name of the person with the new first name specified.
     * @param firstName a String representing the new first name of the person
     */
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Replaces the last name of the person with the new last name specified.
     * @param lastName a String representing the new last name of the person
     */
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the birthday of the person in a formatted String. The string will be formatted Day/Month/Year.
     * @return a String representing the person's birthday
     */
    public String getBirthday() {
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    /**
     * Adds a sibling to the person's list of siblings.<br><br>
     * 
     * This method expands the existing siblings array to add the new sibling.
     * @param newSibling a Person instance representing the new sibling
     */
    public void addSibling(Person newSibling) {
        Person[] expansion = new Person[this.numberOfSiblings + 1];
        for (int i = 0; i < this.siblings.length; i++) {
            expansion[i] = this.siblings[i];
        }
        expansion[this.numberOfSiblings] = newSibling;
        this.numberOfSiblings++;
        this.siblings = expansion;
    }

    /**
     * Gets the list of siblings of the person.
     * @return an array of Persons representing the list of siblings
     */
    public Person[] getSiblings() {
        return this.siblings;
    }
}