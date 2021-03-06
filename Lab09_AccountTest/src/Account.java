//*******************************************************
// Account.java
// A bank account class with methods to deposit, withdraw,
// and check the balance.
//*******************************************************
public class Account{
private double balance;
private String name;
private long acctNum;
//----------------------------------------------
//Constructor -- initializes balance, owner, and account number
//----------------------------------------------
public Account(double initBal, String owner, long number){
balance = initBal;
name = owner;
acctNum = number;
}
//----------------------------------------------
//Constructor -- initializes balance and owner; generates random
//account number
//----------------------------------------------
public Account(double initBal, String owner){
balance = initBal;
name = owner;
acctNum = (int) (Math.random() * Integer.MAX_VALUE);
}
//----------------------------------------------
//Constructor -- initializes owner as given and balance to 0.
//Generates random account number
//----------------------------------------------
public Account(String owner){
balance = 0;
name = owner;
acctNum = (int) (Math.random() * Integer.MAX_VALUE);
}
//----------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
//----------------------------------------------
public void withdraw(double amount){
if (balance >= amount)
balance -= amount;
else
System.out.println("Insufficient funds");
}

public void withdraw(double amount, double fee){
if (balance >= amount){
balance -= amount;
balance -= fee;
}
else
System.out.println("Insufficient funds");
}
public void deposit(double amount){
balance += amount;
}
public double getBalance(){
return balance;
}
public double getAcctNumber(){
return acctNum;
}
public String toString(){
return "Name: " + name +
"\nAcct #: " + acctNum +
"\nBalance: " + balance;
}
}