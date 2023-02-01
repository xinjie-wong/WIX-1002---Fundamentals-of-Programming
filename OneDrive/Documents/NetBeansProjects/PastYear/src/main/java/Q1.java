/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Xin Jie
 */
public class Q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double num = sc.nextDouble();
        
        //convert to kg
        double kilograms = num * 0.454;
        
        //print
        System.out.println(num + " pounds is " + kilograms + " kilograms");
    }
}
