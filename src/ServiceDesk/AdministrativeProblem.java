package ServiceDesk;

/**
 * @author Kimberley Hommes
 */
public class AdministrativeProblem implements CustomerProblem{

    @Override
    public String considerProblem(int difficulty) {
        String message = "";
        switch (difficulty) {
            case 5:
                message = "Je wachtwoord is gereset.";
                break;
            case 6:
                message =  "Je adres is gewijzigd.";
                break;
            case 7:
                message =  "Je naam is aangepast.";
                break;
            case 8:
                message = "Je abonnement is aangepast";
                break;
        }
        return message;
    }
}
