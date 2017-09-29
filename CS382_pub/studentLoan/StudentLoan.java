/**
 * 
 */

/**
 * Solution to StudentLoan problem
 * 
 * @author zeil
 *
 */
public class StudentLoan {

    
    
    /**
     * Compute length and total cost of a loan.
     *        
     * @param p principle of loan, in cents
     * @param interest annual interest rate
     * @param m monthly payment, in cents
     */
    private void computeLoan(long p, double interest, long m) {
	/* Insert your code here */
    }


    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println ("Usage: java StudentLoan principle interest payment");
            System.exit(1);
        }
        
        String principle = args[0];
        if (principle.contains(".")) {
            int k = principle.indexOf('.');
            principle = principle.substring(0, k) + principle.substring(k+1);
        } else
            principle = principle + "00";
        long p = Long.parseLong(principle);
        
        double interest = Double.parseDouble(args[1]);
        
        String payment = args[2];
        if (payment.contains(".")) {
            int k = payment.indexOf('.');
            payment = payment.substring(0, k) + payment.substring(k+1);
        } else
            payment = payment + "00";
        long m = Long.parseLong(payment);
        
        
        new StudentLoan().computeLoan(p, interest, m);
        

    }

}
