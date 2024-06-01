public class integertoroman  {
    public static String intToRoman(int num) {
        String[] hashmap = new String[]{"","I","IV","V","IX","X",
                "XL","L","XC","C","CD","D","CM","M"};
        int[] values = new int[]{0,1,4,5,9,10,40,50,90,100,400,500,
                900,1000};
        String ans ="";
        String strint = Integer.toString(num);
        int remaining = num;
        while(remaining!=0) {
            int power = (int) Math.pow(10, strint.length() - 1);
            int current = power * Integer.parseInt(strint.substring(0, 1));
            remaining -= current;
            strint = Integer.toString(remaining);

            int tempnumber = current;
            while (tempnumber != 0) {
                int ll = 0;
                int ul = values.length - 1;
                int number = 0;
                String character = " ";
                while (ll <= ul) {
                    int mid = ll + (ul - ll) / 2;
                    if (values[mid] <= tempnumber) {
                        number = values[mid];
                        character = hashmap[mid];
                        ll = mid + 1;
                    } else
                        ul = mid - 1;
                }
                tempnumber -= number;
                ans += character;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(intToRoman(x));
    }
}