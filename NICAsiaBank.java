
/**
 * Write a description of class bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NICAsiaBank extends Bank
{
    public double getInterestRate(){
        return 8;
    }
    public void printMobileBankingStatus() {
        System.out.println("Moblie banking has been enabled.");
    }
}
