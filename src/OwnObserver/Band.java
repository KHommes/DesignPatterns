package OwnObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kimberley Hommes
 */
public class Band {

    private List<Observer> observers = new ArrayList<>();

    private String bandName;
    private List<String> plannedConcerts = new ArrayList<>();

    public List<String> getPlannedConcerts() {
        return plannedConcerts;
    }

    public void addConcert (String concert) {
        plannedConcerts.add(concert);
        notifyAllObservers();
    }

    public void setPlannedConcerts(List<String> plannedConcerts) {
        this.plannedConcerts = plannedConcerts;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
        notifyAllObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
