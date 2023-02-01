/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

/**
 *
 * @author Xin Jie
 */
public class Q5 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        int[][] ticTactoe = new int[3][3];
        
        //set TicTacToe
        for(int i=0; i<ticTactoe.length; i++){
            for(int j=0; j<ticTactoe.length; j++){
                ticTactoe[i][j] = rand.nextInt(2);
                System.out.print(ticTactoe[i][j]);
            }
            System.out.println("");
        }
        
        //check row
        int sum = 0;
        for(int i=0; i<ticTactoe.length; i++){
            for(int j=0; j<ticTactoe.length; j++)
                sum+= ticTactoe[i][j];
            if(sum==3)
                System.out.println("All 1s on row " + i);
            else if(sum==0)
                System.out.println("All 0s on row " + i);
            sum=0;
        }
        
        //check column
        int num = 0;
        for(int j=0; j<ticTactoe.length; j++){
            for(int i=0; i<ticTactoe.length; i++)
                num+= ticTactoe[i][j];
            if(num==3)
                System.out.println("All 1s on column " + j);
            else if(num==0)
                System.out.println("All 0s on column " + j);
            num=0;
        }
        
        //check diagonal
        int total = ticTactoe[0][0]+ticTactoe[1][1]+ticTactoe[2][2];
        if(total ==3){
            System.out.println("All 1s on left diagonal");
        }else if(total==0){
            System.out.println("All 0s on left diagonal");
        }
        
        int newtotal = ticTactoe[0][2]+ticTactoe[1][1]+ticTactoe[2][0];
        if(newtotal ==3){
            System.out.println("All 1s on right diagonal");
        }else if(newtotal==0){
            System.out.println("All 0s on right diagonal");
        }
    }
    
}
