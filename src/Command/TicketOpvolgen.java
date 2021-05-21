package Command;

/**
 * @author Kimberley Hommes
 */
public class TicketOpvolgen implements TicketVerwerking{
    private Ticket ticket;

    public TicketOpvolgen(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void verwerken() {
        ticket.opvolgen();
    }
}
