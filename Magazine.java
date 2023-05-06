public class Magazine extends Book{
    private int ISSN; //unique ID number for magazines
    public Magazine(String title, String author, String authorLN, int year) {
        super(title, author, authorLN, year);
    }

    public String getCallNumber() { //call number for magazines is just magazine
        return "MAGAZINE";
    }

    public void setISSN() {
        this.ISSN = ISSN;
    }

    public int getISSN() {
        return ISSN;
    }
}
