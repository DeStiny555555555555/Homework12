public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String toString() {
        return firstName +  lastName;
    }
    @Override
    public boolean equals(Object name) {
        if (this.getClass() != name.getClass()) {
            return false;
        }
        Author c3 = (Author) name;
        return firstName.equals(firstName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }
}
