package sections.section1a9.excercises;

import sections.section1a9.entities.Account;
import java.util.Scanner;

public class Bank {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Account account;

    System.out.print("Enter account number: ");
    int number = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter account holder: ");
    String holder = sc.nextLine();
    System.out.print("Is there na initial deposit (y/n)? ");
    char decision = sc.next().charAt(0);

    if (decision == 'y') {
      System.out.print("Enter initial deposit value: ");
      double initialDeposit = sc.nextDouble();
      account = new Account(number, holder, initialDeposit);
    } else {
      account = new Account(number, holder);
    }

    System.out.println();
    System.out.println("Account data:");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a deposit value: ");
    double amount = sc.nextDouble();
    account.deposit(amount);
    System.out.println("Updated account data:");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a withdraw value: ");
    amount = sc.nextDouble();
    account.withdraw(amount);
    System.out.println("Updated account data:");
    System.out.println(account);

    sc.close();
  }
}
