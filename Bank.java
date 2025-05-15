
/**
 * Write a description of class Bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bank
{
  public double getInterestRate(){
        return 6;
    }
    public double calculateInterest(int p,int t,int r){
        return(p*t*r)/100.0;
    }
    public double calculateInterest(int p,int t){
        return(p*t*getInterestRate())/100.0;
    }
}
