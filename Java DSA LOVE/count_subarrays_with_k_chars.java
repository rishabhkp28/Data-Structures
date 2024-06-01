import java.io.*;
import java.util.HashMap;
public class count_subarrays_with_k_chars {

        public static int most_k_chars(String s, int k)
        {
            if (s.length() == 0) {
                return 0;
            }
            HashMap<Character, Integer> map = new HashMap<>();
            int num = 0, left = 0;

            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i),
                        map.getOrDefault(s.charAt(i), 0) + 1);
                while (map.size() > k) {
                    map.put(s.charAt(left),
                            map.getOrDefault(s.charAt(left), 1) -1);
                    //last element hata dia;

                    if (map.get(s.charAt(left)) == 0) {
                        /* Now we are removing the elements from the front
                         jab tak hashmap me keys kam na hojaye it means the elements which are
                         getting removed are already present in the window

                         */
                        map.remove(s.charAt(left));
                    }
                    left++;
                }
                num += i - left + 1;
            }
            return num;
        }
        static int exact_k_chars(String s, int k)
        {
            return most_k_chars(s, k) - most_k_chars(s, k - 1);
        }

        public static void main(String[] args)
        {
            String s1 = "pqpqs";
            int k = 2;
            System.out.println("Total substrings with exactly "
                    + k + " distinct characters : "
                    + exact_k_chars(s1, k));

            String s2 = "aabab";
            k = 2;
            System.out.println("Total substrings with exactly "
                    + k + " distinct characters : "
                    + exact_k_chars(s2, k));
        }
    }

