public class divide_two_integers { // many edge cases due to Integer.MIN_VALUE
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        else if (divisor == Integer.MIN_VALUE) {
            if (divisor == Integer.MIN_VALUE && dividend == Integer.MIN_VALUE)
                return 1;
            else
                return 0;
        } else if (dividend == Integer.MIN_VALUE) {
            int quotient = 1;
            int flag = 0;
            if (divisor > 0) flag = 1;
            divisor = (int) Math.abs(divisor);
            dividend = dividend + divisor;//MAKE THE DIVIDEND SMALLER
            dividend = (int) Math.abs(dividend);//NOW PERFORM AS NEEDED
            while (dividend >= divisor) {
                int i = 0;
                while (divisor * (long) Math.pow(2, i) <= dividend)
                    ++i;
                --i;
                quotient += (int) Math.pow(2, i);
                dividend -= (int) Math.pow(2, i) * divisor;

            }
            if (flag == 0)
                return quotient;
            else return quotient * -1;
        } else {
            int flag = 0;
            if (divisor * (long) dividend < 0)
                flag = 1;

            int quotient = 0;
            dividend = (int) Math.abs(dividend);
            divisor = (int) Math.abs(divisor);
            while (dividend >= divisor) {
                int i = 0;
                while (divisor * (long) Math.pow(2, i) <= dividend)
                    ++i;
                --i;
                quotient += (int) Math.pow(2, i);
                dividend -= (int) Math.pow(2, i) * divisor;

            }
            if (flag == 1)
                return quotient * -1;
            else
                return quotient;
        }
    }
    public static void main(String []args)
    {
        System.out.println(divide(2147483647,1));
    }
}
