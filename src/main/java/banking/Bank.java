package banking;

import java.util.LinkedHashMap;
import java.util.Random;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	
	private static final long BASE_ACCOUNT_NUMBER = 200000L;
	
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		accounts = new LinkedHashMap<Long, Account>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return null;
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		Long accountNumber = accounts.keySet().size()+1L+BASE_ACCOUNT_NUMBER;
		Account account = new CommercialAccount(company, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber, account);
        return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		Long accountNumber = accounts.keySet().size()+1L+BASE_ACCOUNT_NUMBER;
		Account account = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber, account);
        return accountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
        return this.accounts.get(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
        return this.accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		this.accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
        return this.accounts.get(accountNumber).debitAccount(amount);
	}
}
