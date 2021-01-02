public class Book_Scientific extends Book{
    String area;
    boolean proceeding = false;

    public Book_Scientific(){
        // empty constructor
    }

    public Book_Scientific(String area, boolean proceeding) {
        this.area = area;
        this.proceeding = proceeding;
    }

    public Book_Scientific(String title, String author, int n_pages, String area, boolean proceeding) {
        super(title, author, n_pages); // calling the super constructor from the ancient class
        this.area = area;
        this.proceeding = proceeding;
    }

    public Book_Scientific(String title, String author, int n_pages, String isbn, String area, boolean proceeding) {
        super(title, author, n_pages, isbn);
        this.area = area;
        this.proceeding = proceeding;
    }

    public void setArea(String area){ // sub method
        this.area = area;
    }

    public String getArea(){ // sub method
        return this.area;
    }

    public boolean getProceeding(){
        return this.proceeding;
    }

    @Override // special word to override super method
    public String print() {
        return super.print() + " " + this.getArea() + " " + this.getProceeding();
    }

    public final String upper_char(Book_Scientific other){ // "final: cannot be overridden"
        return "ciao";
    }
    
    public boolean equals (Book_Scientific other){
        return super.equals(other) && this.area == other.area;
        //return this.title == other.title && this.author == other.author && this.n_pages == other.n_pages;
    }
}
