
package tutorialsample;


public class palidam {
    public static void main(String[] args)
    {
        int num=123;
        int sum =0;
        int r;
          int temp;
        temp = num;
        while (temp!=0)
        {
            r= temp%10;
            sum = sum*10+r;
                    temp = temp/10;
        }
        System.out.println("reverse = " +sum);
    }
}
