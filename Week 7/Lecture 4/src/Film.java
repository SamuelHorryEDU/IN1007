public class Film {
    private String title;
    private int releaseYear;
    private double duration;
    private int soldTickets;

    public Film(String title, int releaseYear, double duration) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.soldTickets = 0;
    }

    public void soldTickets(int numTickets) {
        this.soldTickets += numTickets;
    }

    public int getSoldTickets() {
        return this.soldTickets;
    }
}
