package Encapsulation;

/**
 * @author Kimberley Hommes
 */
public class Encapsulation {
// naam:
// probleem: je kan misbruik maken van het invoerveld
// uml onderdelen: access modifier / private field / public argument / parameter
// oplossing: private field / public set(argument) / public typefield get()
    public static void main(String[] args) {
        Overschrijving ov = new Overschrijving();
//        ov.bedrag = -50; // invoerveld
//        ov.overschrijven();
    }

}

class Overschrijving {
    private int bedrag;

    void overschrijven() {
        System.out.println("Bij mij gaat er " + bedrag + " af.");
        System.out.println("Bij jou komt er " + bedrag + " bij.");
    }

    public int getBedrag() {
        return bedrag;
    }

    public void setBedrag(int amount) {
        if (amount < 0) {
            System.out.println("dit is illegaal");
        } else {
            this.bedrag = amount;
        }
    }
}
