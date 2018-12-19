
import java.util.*;
import java.lang.*;
import java.io.*;
class SumNatural {

    public static void main(String[] args) {

        int num,sum=0;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println(sum);
    }
}
