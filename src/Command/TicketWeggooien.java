package Command;

/**
 * @author Kimberley Hommes
 */
public class TicketWeggooien implements TicketVerwerking{
    private Ticket ticket;

    public TicketWeggooien(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void verwerken() {
        ticket.weggooien();
    }
}
