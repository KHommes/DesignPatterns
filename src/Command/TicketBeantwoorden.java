package Command;

/**
 * @author Kimberley Hommes
 */
public class TicketBeantwoorden implements TicketVerwerking{
    private Ticket ticket;

    public TicketBeantwoorden(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void verwerken() {
        ticket.beantwoorden();
    }
}
