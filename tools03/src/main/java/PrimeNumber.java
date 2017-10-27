import java.util.Scanner;

import java.util.*;





public class PrimeNumber

{
    
    public static boolean isPrimeNumber(int input){
        
        int j = 2;
        
        int result = 0;
        
        boolean returnResult;
        
        while (j <= (input / 2))
            
        {
            
            if ( (input %j) == 0)
                
            {
                
                result = 1;
                
            }
            
            j++;
            
        }
        
        
        
        if (result==1)
            
        {
            
            returnResult= false;
            
        }
        
        else
            
        {
            
            returnResult= true;
            
        }
        
        
        
        return returnResult;
        
        
        
    }
    
    public static void main(String [] args){
        
        
        
        
        
        
        
        System.out.println("Prime Number Checker");
        
        
        
        
        
        Scanner sc = new Scanner(System.in);
        
        try
        
        {
            
            System.out.println("Please input an integer");
            
            
            
            int usrInput = 0;
            
            usrInput = sc.nextInt();
            
            
            
            boolean returnValue = isPrimeNumber(usrInput);
            
            
            
            if (returnValue)
                
            {
                
                System.out.println("This Integer is  a prime number");
                
            }
            
            else
                
            {
                
                System.out.println("This Integer is not a prime number");
                
            }
            
            
            
        }
        
        
        
        catch (InputMismatchException exception)
        
        {
            
            System.out.println("Not an integer");
            
        }
        
        
        
    }
    
    
    
}

