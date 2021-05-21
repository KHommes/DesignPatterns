package OwnObserver;

/**
 * @author Kimberley Hommes
 */
public class Fanclub extends Observer{
    public Fanclub(Band band) {
        this.band = band;
        this.band.addObserver(this);
    }

    @Override
    public void update() {
        String message = "De fanclub stuurt een mail uit: " + band.getBandName() + " heeft de volgende concerten gepland:\n";

        for (String plannedConcert : band.getPlannedConcerts()) {
            message += String.format(plannedConcert + "\n");
        }

        System.out.println(message);
    }
}
