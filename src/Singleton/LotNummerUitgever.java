package Singleton;

/**
 * @author Kimberley Hommes
 */
public class LotNummerUitgever {
    // create an object of SingleObject
    private static LotNummerUitgever instance = new LotNummerUitgever();

    private int lotNummer = 0;
    //make the constructor private so that this class cannot be instantiated
    private LotNummerUitgever(){}

    //Get the only object available
    public static LotNummerUitgever getInstance() {
        return instance;
    }

    public void lotUigeven() {
        lotNummer++;
        System.out.println("Ik geef een lot uit: " + lotNummer);
    }
}