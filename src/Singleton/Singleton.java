package Singleton;

/**
 * @author Kimberley Hommes
 */
public class Singleton { // uitwerking van Singleton, samen met Felix gemaakt
    // naam Singleton.Singleton
    // probleem: zorgen dat je van een bepaalde classificering maar 1 object kan hebben
    // (bijv het object dat nieuwe BSN's maakt, want je wil dat landelijk maar 1 object vanuit
    // de database kan kijken wat het volgende nummer is)
    // UML:
    // uitvoering:

    public static void main(String[] args) {
//        // Illegal construct:
//        // Compile Time Error: The constructor SingleObject() is not visible
//        // SingleObject object = new SingleObject();
//
//        // get the only object available
//        LotNummerUitgever object = LotNummerUitgever.getInstance();
//
//        // show the message
//        object.showMessage();

        LotNummerUitgever lnu1 = LotNummerUitgever.getInstance();
        LotNummerUitgever lnu2 = LotNummerUitgever.getInstance();

        System.out.println(lnu1);
        System.out.println(lnu2);

        lnu1.lotUigeven();
    }




}
