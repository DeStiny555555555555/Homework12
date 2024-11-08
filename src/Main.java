public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        System.out.println(levTolstoi.getFirstName());
        System.out.println(levTolstoi.getLastName());

        Author ivanBunin = new Author("Иван", "Бунин");
        System.out.println(ivanBunin.getFirstName());
        System.out.println(ivanBunin.getLastName());

        Book voinaAndMir = new Book("Война и мир", levTolstoi, 1869);
        System.out.println(voinaAndMir.getBookName());
        System.out.println(voinaAndMir.getNameAuthor().getFirstName() + "" + voinaAndMir.getNameAuthor().getLastName());
        System.out.println(voinaAndMir.getPublicationYear());

        voinaAndMir.setPublicationYear(1870);
        System.out.println(voinaAndMir.getPublicationYear());

        Book peleval = new Book("Перевал", ivanBunin, 1892);
        System.out.println(peleval.getBookName());
        System.out.println(peleval.getNameAuthor().getFirstName() + "" + peleval.getNameAuthor().getLastName());

        peleval.setPublicationYear(1892);
        System.out.println(peleval.getPublicationYear());

        System.out.println(voinaAndMir);
        Author c = new Author("Лев", "Толстой");
        Author c2 = c;
        System.out.println(c.equals(c2));

        Book c3 = new Book("Перевал",ivanBunin,1892);
        Book c4 = c3;
        System.out.println(c3.equals(c4));
    }
}