package features.java21.patternmatching;

public class MainClassToDemonstrate {

    public static void main(String[] args) {
        Object book = new Book("pushpank", "java-test");
        switch (book){
            case Book(var name, var author) -> System.out.println(" I am a book" + name + author);
            case String s -> System.out.println(" I am a string");
            default -> throw new IllegalStateException("Unexpected value: " + book);
        }
        var bookDetails = new BookDetails(new Book("pushpank", "bookDetails text"), 2.5);
        switch (bookDetails){
            case BookDetails(var book1,  var amount) -> System.out.println("I am bookDetails" + book1 + " with " + amount);
        }
    }
}
