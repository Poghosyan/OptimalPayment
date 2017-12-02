import java.util.ArrayList;

public class LoanCalculator {
  public static void main(String args[]) {

    Loan loan = new Loan(21396.0, 0.0874);
    Double interest = 0.0;
    ArrayList<Result> results = new ArrayList<Result>();
    System.out.println("Starting the program");
    for (int i = 1; i <= 132; i += 4){
      int paymentsMade = 0;
      while (loan.getPrincipal() >= 0) {

        Double cycleInterest = loan.calculateInterest(1);
        interest += cycleInterest;
        loan.accrueInterest(cycleInterest);

        if(loan.getPrincipal() < i) {
          loan.payBalance(loan.getPrincipal());
        } else {
          loan.payBalance((double) i);
        }
        paymentsMade++;
        System.out.println(loan.getPrincipal());
      }

      results.add(new Result(interest, paymentsMade));
      System.out.println("Interest Accrued: " + interest);
      System.out.println("Payments made: " + paymentsMade);
      loan = new Loan(21396.0, 0.0874);
    }
  }
}
