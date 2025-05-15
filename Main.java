
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
     public static void main(String[] args) {
        NepalRastraBank nrb = new NepalRastraBank();

        Bank bank = new Bank();
        System.out.println("Bank ");
        nrb.printDetail(bank);

        Bank nicAsia = new NICAsiaBank(); 
        System.out.println("\nNIC Asia Bank ");
        nrb.printDetail(nicAsia);

        Bank nabil = new NabilBank(); 
        System.out.println("\nNabil Bank ");
        nrb.printDetail(nabil);
    }
}
