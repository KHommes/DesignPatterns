package Facade;

/**
 * @author Kimberley Hommes
 */
public class Launcher { // uitwerking van Facade, met Bram gemaakt
    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();

        helpDesk.fixProblem();
        helpDesk.fixProblem();
        helpDesk.fixProblem();
        helpDesk.fixProblem();
        helpDesk.fixProblem();
        helpDesk.fixProblem();

    }
}
