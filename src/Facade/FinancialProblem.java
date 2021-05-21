package Facade;

/**
 * @author Kimberley Hommes
 */
public class FinancialProblem implements CustomerProblem{

    @Override
    public String considerProblem(int difficulty) {
       return "Dit gaat naar de financiele afdeling.";
    }
}
