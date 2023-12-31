public class LoanTester {
    public static void main(String[] args) {
        // Create 2 objects of Loan class using the default constructor
        Loan loan1 = new Loan(123, 456, 10000.0f, 12, 5.0f);
        Loan loan2 = new Loan(789, 101, 15000.0f, 24, 7.5f);

        // Create 2 objects of Loan class using parametrized constructor
        Loan loan3 = new Loan(111, 222, 20000.0f, 18, 6.0f);
        Loan loan4 = new Loan(333, 444, 12000.0f, 36, 8.0f);

        // Use getter methods and display the value of loanCounter for every instance
        System.out.println("Loan Counter for loan1: " + loan1.getLoanCounter());
        System.out.println("Loan Counter for loan2: " + loan2.getLoanCounter());
        System.out.println("Loan Counter for loan3: " + loan3.getLoanCounter());
        System.out.println("Loan Counter for loan4: " + loan4.getLoanCounter());
    }
}
