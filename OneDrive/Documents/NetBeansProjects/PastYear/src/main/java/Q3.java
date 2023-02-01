/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Xin Jie
 */
public class Q3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();
        
        //loop for pyramid
        for(int i=1; i<=num; i++){
            //print spacebar
            for(int j=(num-i); j>0; j--){
                System.out.print(" ");
            }
            //print left side
            for(int x=i; x>0;x--){
                System.out.print(x);
            }
            //print right side
            for(int y=2; y<=i&&(i!=1); y++){
                System.out.print(y);
            }
            System.out.println("");
        }
        
    }
    
}
