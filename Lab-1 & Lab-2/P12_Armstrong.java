public class P12_Armstrong {

    public static void main(String[] args) {

        System.out.println("Armstrong numbes are : ");
        
        for(int i=1;i<=1000;i++)
        {
            String digits = String.valueOf(i);
            int power = digits.length();
            int total = 0;
            for (int j = 0; j < power; j++) {
                int digit = Character.getNumericValue(digits.charAt(j));
                total += Math.pow(digit, power);
            }

            if(total == i)
            {
                System.out.println(i);
            }
        }
    }
}