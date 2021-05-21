package ServiceDesk;

/**
 * @author Kimberley Hommes
 */
public class TechnicalProblem implements CustomerProblem {


    @Override
    public String considerProblem(int difficulty) {
        return difficulty < 10 ? "Dit gaat naar de technische afdeling." : "Dit gaat naar de supertechnische afdeling.";
    }
}
