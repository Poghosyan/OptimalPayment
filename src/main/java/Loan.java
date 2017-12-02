public class Loan {

  private Double principal;
  private Double interest;

  public Loan(Double prncpl, Double intr) {
    principal = prncpl;
    interest = intr;
  }

  public Double calculateInterest(int days) {
    for(int i = 0; i < days; ++i) {
      principal += principal * (interest/365);
    }
    return principal;
  }

  public Double payBalance(Double payment) {
    return principal -= payment;
  }

  public Double accrueInterest(Double addedInterest) {
    return principal += addedInterest;
  }

  public Double getPrincipal() {
    return principal;
  }
}
