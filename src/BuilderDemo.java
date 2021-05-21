
import java.time.LocalDateTime;

// Builder
// Stapsgewijze opbouw van een object
public class BuilderDemo{
    public static void main(String[] args) {
        //    new MyBuilder("fred", 38);
        MyBuilder mb = MyBuilder.create();
        System.out.println(mb);
        mb = mb.withValue(45);

        System.out.println(mb);
        mb = mb.withNaam("Johan");
        System.out.println(mb);

        String test = MyBuilder.create()
                .withNaam("Joris")
                .toString();

        System.out.println(test);
        Boot b = new Boot();
        b.setSnelheid(34);
        b.setDiepte(4);

    }
}

class Boot{
    private int snelheid;
    private int diepte;
    public int getSnelheid() {
        return snelheid;
    }
    public void setSnelheid(int s) {
        snelheid = s;
    }
    public void setDiepte(int d) {
        diepte = d;
    }
}
class MyBuilder{
    private String naam;
    private int value;

    private MyBuilder() {}

    public static MyBuilder create() {
        return new MyBuilder();
    }
    public MyBuilder withValue(int waarde) {
        this.value = waarde;



        return this;
    }
    public MyBuilder withNaam(String naam) {
        this.naam = naam;
        return this;
    }
    public String toString() {
        return "MyBuilder: Naam:"+naam +" value:"+value;
    }
}



class Raam{

    private Raam() {}

    void ok() {
        Raam raam = new Raam();
    }

    Raam test() {
        return this;
    }

    static void statisch() {
        //    System.out.println(this);    // this kan hier niet
    }
}


class Pizza{
    int nummer;

    Pizza(int hetnummer){
        nummer = hetnummer;
    }
    void zomaar() {
        System.out.print("in zomaar"+ this.nummer);
        Oven o = new Oven();
        o.bakken(this);
    }

}
class Oven{
    void bakken(Pizza pizza) {
        System.out.println("bakken in oven"+pizza.nummer);
    }
}



