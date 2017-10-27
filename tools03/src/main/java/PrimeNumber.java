import java.util.Scanner;

import java.util.*;



public class PrimeNumber

{
    
    public static void main(String [] args){
        
        System.out.println("Prime Number Checker");
        
        Scanner sc = new Scanner(System.in);
        
        try
        
        {
            System.out.println("Please input an integer");
            
            int usrInput = 0;
            
            usrInput = sc.nextInt();
        
            System.out.println("Integer");
        }
        
        catch (InputMismatchException exception)
        
        {
            System.out.println("Not an integer");
            
        }
        
    }
    
}