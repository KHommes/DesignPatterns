package Facade;

/**
 * @author Kimberley Hommes
 */
public class HelpDesk { //FACADE -> doorgeefluik naar ingewikkelde dingen
    private FinancialProblem financialProblem;
    private AdministrativeProblem administrativeProblem;
    private TechnicalProblem technicalProblem;
    // kun je in een lijst bijhouden
    // je zou ook al direct de links kunnen maken naar achterliggende afdeling

    public HelpDesk() {
        financialProblem = new FinancialProblem();
        administrativeProblem = new AdministrativeProblem();
        technicalProblem = new TechnicalProblem();
    }

    public void fixProblem() {
        int problem = determineProblem(); // simple random number generator

        System.out.println(problem);

        if (problem < 5) {
            considerFinancialProblem(problem);
        } else if ( problem < 9) {
            considerAdministrativeProblem(problem);
        } else {
            considerTechnicalProblem(problem);
        }
    }

    private void considerFinancialProblem(int difficulty) {
        System.out.println(financialProblem.considerProblem(difficulty));
    }

    private void considerAdministrativeProblem(int difficulty) {
        System.out.println(administrativeProblem.considerProblem(difficulty));
    }

    private void considerTechnicalProblem(int difficulty) {
        System.out.println(technicalProblem.considerProblem(difficulty));
    }

    private int determineProblem() {
        return (int) (Math.random() * 20) + 1;
    }
}
