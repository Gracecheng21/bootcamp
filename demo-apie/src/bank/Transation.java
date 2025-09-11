package bank;

import java.time.LocalDate;
import java.time.LocalDateTime;

// ! Assume we have FUND TRANSER, Credit, Debit ONLY
public class Transation { // from account get transation || transation get account
  // attribute
  // private Bank (唔合理，由transation to bank)
  private static int idCounter = 0;
  private int id;
  private LocalDateTime tranDateTime;
  private int fromAccountId; // int accountId
  private int toAccountId;
  private double amount;


  // Construtor (初始設定)
  public Transation(int fromAccountId, int toAccountId, double amount) {
    this.id = ++idCounter;
    this.tranDateTime = LocalDateTime.now();
    this.fromAccountId = fromAccountId;
    this.toAccountId = toAccountId;
    this.amount = amount;
  }
}
