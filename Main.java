public class Main {
    public static void main(String[] args) {
        Book test = new Book("Frankenstein", "Mary", "Shelley", 1816);
        System.out.println(test.getAuthor());
        System.out.println(test.getYear());
        System.out.println(test.getCallNumber());
    }
}