
package tutorialsample;

import java.util.Scanner;


public class NewClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp , sum = 0, r,num;
        System.out.print("enter the prese any numner:");
        num = input.nextInt();
        temp= num;
        while(temp!=0)
        {
            r= temp  % 10;
            sum = sum * 10 +r ;
            temp = temp / 10;
            
        }
        
        System.out.println("Reverse = " +sum);
    }
}
