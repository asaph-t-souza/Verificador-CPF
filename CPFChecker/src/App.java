import checker.CpfChecker;
import enumerators.StatesEnum;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(CpfChecker.checkNumberOfCharacters("12345678901"));
        System.out.println(CpfChecker.checkTaxRegion("08739588610",StatesEnum.MG));
    }
}
