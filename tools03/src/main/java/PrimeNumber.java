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
            
            int j = 2;
            
            int result = 0;
            
            while (j <= (usrInput / 2))
                
            {
                
                if ( (usrInput %j) == 0)
                    
                {
                    
                    result = 1;
                    
                }
                
                j++;
                
            }
            
            
            
            if (result==1)
                
            {
                System.out.println("This integer is not a prime number");
                
            }
            
            else
                
            {
                
                System.out.println("This integer is a prime number");
                
            }
            
           
            
            
            
            
        }
        
        
        
        catch (InputMismatchException exception)
        
        {
            
            System.out.println("Not an integer");
            
        }
        
        
        
    }
    
    
    
}

