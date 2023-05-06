public class DVD extends Content{
    private int runtime; //how long the dvd is in minutes
    public DVD(String title) {
        super(title);
    }
    public void setRuntime(int minutes) {
        this.runtime = minutes;
    }

    public String getRuntime() {
        return runtime + "minutes";
    }
}
