
package tutorialsample;

import java.util.Scanner;


public class NewClass3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r , sum = 0, num , temp ;
        System.out.print("enter the any number : ");
        num = input.nextInt();
        temp = num;
        while (temp != 0)
        {
            r = temp%10;
            sum = sum * 10 + r ;
            temp = temp / 10 ;
        }
        System.out.println("Reverse = "+sum);
    }
}
