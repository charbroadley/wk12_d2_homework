public class Book {
    // Declared here for scope, like saying "make a space in memory for a string called this"
    // Private: can only be accessed in this class. Public: can directly access properties of it from another file.
    // Private means you have to access properties through getters and change using setters. Gives an added layer of control and security.
    private String name;
    private String author;
    private String genre;
    //

    // Constructor function (like __init__ in Python):
    public Book (String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }
}
