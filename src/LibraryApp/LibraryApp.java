package LibraryApp;

public class LibraryApp {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexander", "Pushkin");
        Author tolstoy = new Author("Lev", "Tolstoy");

        Book captainSDaughter = new Book("Captain's daughter", pushkin, 1836);
        Book warAndPeace = new Book("War and Peace", tolstoy, 1867);

        captainSDaughter.setPublicationYear(2044);

    }
}
