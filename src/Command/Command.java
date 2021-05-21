package Command;

/**
 * @author Kimberley Hommes
 */
public class Command { // uitwerking tegelijk met Felix gemaakt
    // probleem: buffer kunnen maken van opdrachten en die (langzamer) kunnen verwerken
    // aanpak
    // geprogrammeerd

    public static void main(String[] args) {
        TicketVerwerker tv = new TicketVerwerker();

        Ticket t1 = new Ticket("Piet");
        tv.voegOpdrachtToe(new TicketWeggooien(t1));

        Ticket t2 = new Ticket("Jan");
        tv.voegOpdrachtToe(new TicketBeantwoorden(t2));

        Ticket t3 = new Ticket("Corneel");
        tv.voegOpdrachtToe(new TicketOpvolgen(t3));

        tv.voerVerkingenUit();
    }
}
