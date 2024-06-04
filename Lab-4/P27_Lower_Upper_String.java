import java.util.Scanner;

public class P27_Lower_Upper_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str = sc.nextLine();
        String ans = "";

        for(int i=0;i<str.length();i++)
        {
            Character c = str.charAt(i);
            if(Character.isLowerCase(c))
            {
                ans += Character.toUpperCase(c);
            }
            else
            {
                ans += Character.toLowerCase(c);
            }
        }

        System.out.println("Modified String : " + ans);
    }
}
