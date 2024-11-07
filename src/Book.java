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
    public String toString() {
        return bookName + ", " + " автор = " + nameAuthor + " опубликован = " + publicationYear;
}
@Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return nameAuthor.equals(nameAuthor);
}
@Override
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor);
}
}
