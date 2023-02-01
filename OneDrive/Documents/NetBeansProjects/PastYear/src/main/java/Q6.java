/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xin Jie
 */
public class Q6 {
    
    public static void main(String[] args) {
        
        System.out.println("The information about financial record A is as follows:");
        FinancialRecord a = new FinancialRecord(1234, 10000.0);
        a.setAnnualInterestRate(7.77);
        a.displayRecordInfo();
        System.out.println("");
        
        System.out.println("The information about financial record B is as follows:");
        a.setAnnualInterestRate(8.0);
        a.setId(1001);
        a.setBalance(20000.0);
        a.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + a.getMonthlyInterestRate());
        System.out.println("Previous balance: " + a.getBalance());
        System.out.println("Current balance after deposit of RM1500.0 is: " + a.deposit(1500.0));
        System.out.println("Previous balance: " + a.getBalance());
        System.out.println("Current balance after withdrawal of RM500.0 is: " + a.withdraw(500.0));
    
    }
}
