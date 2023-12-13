         
           class HomeLoan extends Loan {
             public double calculateEMI(double principal) {
               int additionaltax = 200;
               double emi = super.calculateEMI(principal);      //calling super class method
               return emi + additionaltax;
             }
           }
            
          
