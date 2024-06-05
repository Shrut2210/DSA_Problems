import java.util.*;
import java.util.Stack;

public class P48_Evaluation_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        int top = 0;
        int value = 0;

        for(int i=str.length()-1;i>=0;i--)
        {
            char temp = str.charAt(i);

            if(temp >= 48 && temp <= 57)
            {
                st.push(temp);
                top ++ ;
            }
            else
            {
                int val1 = (int)st.pop();
                int val2 = (int)st.pop();

                top -= 2;

                value = Operation(val1, val2, temp);
                st.push((char)(value + 48 ));
            }
        }

        System.out.println("Ans is = " + value);
    }

    public static int Operation(int val1, int val2, char ope) {

        val1 -= 48;
        val2 -= 48;

        switch(ope) {
            case '+' :
                return val1+val2;
            case '-' :
                return val1-val2;
            case '*' :
                return val1*val2;
            case '/' :
                return val1/val2;
            case '^' :
                return (int)Math.pow(val1,val2);
        }
        return 0;
    }
}
