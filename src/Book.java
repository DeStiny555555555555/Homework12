public class Book {
    private String bookName;
    private Author nameAuthor;
    private  int publicationYear;

    public Book(String bookName, Author nameAuthor, int publicationYear) {
        this.bookName = bookName;
        this.nameAuthor = nameAuthor;
        this.publicationYear = publicationYear;
    }
    public String getBookName() {
        return this.bookName;
    }
    public Author getNameAuthor() {
        return this.nameAuthor;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
public void  setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
}
}
