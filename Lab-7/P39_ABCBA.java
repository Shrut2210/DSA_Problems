import java.util.Stack;
import java.util.Scanner;
import java.io.*;

public class P39_ABCBA
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<Character>();

        int top = 1;
        stack.push('c');
        int i=0;
        char c = str.charAt(i);

        while(str.charAt(i) != 'c')
        {
            if(c == ' ')
            {
                System.out.print("Invalid String : ");
                return ; 
            }
            else
            {
                top++;
                stack.push(c);
            }

            i++;
            c = str.charAt(i);
        }

        i++;
        while(i < str.length())
        {
            c = str.charAt(i);

            char x = stack.pop();

            if(x == c)
            {
                top--;
            }
            else
            {
                System.out.print("Invalid String : ");
                return;
            }

            i++;
        }

        if(top == 1)
        {
            System.out.print("Valid String ");
        }
        else
        {
            System.out.print("Invalid String ");
        }
    }
}