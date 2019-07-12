import java.util.Objects;

public class Emp {
    private String firstName;
    private String lastName;
    private String birth;

    public Emp(String firstName, String lastName, String birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(firstName, emp.firstName) &&
                Objects.equals(lastName, emp.lastName) &&
                Objects.equals(birth, emp.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birth);
    }
}
