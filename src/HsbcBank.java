public class HsbcBank extends BankInterest{
    //child class of bank interest
    //no return type with no parameter
   // public void interest(){
    //    System.out.println(500/100*10);
    //}
    //noreturn type with parameter
    public void interest(int loanAmount){
        System.out.println(loanAmount/100*10);
    }
}
