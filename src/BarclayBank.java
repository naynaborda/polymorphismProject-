public class BarclayBank extends BankInterest {
    //no return type with no parameter
    //public void interest() {
    //    System.out.println(500 / 100 * 5);
   // }

    //noreturn type with parameter
    public void interest(int loanAmount, int a) {
        System.out.println(loanAmount / 100 * 5);
    }
}
