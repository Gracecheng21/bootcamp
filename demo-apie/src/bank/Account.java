package bank;

import java.math.BigDecimal;
import java.util.Objects;

public class Account { // Account getUserInfo, getTransations
  // Personl (hkid - UserInfo) / Company (brCode - CompanyInfo)
  private static int counter = 0;
  private int id;
  private double balance;
  private UserInfo userInfo; // 放棄用user搵account
  private Transation[] transations; // fund transfer -> transation

public Account(UserInfo userInfo) {
  this.id = ++counter;
  this.balance = 0.0;
  this.userInfo = userInfo;
  this.transations = new Transation[0];
}

// ! account -> userInfo
// because Account.class can be with method to check UserInfo.class
public boolean vaildatePassword(String inputtedPassword) {
  return this.userInfo.getPassword().equals(inputtedPassword);
}

public void addTransation(Transation newTransations) {
  Transation[] transations = new Transation[this.transations.length + 1];
  for (int i = 0; i < this.transations.length; i++) {
    transations[i] = this.transations[i];
  }
  transations[transations.length - 1] = newTransations;
  this.transations = transations;  
}

// Arrays.sort()
public Transation[] getTransations() {
  return this.transations;
}

public String getUserName() {
  return this.userInfo.getUserName();
}

 public int getId() {
  return this.id;
 }

 public double getBalance() {
  return this.balance;
 }

 public void credit(double amount) {
  if (amount <= 0)
  return;
  this.balance = BigDecimal.valueOf(this.balance) //
  .add(BigDecimal.valueOf(amount)) //
  .doubleValue();
  new Transation(this.id, -1, amount);
  this.addTransation(null);
 }

 public boolean debit(double amount) {
  if(amount <= 0)
  return false;
  this.balance -= amount;
  // Transation t = new Transation(this.id, -1, amount)
  // this.addTransation(t)
  // 合併成為一條code
  this.addTransation(new Transation(this.id, -1, amount));
  return true;
 }

 public boolean FundTransfer(Account toAccount, double amount) { // 假設已知Account
  if (amount <= 0 || !this.debit(amount) || toAccount == null) // amount < this.balance 唔需要用，下次已寫if
  return false;
//  this.balance -= amount; 直接用debit account
  toAccount.credit(amount);
  return true;
 }

 public static void main(String[] args) {
//  Account a1 = null; // error
//  a1.credit(100); // cannot found credit
// java.lang.NullPointerException
 }


 

// public boolean withdraw(double withdraw) {
//    if (withdraw > balance) return false;
//    BigDecimal bd = BigDecimal.valueOf(this.balance);
//    this.balance = bd.subtract(BigDecimal.valueOf(withdraw)).doubleValue();
//    return true;
// }


}
