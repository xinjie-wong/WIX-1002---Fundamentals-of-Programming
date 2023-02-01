/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Xin Jie
 */
public class Q4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        double s = sc.nextDouble();
        
        //print output
        System.out.printf("The area is: %.2f squared meters.", area(n,s));
    }
    
    public static double area(int n, double s){
        double area = (n*s*s)/(4*Math.tan(Math.toRadians(180/n)));
        return area;
    }
    
}
