package bank;

import java.util.Scanner;

public class DemoBank {
  // User can view bank account balance (class user: Attribute: String(account))
  // User can credit/ debit his own account (class account: double(balance))
  // User A fund transfer User B (procduce account transaction/history) ()
  // We have only One Bank, but many user (class user: String(name))
  // A new user comes to open a new bank account (class Bank: String(account))
  // The bank account has its own account number (class Bank: int(account no))
  public static void main(String[] args) {
    Bank hsbc = new Bank();
    hsbc.add(new Account(new UserInfo("john1234", "admin1234")));
    hsbc.add(new Account(new UserInfo("lucas999", "admin999")));
    System.out.println(hsbc.noOfAccount());
    System.out.println(hsbc.findAccount("lucas999").getBalance()); // 0.0
    // credit
    hsbc.findAccount("lucas999").credit(120);
    System.out.println(hsbc.findAccount("lucas999").getBalance()); // 120.0

    // Withdrawal (200)
    // Login (password)
    Scanner scanner = new Scanner(System.in);
    String accountUserName;
    String accountUserPassword;
    boolean isUserAccountVaild = false;
    boolean isUserPasswordVaild = false;
    boolean isFunctionValid = false;
    Account userAccount;
    do {
      // ! Step 1 double check by the boolean
      System.out.println("Please input your username");
      accountUserName = scanner.nextLine();
      if (!isUserAccountVaild) {
      userAccount = hsbc.findAccount(accountUserName);
      if (userAccount == null) { // ! checking if userAccount is poinitng to nothing
        System.out.println("User Account is no found.");
        continue;
      } 
      }
      // ! Step 2
      System.out.println("Please input your password.");
      accountUserPassword = scanner.nextLine();
      if (!userAccount.vaildatePassword(accountUserPassword)) {
        System.out.println("Password is incorrect");
        continue;
      } else {
      isUserPasswordVaild = true;
      }
      // ! Step 3
      // 2. Functions: Withdraw or Fund Transfer (Auto-logout after either transation)
      System.out.println(
          "Withdrawal or Fund Transfer ? Input 1 for Withdrawall; 2 for Fund Transfer.");
      String function = scanner.nextLine();
      int functionInteger = Integer.valueOf(function);
      if (functionInteger == 1) {
        System.out.println("Please input an amount:");
        String amount = scanner.nextLine();
        int amountToWithdraw = Integer.valueOf(amount);
        if (!userAccount.debit(amountToWithdraw)) { // 已重新修改userAccount.debit
          System.out.println("Insufficient balance");
          break;
        }
        System.out.println("Withdraw");
        isFunctionValid = true;
        break;
      } else if (functionInteger == 2) {
        System.out.println("Please input an account number for fund transfer:");
        String toAccountNumberStr = Integer.valueOf(toAccountNumberStr);
        Account tAccount = hsbc.findAccount(toAccountNum);
        if (toAccount == null) {
          System.out.println("Invaild account number.");
          continue;
        }
        System.out.println("Input the fund transfer amount");
        String amount = scanner.nextLine();
        int amountToTransfer = Integer.valueOf(amount);
        if (!userAccount.fundTransfer(toAccount, amountToTransfer)) {
        break;
      } else if (functionInteger == 3) {
        break;
      }
    } while (true);
      

     }
  }


}

