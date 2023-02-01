/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xin Jie
 */
public class FinancialRecord {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    
    public FinancialRecord(){
        id=0;
        balance=0;
        annualInterestRate=0;
    }
    
    public FinancialRecord(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public int setId(int id){
        return this.id = id;
    }
    
    public double setBalance(double balance){
        return this.balance = balance;
    }
    
    public double setAnnualInterestRate(double rate){
        return annualInterestRate = rate;
    }
    
    public double getMonthlyInterestRate(){
        double monthlyInterestRate = annualInterestRate/12;
        return monthlyInterestRate;
    }
    
    public double withdraw(double amount){
        balance = (balance-amount);
        return balance;
    }
    
    public double deposit(double amount){
        balance = (balance+amount);
        return balance;
    }
    
    public void displayRecordInfo(){
        System.out.println("Financial record id is: " + id);
        System.out.println("Financial record balance is: RM" + balance);
        System.out.println("Annual interest rate is: " + annualInterestRate);
    }
        
}
