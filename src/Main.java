public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Иванов", "Иван");
        Book book1 = new Book("Вавилон", 2006, author1);

        Author author2 = new Author("Петров", "Петр");
        Book book2 = new Book("Война и мир", 2019, author2);

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

    //hw1.10
        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("author1.equals(author2) = " + author1.equals(author2));
        System.out.println("author1 = " + author1);

        System.out.println("author1.hashCode() = " + author2.hashCode());
        System.out.println("author1.equals(author2) = " + author1.equals(author2));
        System.out.println("author1 = " + author2);

    }
}