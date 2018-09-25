 /*Alphabet or No*/
 
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Selcia3
{
	public static void main (String[] args) throws java.lang.Exception
	{
 
          char ch;
        Scanner scan = new Scanner(System.in);
         ch = scan.next().charAt(0);
 if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print( "No");
        }
    }
}
