public class Book {
    public String title; // "private": just from the inside of the class
    public String author; // "protected: classes of same package and subclasses
    public int n_pages;
    private String isbn;

    static String location;
    static Integer year = Integer.valueOf(10);



    public Book() {
        // empty constructor
    }

    public Book(String title, String author, int n_pages) {
        this.title = title;
        this.author = author;
        this.n_pages = n_pages;
    }

    public Book(String title, String author, int n_pages, String isbn) {
        this(title, author, n_pages); // use "this" to call the other constr
        this.isbn = isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getLocation() { // static -> can access static var
        return "Location: " + location;
    }

    public Book setLocation(String location) { // return "this" instance
        Book.location = location;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getN_pages() {
        return n_pages;
    }

    public void setN_pages(int n_pages) {
        this.n_pages = n_pages;
    }

    public static int get_Year(){
        return year.intValue();
    }

    public String print(){
        return this.getAuthor() + " " + this.getTitle() + " " + this.getN_pages();
    }

    public boolean equals (Book other){
        return title == other.title && author == other.author && n_pages == other.n_pages;
    }
}