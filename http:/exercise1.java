public class App {

    static boolean  iwillNotCheat = true;
    static boolean IwillWin  = true;

    public static void main(String[] args) throws Exception {
     
        // Precondition
        assert iwillNotCheat == true: "SORRY SIR PONIO!";

        enterCompetition();

        // Postcondition
        assert IwillWin == true: "OH MY!";
        
    }

    static void enterCompetition (){
        IwillWin = false;
       
    }
}
