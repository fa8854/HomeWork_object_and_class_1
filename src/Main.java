public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Алекс", "Кош");
        Author author2 = new Author("Лев", "Толстой");
        Book voinaMir = new Book("Война и мир", author2, 1911);
        Book greg = new Book("Глаз", author1, 2012);
        System.out.println(voinaMir.bookInfo());
        System.out.println(greg.bookInfo());

        voinaMir.setPublicationYear(2011);
        System.out.println(voinaMir.bookInfo());
        greg.setPublicationYear(2022);
        System.out.println(greg.bookInfo());
    }
}