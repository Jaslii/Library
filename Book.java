public class Book extends Content{
    private int pageCount;
    private String callNumber;
    //call number for where a book is located in a library follows format last name first initial year
    private int ISBN;
    private String authorFN; //author first name; used for call number
    private String authorLN; //author last name; used for call number
    public Book(String title, String authorFN, String authorLN, int year) {
        super(title);
        this.authorFN = authorFN;
        this.authorLN = authorLN;
        this.callNumber = authorLN + authorFN.charAt(0) + year;
        setYear(year);
    }

    //setters and getters
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public int ISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
