import java.util.*;
import java.lang.*;
import java.io.*;

 class Prime {

    public static void main(String[] args) {

        int num ;
        boolean flag = false;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("yes");
        else
            System.out.println( "no");
    }
}
