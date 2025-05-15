/**
 * Write a description of class NabilBank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class NabilBank extends Bank
{
   public double getInterestrate(){
       return 9;
   }
   public void printSmsBankingStatus(){
       System.out.println("Sms banking has been enabled.");
   }
}
