/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Xin Jie
 */
public class Q2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = sc.nextInt();
        
        //calculate the sum
        int sum = 0;
        while(num!=0){
            sum+= (num%10);
            num = num/10;
        }
        
        //print
        System.out.println("The sum of the digits is " + sum);
    }
    
}
