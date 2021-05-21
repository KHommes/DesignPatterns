package Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kimberley Hommes
 */
public class TicketVerwerker {
    private List<TicketVerwerking> verwerkingLijst = new ArrayList<>();

    public void voegOpdrachtToe(TicketVerwerking tv) {
        verwerkingLijst.add(tv);
    }

    public void voerVerkingenUit() {
        for (TicketVerwerking tv : verwerkingLijst) {
            tv.verwerken();
        }
        verwerkingLijst.clear();
    }
}
