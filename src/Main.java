public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Имя1", "Фамилия1");
        Book book1 = new Book("Название книги 1", 2006, author1);

        Author author2 = new Author("Имя2", "Фамилия2");
        Book book2 = new Book("Название книги 2", 2019, author2);

        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());
        System.out.println("book1.getName() = " + book1.getName());
        System.out.println("book1.getAuthor().getName() = " + book1.getAuthor().getName());
        System.out.println("book1.getAuthor().getSurname() = " + book1.getAuthor().getSurname());
        System.out.println("book1.getAuthor() = " + book1.getAuthor());

        System.out.println("book2.getYearOfPublication() = " + book2.getYearOfPublication());
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getAuthor().getName() = " + book2.getAuthor().getName());
        System.out.println("book2.getAuthor().getSurname() = " + book2.getAuthor().getSurname());

        book1.setYearOfPublication(2016);

        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());

    }
}