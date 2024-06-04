import java.util.*;

public class P32_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] ar = new String[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter word : ");
            ar[i] = sc.nextLine();
        }

        int temp = rd.nextInt(n-1);
        String A = ar[temp];
        System.out.println("Random word : " + A);

        System.out.println("Enter anagram word : ");
        String B = sc.nextLine();

        Character[] AList = new Character[A.length()];
        Character[] BList = new Character[B.length()];

        for(int i=0;i<A.length();i++)
        {
            AList[i] = A.charAt(i);
        }

        for(int i=0;i<B.length();i++)
        {
            BList[i] = B.charAt(i);
        }

        Arrays.sort(AList);
        Arrays.sort(BList);

        A = "";
        B = "";

        for(int i=0;i<A.length();i++)
        {
            A += AList[i];
        }

        for(int i=0;i<B.length();i++)
        {
            B += BList[i];
        }

        if(A == B)
        {
            System.out.println("Given word is an anagram!!");
        }
        else
        {
            System.out.println("Given word is not an anagram!!");
        }


    }
}
