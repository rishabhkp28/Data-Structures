public class good_numbers {
    public int countGoodNumbers(long n) {
        long MOD = 1_000_000_007;
        long even = (n+1)/2;
        long odd = n/2;
        long first = pow(5,even,MOD)%MOD;
        long second = pow(4,odd,MOD)%MOD;
        long answer = (first*second)%MOD;
        return (int)answer;
    }
    // we need to define this method as we dont know that the power might exceed the limit
    public long pow(long x, long y, long MOD) {
        long result = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % MOD;
                y=y-1;
            }
            else
            {
                x = (x * x) % MOD;
                y /= 2;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        good_numbers obj = new good_numbers();
        System.out.println(obj.countGoodNumbers(1));
    }
}
