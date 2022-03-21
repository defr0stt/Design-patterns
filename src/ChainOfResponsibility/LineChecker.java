package ChainOfResponsibility;


public class LineChecker {

    private ChainOfResponsibility chainOfResponsibility;
    private static LineChecker lineChecker;
    private LineChecker(){}

    public static LineChecker getInstance() {
        if(lineChecker == null){
            lineChecker = new LineChecker();
        }
        return lineChecker;
    }

    public boolean isRegular(String line){
        chainOfResponsibility = new CaseHandler();
        while (chainOfResponsibility != null){
            if(chainOfResponsibility.checkWordsCount(line))
                chainOfResponsibility = chainOfResponsibility.next();
            else {
                return false;
            }
        }
        return true;
    }
}
