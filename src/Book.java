public class Book {
    private final String bookName;
    private final Author author;
    private int publicationYear;
   public Book(String bookName, Author author, int publicationYear){
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getBookName(){
       return this.bookName;
    }
    public int getPublicationYear(){
       return this.publicationYear;
    }
    public Author getAuthor(){
       return this.author;
    }
    public void setPublicationYear(int publicationYear){
       this.publicationYear = publicationYear;
    }
    public String bookInfo(){
       return "Книга " + this.bookName + " Автор " + this.author.getFullName() + " Год публикаций " + this.publicationYear;
    }





}
