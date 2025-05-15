import java.util.Random;

/**
 * Write a description of class NepalRastraBank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NepalRastraBank
{
   public void printDetail(Bank bank) {
        Random rand = new Random();
        int p = rand.nextInt(900) + 100; 
        int t = rand.nextInt(5) + 1;     
        int r = rand.nextInt(5) + 5;     

        System.out.println("Interest (2 params): " + bank.calculateInterest(p, t));
        System.out.println("Interest (3 params): " + bank.calculateInterest(p, t, r));

        if (bank instanceof NICAsiaBank) {
            ((NICAsiaBank) bank).printMobileBankingStatus();
        } else if (bank instanceof NabilBank) {
            ((NabilBank) bank).printSmsBankingStatus();
        }
   }
}
