public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //hw1.10
    @Override
    public String toString() {
        return this.name + this.surname;
    }
    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        Author ob = (Author) obj;
        if (this == obj) return true;

        if (this.name.hashCode() == ob.hashCode()) return true;
        else return false;
    }

}
