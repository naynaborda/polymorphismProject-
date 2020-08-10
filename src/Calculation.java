public class Calculation {
    public static void main(String[] args) {
        BankInterest bankInterest=new BankInterest();
        BankInterest bankInterest1=new BarclayBank();
        BankInterest bankInterest2=new HsbcBank();

        bankInterest.interest(500);
        bankInterest1.interest(500);
        bankInterest2.interest(500);
        BarclayBank barclayBank=new BarclayBank();
        HsbcBank hsbcBank=new HsbcBank();
        barclayBank.interest(500,2);
        hsbcBank.interest(500);

    }
}
