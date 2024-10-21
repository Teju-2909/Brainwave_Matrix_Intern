package Assignment;

import java.util.HashMap;
import java.util.Map;

class ATMService {
    private Map<String, Account> accounts;

    public ATMService() {
        accounts = new HashMap<>();
        accounts.put("123456", new Account("123456", "1234", 1000.0));
        accounts.put("56789", new Account("56789", "1234", 5000.0));
    }

    public boolean login(String accountNumber, String pin) {
        Account account = accounts.get(accountNumber);
        return account != null && account.getPin().equals(pin);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
