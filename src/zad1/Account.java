/*  @author Piwowarski Łukasz S18226
 *
 */

package zad1;

public class Account {
	   //przechowuje aktualny stan konta
	   private double balance;
	   //kwota aktualnego oprecentowania
	   private static double interest = 0;

	   //metoda umożliwia wpłate na konto
	   public void deposit(double amount) {
		   if(amount > 0 ) {
	      this.balance += amount;
		   }else {
			   System.out.println("Nieprawidłowe dane - wpłacana kwota musi być większa od zera. ");
		   }
	   }

	   //metoda umożliwia wypłąte środków z konta
	   public void withdraw(double amount) {
		   if(amount > 0 && amount <= balance) {
			   this.balance -= amount;
		   }else {
			   System.out.println("Nieprawidłowe dane - wypłacana kwota musi być większa od zera, oraz nie może być większa od stanu konta. ");
		   }
	     
	   }

	   //metoda umożliwia przelanie środków na inne konto
	   public void transfer(Account account, double amount) {
		   if(amount > 0 && amount < balance) {
	      this.balance -= amount;
	      account.setBalance(account.getBalance() + amount);
		   }else {
			   System.out.println("Nieprawidłowe dane - wypłacana kwota musi być większa od zera, oraz nie może być większa od stanu konta. ");
		   }
	   }

	   //ustawianie wysokosci oprecentowania
	   public static void setInterestRate(double quantity) {
	      interest += quantity;
	   }

	   //podwyższanie środków na koncie o stope oprocentowania
	   public void addInterest() {
	      double i = 1 + (interest / 100);
	      this.balance *= i;
	   }

	   public double getBalance() {
	      return balance;
	   }

	   public void setBalance(double balance) {
	      this.balance = balance;
	   }
	}
