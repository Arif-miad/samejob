
package tutorialsample;

import java.util.Scanner;


public class NewClass1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the prese any number:");
       int x = input.nextInt();
       int counte = 0;
        for (int i = 2; i < x; i++) {
            if (x%2==0)
            {
                counte++;
                
                break;
            }
           
            
            
        }
        if (counte == 0)
        {
            System.out.println("prime");
        }
        else 
        {
            System.out.println("not prime");
        }
    }
    
}
