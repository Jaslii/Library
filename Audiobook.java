public class Audiobook extends Book{
    private int runTime;
    public Audiobook(String title, String authorFN, String authorLN, int year) {
        super(title, authorFN, authorLN, year);
    }

    public void setRunTime(int minutes) {
        this.runTime = minutes;
    }
}
