public class Book_Test_01 {
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Harry Potter", "Rowling", 1500);
        Book b3 = new Book("Harry Potter", "Rowling", 1500);
        Book b4 = b3;

        Book[] b5 = new Book[3];

        b5[0] = new Book("Il codice da Vinci", "Down Brown", 700);
        b5[1] = new Book("Il codice da Vinci", "Down Brown", 700);
        b5[2] = new Book("Il codice da Vinci", "Down Brown", 700);

        /*
        *   Accessing directly the class variabe is not more available,
        *   so you have to use the suitable methods...
        *
        *   b1.title = "The Lord of the Rings";
        *   b1.author = "J. R. R. Tolkien";
        *   b1.n_pages = 2000;
        *
        *   System.out.println(b1.author + " " + b1.title + " " + b1.n_pages);
        *   System.out.println(b2.author + " " + b2.title + " " + b2.n_pages);
        */

        System.out.println("b1 author: " + b1.getAuthor());

        System.out.println("b2 == b3 ?"); // nope, 'cause they are different obj
        if(b2 == b3)
            System.out.println("true");
        else
            System.out.println("false");

        System.out.println("b3 == b4 ?"); // yep, 'cause b4 it's an alias for b3
        if(b3 == b4)
            System.out.println("true");
        else
            System.out.println("false");

        b1.location = "Great Britain"; // modify a static var of the class

        // locations are the same 'cause it's a static member of the class
        System.out.println("b1: " + b1.getLocation());
        System.out.println("b2: " + b2.getLocation());
        System.out.println("Book: " + Book.getLocation()); // look here...

        // cascade mode: return the reference of the instance
        // and we use it to call another method of the same
        System.out.println(b1.getAuthor() + " " + b1.setLocation("Rome").getLocation());

        System.out.println("year: " + Book.get_Year()); // return an Interger value
        System.out.println("b2: " + b2.print());

        Book_Scientific bs1 = new Book_Scientific();
        Book_Scientific sb2 = new Book_Scientific("Accademic", false);
        Book_Scientific sb3 = new Book_Scientific("Pietro", "Tesi",
                101, "Accademic", true);

        System.out.println("sb2 area: " + sb2.getArea());
        System.out.println("sb3: " + sb3.print());

        System.out.println(sb2 instanceof Book); // Is sb2 a Book?
        System.out.println(sb2 instanceof Book_Scientific); // Is sb2 a BookScientific?

        for(Book x : b5) System.out.println(x.getAuthor()); // for-each with obj
    }
}
