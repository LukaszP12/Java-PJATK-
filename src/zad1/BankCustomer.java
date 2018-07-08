/*  @author Piwowarski Łukasz S18226
 *
 */

package zad1;

public class BankCustomer {
	   //obiekt klasy person
	   private Person person;
	   
	   // account powinno być w BankCustomer, ponieważ dopóki ktoś nie jest BankCustomerem, to nie ma konta 
	   private Account account;
	   
	   //konstruktor
	   public BankCustomer(Person person) {
		      this.person = person;
		      account = new Account();
		   }
	   //pobierania konta person
	   public Account getAccount() {
		      return account;
		   }

		   public void setAccount(Account account) {
		      this.account = account;
		   }
	   
	   //wyświetlanie info o kliencie banku
	   @Override
	   public String toString() {
	      return "Klient: " + this.person.getName() + " stan konta: " + this.getAccount().getBalance();
	   }
	}