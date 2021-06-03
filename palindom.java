
package tutorialsample;

import java.util.Scanner;

public class palindom {
    public static void main(String[] args) {
        int r , sum = 0, temp , num ;

        Scanner input = new Scanner(System.in);
        System.out.println("enter any number prese :");
        num = input.nextInt();
        temp = num;
        while(temp != 0)
        {
            r = temp % 10;
            sum = sum * 10 + r ;
            temp = temp /10;
        }
        if ( num == sum)
        {
            System.out.println("This is palindom");
        }
        else 
        {
            System.out.println("This is not palindom");
        }
    }
}
