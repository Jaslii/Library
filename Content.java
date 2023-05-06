public abstract class Content { //partners: Jungsol Lee, Matthew Ryan, David Mason
    //abstract class for common code for all content that a library holds
    private String title;
    private String publisher;
    private int year;
    private String summary;

    public Content(String title) {
        this.title = title;
    }

    //getters and setters for the variables
    public String getTitle() {
        return title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSummary() {
        return summary;
    } //summary or description for piece of media

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
