package OwnObserver;



/**
 * @author Kimberley Hommes
 */
public class Launcher {

    public static void main(String[] args) {

        Band waterboys = new Band();
        waterboys.setBandName("The Waterboys");

        new Fanclub(waterboys);
//        new Fanclub(waterboys);

        waterboys.addConcert("London");
        waterboys.addConcert("Waterloo");

        waterboys.setBandName("Mike Scott and the Waterboys");




    }
}
