public class Book {

    private final String name;
    private int yearOfPublication;
    private final Author author;

    public Book(String name, int yearOfPublication, Author author) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    //hw1.10
    @Override
    public String toString() {
        return this.name + this.yearOfPublication;
    }
    @Override
    public int hashCode() {
        return this.name.hashCode() + this.author.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        Author ob = (Author) obj;
        if (this == obj) return true;

        if (this.author.hashCode() == ob.hashCode()) return true;
        else return false;
    }
}

