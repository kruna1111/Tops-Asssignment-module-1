package TopsAssignment;

 

	
	class InsufficientBalanceException extends Exception {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InsufficientBalanceException(String message) {
	        super(message);
	    }
	}

	
	class BankAccount {
	    private int balance;

	    public BankAccount(int balance) {
	        this.balance = balance;
	    }

	   
	    public void withdraw(int amount) throws InsufficientBalanceException {
	        if (amount > balance) {
	            throw new InsufficientBalanceException("Insufficient balance to withdraw " + amount);
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        }
	    }
	}

	
	public class pro40 {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(500);
	        
	        try {
	            account.withdraw(600); 
	        } catch (InsufficientBalanceException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	        
	        try {
	            account.withdraw(300); 
	        } catch (InsufficientBalanceException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	}


