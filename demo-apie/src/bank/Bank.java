package bank;

public class Bank {
  private Account[] accounts; //放棄由account搵bank
//  private Transation[] transations;
//  private User[] users;
//  private double amount;
//  private double creditAccount;
//  private double debitAccount;

public Bank() {
  this.accounts = new Account[0];
//  this.transations = new Transation[0];
//  this.users = new User[0];
}
 public int noOfAccount() {
  return this.accounts.length;
 }

public void add(Account newAccount) {
  Account[] accounts = new Account[this.accounts.length + 1];
  for (int i = 0; i < this.accounts.length; i++) {
    accounts[i] = this.accounts[i];
  }
  accounts[accounts.length - 1] = newAccount;
  this.accounts = accounts;  
}

// Return Account by username
public Account findAccount(String username) {
  for (Account account : this.accounts) {
    if (account.getUserName().equals(username)) {
      return account;
    }
  }
  return null;
}



}
